package com.ncist.class5;
import java.util.*;
public class MethodOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a + "=" + getPrime(a));//调用提取素数方法
    }
    //提取素数方法定义
    public static String getPrime(int n) {
        // 先判断是否为质数
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        // 如果是质数，直接返回
        if (isPrime) {
            return "" + n;
        }
        // 否则进行质因数分解
        String result = "";
        for (int i = 2; i <= n; i++) {//从2开始，依次判断是否为n的质因数
            while (n % i == 0) {
                result += i;
                n /= i;
                if (n > 1) {
                    result += "x";//将质因数用x连接起来
                }
            }
        }
        return result;
    }
}

