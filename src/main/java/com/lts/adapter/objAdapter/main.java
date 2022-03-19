package com.lts.adapter.objAdapter;

//  给手机充电
public class main {
    public static void main(String[] args) {
        Phone phone=new Phone();

        E220V e220V=new E220V();

        phone.charging(new Eadapter(e220V));
    }
}
