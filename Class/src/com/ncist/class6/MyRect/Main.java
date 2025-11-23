package com.ncist.class6.MyRect;
import java.util.*;
class Rect {
    double side1;
    double side2;
    public double getArea() {
        return side1 * side2;
    }
    public double getPerimeter() {
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
    }
}
