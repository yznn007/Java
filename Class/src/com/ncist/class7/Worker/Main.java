package com.ncist.class7.Worker;

class Worker {
    private String name;
    private int age;
    private double salary;
    private String level;
    public Worker() {}
    public Worker(String name, int age, double salary, String level) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.level = level;
    }
    public void display() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("salary=" + salary);
        System.out.println("level=" + level);

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setLevel(String level) {

        this.level = level;
    }
    public String getLevel() {

        return level;
    }

}
public class Main {
    public static void main(String[] args) {
        Worker wOne = new Worker();
        wOne.setName("Tom");
        wOne.setAge(20);
        wOne.setSalary(5000);
        wOne.setLevel("Junior");
        wOne.display();
        System.out.println("-----");

        Worker wTwo = new Worker("Jerry", 30, 9000, "MiddleRank");
        wTwo.display();
        wTwo.setSalary(10000);
        System.out.println("after modify,Work2 salary=" + wTwo.getSalary());
    }
}
