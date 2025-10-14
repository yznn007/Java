package com.ncist.class4;

import java.util.Scanner;

public class Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0;i<10;i++) arr[i] = sc.nextInt();
        sort(arr);
    }
    private static void sort(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j]) swap(arr,i,j);
            }
        }
        System.out.print(arr[0]);
        for(int num = 1;num < arr.length;num++)
        {
            System.out.print("," + arr[num]);
        }
    }

    private static void swap(int arr[],int i,int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}
