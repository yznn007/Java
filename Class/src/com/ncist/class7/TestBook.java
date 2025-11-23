package com.ncist.class7;

public class TestBook {
}
class Book{
    private int id;  //编号
    private String name; //书名
    private double price; //价格
    private String author; //作者

    //构造方法
    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book()
    {
            
    }


    //置取方法
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }



    //display方法
    public String display() {
        return id+"\t"+name+"\t"+price+"\t"+author;
    }
}