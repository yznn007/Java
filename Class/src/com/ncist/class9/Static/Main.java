package com.ncist.class9.Static;
class Student
{
    static String year;
    String name;
    int age;
    Student(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println(name + " started school in " + year);
    }
    static void setYear(String year)
    {
        Student.year = year;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student.setYear("2020");
        s1.display();
        s2.display();
        Student.setYear("2024");
        s1.display();
        s2.display();
    }
}
