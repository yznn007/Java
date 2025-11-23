package com.ncist.class7.MyPoint;

class MyPoint {
    private double x;
    private double y;
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("(" + x + "," + y + ")");
    }
    public String getInfo()
    {
        return "(" + x + "," + y + ")";
    }
}
public class Test {
    public static void main(String[] args) 	{
        MyPoint point;
        for (int i=0;i<5;i++ ){
            point = new MyPoint(i*10.0,20.0);
            point.display();
        }
    }
}
