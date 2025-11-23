package com.ncist.class7;
class Teacher {
    //name 属性是私有属性

    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Teacher(String name) {
        //使用this()方法调用上面有三个参数的构造方法，年龄age和工资salary都是0值
        this.name = name;
        this.age = 0;
        this.salary = 0;
    }
    //为name属性添加设置方法
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //为age属性添加获取方法
    public int getAge() {
        return this.age;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void display() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("salary=" + salary);
        System.out.println("-----------");
    }
}
public class Test {
    public static void main(String[] args) {
        Teacher zhang = new Teacher("Mr.Zhang", 40, 4580);
        Teacher wang = new Teacher("Mr.Li");
        zhang.display();
        wang.display();
        wang.setName("Mr.Wang");
        wang.setAge(35);
        System.out.println(wang.getAge());
    }
}

