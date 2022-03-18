package com.lts.Singleton.lanjiazai;

import javax.jws.soap.SOAPBinding;

//    懒汉模式，调用的时候再创建对象
public class User {
//  先不创建对象
    private static User user;

    //    方法定义为私有，不可通过new来创建对象
    private User() {
        synchronized (User.class){
            if(user!=null){
                throw new RuntimeException("不要试图用反射来破坏对象");
            }
        }
    }
//    唯一获取对象的方式(调用方法时创建,且是静态的)(双重检测锁模式，第一次判断是为了避免其他的线程执行加锁操作)
    public static User getInstance(){
        if(user==null){
            synchronized (User.class){
                user=new User();
            }
        }
        return user;
    }
    public void Hello(){
        System.out.println("我是懒汉模式，线程不安全");
    }

}
