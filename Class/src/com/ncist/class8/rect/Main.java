package com.ncist.class8.rect;

import java.util.Scanner;
class Rect {
    double side1;
    double side2;
    public double getArea() {
        return side1 * side2;
    }
    public static double getArea(double side1, double side2) {
        return side1 * side2;
    }
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }
    public static double getPerimeter(double side1, double side2) {
        return (side1 + side2) * 2;
    }
 }

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        Rect r = new Rect();

        r.side1 = sin.nextDouble();
        r.side2 = sin.nextDouble();

        System.out.println("area is:" + r.getArea());
        System.out.println("perimeter is:" + r.getPerimeter());
        System.out.println(Rect.getArea(3,5));
        System.out.println(Rect.getPerimeter(3,5));
    }
}
