package com.ncist.class9.SameCenterCircle;

class SameCenterCircle
{
    static double x;
    static double y;
    private double r;
    public SameCenterCircle(double r)
    {
        this.r = r;
    }
    public void display()
    {
        System.out.println("[" + x + "," + y + "]"+",radius="+r+",area="+3.14*r*r);
    }
    public static double getArea(double r)
    {
        return 3.14*r*r;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        SameCenterCircle.x=3;SameCenterCircle.y=4;
        SameCenterCircle c1 = new SameCenterCircle(10);
        SameCenterCircle c2 = new SameCenterCircle(100);
        c1.display();
        c2.display();
        SameCenterCircle.x=5;SameCenterCircle.y=6;
        c1.display();
        c2.display();
        System.out.println(SameCenterCircle.getArea(5));
    }
}
