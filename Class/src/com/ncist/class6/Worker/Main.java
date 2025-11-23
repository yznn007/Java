package com.ncist.class6.homework;

class Worker {
    String name;
    int age;
    double salary;
    String level;
    public Worker(){}

}
class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.name = "Worker Zhang";
        w1.age = 28;
        w1.salary = 8888.0;
        w1.level = "SeniorEngineer";
        System.out.println("姓名：" + w1.name);
    }
 }