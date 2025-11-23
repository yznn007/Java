package com.ncist.class6;

class Teacher {
    public String name;
    public int age;

    public Teacher(String n, int a) {
        name = n;
        age = a;
    }

    public Teacher() {

    }

    public void display() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
