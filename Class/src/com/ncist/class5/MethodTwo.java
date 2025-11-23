package com.ncist.class5;
import java.util.*;

public class MethodTwo {
    public static void main(String[] args) {
        int arr[]= {3,5,7,8,10,12,35,37,4583,8457};
        findPrime(arr);
    }
    public static void findPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(arr[i]);
            }
        }
    }
}
