package com.ncist.class6.Worker;

class Worker {
    String name;
    int age;
    double salary;
    String level;
}
public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name = "Test Zhang";
        w1.age = 28;
        w1.salary = 8888.0;
        w1.level = "SeniorEngineer";
        System.out.println("name:" + w1.name);
        System.out.println("age:" + w1.age);
        System.out.println("salary:" + w1.salary);
        System.out.println("level:" + w1.level);
    }
 }