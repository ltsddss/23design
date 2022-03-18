package com.lts.Factory.SimpleFactory;

public class UserFactory {
//    创建工厂类，传入具体参数获取对应的类
    public absortClass creatFactory(String type){
        absortClass user=null;
        if(type.equals("学生")){
            user=new Student();
        }
        else if(type.equals("老师")){
            user=new teacher();
        }

        return user;
    }
}
