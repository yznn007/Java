package com.ncist.class6;

class Circle {
    public double radius = 0;

    public Circle() {
        radius = 0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
