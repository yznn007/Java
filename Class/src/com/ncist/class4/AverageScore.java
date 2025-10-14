package com.ncist.class4;
import java.util.*;
public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        double[] score = new double[num];
        double sum = 0;
        for(int i = 0; i < num; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        double average = sum / num;
        int count = 0;
        for(int i = 0; i < num; i++)
        {
            if(score[i] > average)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
