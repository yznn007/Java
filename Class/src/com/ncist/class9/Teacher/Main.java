package com.ncist.class9.Teacher;
class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name)
    {
        this(name, 0);
    }
    public Person()
    {
        this("null", 0);
    }

    public void display(){
        System.out.println("Name=" + name);
    }
}
class Teacher extends Person{
    private int money;

    public Teacher(String name, int age, int money){
        super(name, age);
        this.money = money;
    }
    public Teacher(String name)
    {
        super(name);
    }
    public Teacher()
    {
        super();
    }

    public void display(){
        super.display();
    }
}
public class Main {
}
