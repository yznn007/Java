package com.ncist.class8.reload;
import java.util.Scanner;
class Worker
{
    public int way(int baodi, int gongshi, int danjia)
    {
        return baodi + gongshi * danjia;
    }
    public int way(int guding)
    {
        return guding*12;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baodi = sc.nextInt();
        int gongshi = sc.nextInt(); // 年工时
        int danjia = sc.nextInt(); // 单价
        int guding = sc.nextInt();// 月固定工资
        Worker worker = new Worker();
        System.out.println("way1:" + worker.way(baodi, gongshi, danjia));
        System.out.println("way2:" + worker.way(guding));
    }
}
