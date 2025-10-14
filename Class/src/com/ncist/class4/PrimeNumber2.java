package com.ncist.class4;

import java.util.Scanner;

public class PrimeNumber2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int count = 0;
        for(int i = 100; i < r;i++)
        {
            if(count == 5)
            {
                System.out.println();
                count = 0;
            }
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int num)
    {
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5;i <= Math.sqrt(num);i+=6)
        {
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    }

}
