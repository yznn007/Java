package com.ncist.class4;

import java.util.Scanner;

public class SixGrades {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] < min)
            {
                min = arr[i];
                minIndex = i;
            }
        }
        swap(arr, minIndex,arr.length-1);
        for(int num : arr) System.out.println(num);
    }
    private static void swap(int arr[],int a,int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
