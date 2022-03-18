package com.lts.Factory.SimpleFactory;

public class main {
    public static void main(String[] args) {
//        创建工厂类，传入参数
        UserFactory user=new UserFactory();

        user.creatFactory("学生").People();
    }
}
