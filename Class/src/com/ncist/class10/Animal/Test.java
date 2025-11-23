package com.ncist.class10.Animal;
class Food
{
    private int weight;
    public Food(int weight)
    {
        this.weight = weight;
    }
    public int getWeight()
    {
        return weight;
    }
}
class Bone extends Food
{
    public Bone(int weight)
    {
        super(weight);
    }
    public String toString()
    {
        return "Bone";
    }
}
class Fish extends Food
{
    public Fish(int weight)
    {
        super(weight);
    }
    public String toString()
    {
        return "Fish";
    }
}
class Animal
{
    public void eat(Food f)
    {
        System.out.println("It's time to eat "+f + ".");
    }
}
class Dog extends Animal
{
    public String toString()
    {
        return "Dog";
    }
    public void eat(Food b)
    {
        super.eat(b);
        System.out.println("Dog like "+b.toString());
    }
}
class Cat extends Animal
{
    public String toString()
    {
        return "Cat";
    }
    public void eat(Food f)
    {
        super.eat(f);
        System.out.println("Cat like "+f.toString());
    }
}
class Feeder
{
    private String name;
    public Feeder(String name)
    {
        this.name = name;
    }
    public void feed(Animal a, Food f)
    {
        a.eat(f);
        System.out.println("Feeder "+name+" feed "+a+ " with "+f.getWeight()+"g "+f+".");
    }
}
public class Test{

    public static void main(String[] args) {

        Feeder fd = new Feeder("Tom");

        Dog dog = new Dog();

        Bone bone = new Bone(500);

        fd.feed(dog, bone);

        System.out.println("-----------------");

        fd.feed(new Cat(), new Fish(100));

    }

}



