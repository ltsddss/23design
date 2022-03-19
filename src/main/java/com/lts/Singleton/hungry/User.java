package com.lts.Singleton.hungry;

//  使用预加载来创建对象，即在类加载的时候就创建对象，这样的话就不会有线程的安全问题
public class User {
    private static User user=new User();

    private User(){

    }

//    获取实例化对象
    public static User getInstance(){
        return user;
    }

    public void Hello(){
        System.out.println("我是预加载的对象");
    }
}
