package com.ncist.class4;
import java.util.*;
public class PrimeNumber1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean isPrime(int num)
    {
        if(num == 2) return true;
        if(num < 2 || num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5;i <= Math.sqrt(num);i+=6)
        {
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    }
}