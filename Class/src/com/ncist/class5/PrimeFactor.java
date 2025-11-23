package com.ncist.class5;
import java.util.*;

/**
 * PrimeFactor类用于计算并输出一个整数的质因数分解结果
 */
public class PrimeFactor
{
    /**
     * 程序入口函数，读取用户输入的整数并调用质因数分解函数进行处理
     * @param args 命令行参数数组
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPrimeFactor(num);
    }

    /**
     * 对给定的整数进行质因数分解并打印结果
     * @param n 待分解的正整数
     */
    public static void printPrimeFactor(int n)
    {
        System.out.print(n + "=");

        // 处理所有的因子2
        while(n % 2 == 0)
        {
            System.out.print("2");
            n /= 2;
            if(n >= 2) System.out.print("x");
        }

        // 处理所有的因子3
        while(n % 3 == 0)
        {
            System.out.print("3");
            n /= 3;
            if(n >= 3) System.out.print("x");
        }

        // 处理大于3的因子，使用6k±1的形式优化算法
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                System.out.print("x" + i);
                n /= i;
                if (n >= i) System.out.print("x");
            }
            while (n % (i + 2) == 0) {
                System.out.print("x" + (i + 2));
                n /= (i + 2);
                if (n >= i + 2) System.out.print("x");
            }
        }

        // 如果剩余的数大于2，则它本身就是一个质数因子
        if (n > 2) {
            System.out.print(n);
        }
    }
}

