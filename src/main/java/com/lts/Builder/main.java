package com.lts.Builder;

//  获取产品的过程
public class main {
    public static void main(String[] args) {

//        创建建造对象
        Builder builder=new worker();

        Director director=new Director(builder);

        System.out.println(director.getProduct().toString());
    }
}
