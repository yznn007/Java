package com.ncist.class8.LineAndCircle;

class MyPoint {
    private double x;
    private double y;
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void display() {
        System.out.println("(" + x + "," + y + ")");
    }
    
    public String getInfo() {
        return "(" + x + "," + y + ")";
    }
    
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
    
    public double getDistance(MyPoint p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
    
    // Getter and Setter methods
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
}

class LineSeg {
    private MyPoint start;
    private MyPoint end;
    
    public LineSeg(MyPoint start, MyPoint end) {
        this.start = start;
        this.end = end;
    }
    
    public boolean intersection(LineSeg line) {
        MyPoint a = this.start;
        MyPoint b = this.end;
        MyPoint c = line.start;
        MyPoint d = line.end;

        // 快速排斥：以线段 a-b 和 c-d 为对角线的矩形是否重叠
        if (Math.max(a.getX(), b.getX()) < Math.min(c.getX(), d.getX()) ||
            Math.max(c.getX(), d.getX()) < Math.min(a.getX(), b.getX()) ||
            Math.max(a.getY(), b.getY()) < Math.min(c.getY(), d.getY()) ||
            Math.max(c.getY(), d.getY()) < Math.min(a.getY(), b.getY())) {
            return false;          // 矩形无重叠，必不相交
        }

        // 跨立实验：判断 a-b 是否跨立 c-d，同时 c-d 是否跨立 a-b
        double abc = cross(a, b, c);
        double abd = cross(a, b, d);
        double cda = cross(c, d, a);
        double cdb = cross(c, d, b);

        // 端点落在另一条线段上的情况需要特殊处理，保证"跨立"符号相反或等于 0
        if (abc * abd > 0 || cda * cdb > 0) {
            return false;          // 同号，未跨立
        }
        return true;               // 跨立且矩形重叠，必相交
    }
    
    private static double cross(MyPoint p, MyPoint q, MyPoint r) {
        return (q.getX() - p.getX()) * (r.getY() - p.getY()) - (q.getY() - p.getY()) * (r.getX() - p.getX());
    }
    
    public void display() {
        System.out.println(start.getInfo() + "---" + end.getInfo());
    }
    
    public double getDistance(MyPoint p) {
        // 计算点到线段的距离
        double x0 = p.getX(), y0 = p.getY();
        double x1 = start.getX(), y1 = start.getY();
        double x2 = end.getX(), y2 = end.getY();
        
        // 线段长度的平方
        double l2 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        
        if (l2 == 0) {
            // 线段退化为点
            return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
        }
        
        // 计算投影参数 t
        double t = ((x0 - x1) * (x2 - x1) + (y0 - y1) * (y2 - y1)) / l2;
        
        // 限制 t 在 [0,1] 范围内
        t = Math.max(0, Math.min(1, t));
        
        // 计算投影点坐标
        double projX = x1 + t * (x2 - x1);
        double projY = y1 + t * (y2 - y1);
        
        // 返回点到投影点的距离
        return Math.sqrt((x0 - projX) * (x0 - projX) + (y0 - projY) * (y0 - projY));
    }

    public MyPoint getStart() {
        return start;
    }
    
    public void setStart(MyPoint start) {
        this.start = start;
    }
    
    public MyPoint getEnd() {
        return end;
    }
    
    public void setEnd(MyPoint end) {
        this.end = end;
    }
}

class MyCircle {
    private MyPoint center;
    private double radius;
    
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    public void display() {
        System.out.println("Circle Center:" + center.getInfo() + ",radius=" + radius + ",Area=" + getArea());
    }
    
    public boolean intersection(LineSeg line) {
        // 计算线段到圆心的距离
        double distance = line.getDistance(center);

        // 如果距离小于等于半径，则相交
        return distance <= radius;
    }
    
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }
    
    // Getter and Setter methods
    public MyPoint getCenter() {
        return center;
    }
    
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Test {
    public static void main(String[] args) {
        double r = 50;
        MyPoint center = new MyPoint(100, 100);
        MyCircle circle = new MyCircle(center, r);
        
        LineSeg line1 = new LineSeg(new MyPoint(0, 100), new MyPoint(100, 200));
        LineSeg line2 = new LineSeg(new MyPoint(0, 0), new MyPoint(100, 100));
        
        line1.display();
        circle.display();
        System.out.println("line1&circle intersection: " + circle.intersection(line1));
        System.out.println("---------------------------");
        
        line2.display();
        circle.display();
        System.out.println("line2&circle intersection: " + circle.intersection(line2));
        System.out.println("---------------------------");
        
        while (circle.intersection(line2)) {
            circle.move(10, 10);
            circle.getCenter().display();
        }
        
        circle.display();
        System.out.println("line2&newCircle intersection: " + circle.intersection(line2));
        System.out.println("---------------------------");
    }
}
