package com.lts.Factory.FactoryMethod;

public class factory {

    public user UserFactory(String type){

        user user=null;
        if(type.equals("user")){
            return user= new user();
        }
        else if(type.equals("student")){
            return user= new Student();
        }

        return user;
    }
}
