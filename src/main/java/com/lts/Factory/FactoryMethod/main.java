package com.lts.Factory.FactoryMethod;

//  简单工厂模式(返回学生类)
public class main {

    public static void main(String[] args) {
        factory userfactory=new factory();

        user u=userfactory.UserFactory("user");

        u.setName("lts");

        u.setUid(11);

        System.out.println(u);
    }




}
