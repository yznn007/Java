package com.ncist.class8.ConcentricCircles;

class MyPoint {
    double x;
    double y;
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("(" + x + "," + y + ")");
    }
}
class MyCircle {
    double x;
    double y;
    double r;
    public MyCircle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void display() {
        System.out.println("Circle Center:("+x+","+y+")"+",radius="+r+",Area="+3.14*r*r);
    }
}
class ConcentricCircles {
    MyPoint point;
    MyCircle[] circles;
    int n;
    public ConcentricCircles(int n, MyPoint point) {
        this.n = n;
        this.point = point;
        circles = new MyCircle[n];
    }
    public void createCircles(double[] radius) {
        for (int i=0;i<n;i++ ){
            circles[i] = new MyCircle(point.x,point.y,radius[i]);
        }
    }
    public void sort() {
        for (int i=0;i<n-1;i++ ){
            for (int j=i+1;j<n;j++ ){
                if (circles[i].r > circles[j].r) {
                    MyCircle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }
    public void display() {

        for (int i=0;i<n;i++ ){
            circles[i].display();
        }
    }
}
public class Test {
    public static void main(String[] args) {
        int size = 5;
        double[] radius = {10.0,5.0,7.0,9.0,15.0};
        MyPoint point;
        point = new MyPoint(10.0,20.0);
        for (int i=0;i<size;i++ ){
            System.out.println("radius "+i+": "+radius[i]);
        }
        ConcentricCircles cc = new ConcentricCircles(size, point);
        cc.createCircles(radius);
        cc.sort();
        cc.display();
    }
}
