package com.ncist.class5;

/**
 * 寻找数组中质数的程序
 * 该类提供了一个方法用于从整数数组中找出所有的质数并打印输出
 */
public class FindPrime
{
    /**
     * 程序入口点
     * 初始化一个测试数组并调用findPrime方法查找其中的质数
     * @param args 命令行参数
     */
    public static void main(String[] args)
    {
        int arr[]= {3,5,7,8,10,12,35,37,4583,8457};
        findPrime(arr);
    }

    /**
     * 查找数组中的质数并打印输出
     * 使用优化的质数判断算法，通过检查是否能被2、3以及6的倍数附近的数整除来判断
     * @param arr 待检查的整数数组
     */
    public static void findPrime(int[] arr)
    {
        // 遍历数组中的每个元素
        for (int i : arr) {
            boolean isPrime =  true;

            // 特殊处理数字3，直接判定为质数
            if (i == 3)
            {
                System.out.println(i);
                continue;
            }

            // 排除能被2或3整除的数（除了2和3本身）
            if(i % 2 == 0 || i % 3 == 0) continue;

            // 使用6k±1优化算法检查可能的因子
            // 所有大于3的质数都可以表示为6k±1的形式
            for (int j = 5; j <= Math.sqrt(i); j += 6) {
                if (i % j == 0 || i % (j + 2) == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            // 如果是质数则打印输出
            if(isPrime)System.out.println(i);
        }
    }
}

