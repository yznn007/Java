package com.ncist.class6.MobilePhone;


public class MobilePhone {
    String brand;
    String TelePhoneNum;
    int price;
    public MobilePhone(String b, String t, int p){
        brand = b;
        TelePhoneNum = t;
        price = p;
    }
    public void display(){
        System.out.println("brand:" +  brand);
        System.out.println("TelePhoneNum:" + TelePhoneNum);
        System.out.println("price:" + price);
    }
}
