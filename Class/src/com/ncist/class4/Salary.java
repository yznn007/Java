package com.ncist.class4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salary = new int[100];
        int count = 0;
        salary[0] = 0;
        for(int i = 1; sc.hasNextInt(); i++)
        {
            salary[i] = sc.nextInt();
            if(salary[i] > salary[0])
            {
                salary[0] = salary[i];
                count = i;
            }
        }
        System.out.println("No" + " " +count + " " + "salary maxsalary:" + salary[0]);
    }

}
