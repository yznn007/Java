package com.ncist.class7.MyCircle;
class MyCircle {
    private double x;
    private double y;
    private double r;
    public MyCircle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void display() {
        System.out.println("Circle Center:("+x+","+y+")"+",radius="+r+",Area="+3.14*r*r);
    }
}
public class Test {
    public static void main(String[] args) {
        MyCircle circle;
        for (int i=0;i<5;i++ ){
            circle = new MyCircle(10.0,20.0,(i+1)*10);
            circle.display();
        }
    }
}
