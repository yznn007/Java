package com.ncist.class10.Person;

class Person
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name: " + name);
    }
}
class Teacher extends Person
{
    String professionalTitle;
    public Teacher(String name, String professionalTitle)
    {
        super(name);
        this.professionalTitle = professionalTitle;
    }
    public void display()
    {
        super.display();
        System.out.println("Professional Title: " + professionalTitle);
    }
}
class Student extends Person
{
    int studentNumber;
    public Student(String name, int studentNumber)
    {
        super(name);
        this.studentNumber = studentNumber;
    }
    public void display()
    {
        super.display();
        System.out.println("StudentNumber: " + studentNumber);
    }
}
class Undergraduate extends Student
{
    int grade;
    public Undergraduate(String name, int studentNumber, int grade)
    {
        super(name, studentNumber);
        this.grade = grade;
    }
    public void display()
    {
        super.display();
        System.out.println("Grade: " + grade);
    }
}
class Graduate extends Student
{
    String major;
    public Graduate(String name, int studentNumber, String major)
    {
        super(name, studentNumber);
        this.major = major;
    }
    public void display()
    {
        super.display();
        System.out.println("Major: " + major);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Person[] people = new Person[5];
        people[0] = new Person("Tom");
        people[1] = new Teacher("Kevin","professor");
        people[2] = new Student("Jerry",21);
        people[3] = new Undergraduate("John",22,3);
        people[4] = new Graduate("Mary",23,"computer");

        for (Person p: people)
        {
            p.display();
            System.out.println(">>>");
        }
    }
}
