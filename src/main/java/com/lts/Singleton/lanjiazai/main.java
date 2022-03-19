package com.lts.Singleton.lanjiazai;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /**
         * 1.会报错，因为构造器时私有的
         */

//        User user=new User();
        /**
         * 2.测试单例
         */
//        User user=User.getInstance();
//        User user1=User.getInstance();
////      两个对象的hash值相同，说明是同一个对象
//        System.out.println(user.hashCode()+"ccc"+user1.hashCode());
//
//        user.Hello();

        /**
         *3.但是这种模式的线程并不安全
         * 当存在多个线程同时创建对象的时候，由于懒加载时创建对象是有时间的，所有其他线程就可能创建出另外一个对象
         */

//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                User user2=User.getInstance();
//                System.out.println(Thread.currentThread().getName()+"ccc"+user2.hashCode());
//            }).start();
//        }

        /**
         * 4.如何保证线程的安全呢？加锁是一个很好的方法！
         * 在getInstance()方法上加上一把synchronized锁，这样就可以保证线程的安全性，当一个线程释放锁后其他线程才可以拿到锁
         * 此时就可以保证线程的安全性
         */
//        for (int i = 0; i < 10; i++) {
//            new Thread(()->{
//                User user2=User.getInstance();
//                System.out.println(Thread.currentThread().getName()+"ccc"+user2.hashCode());
//            }).start();
//        }
        /**
         * 5.但是我们知道，线程的获取锁和释放锁的过程在高并发的条件下是并不合适的，这会大大增加浪费的时间
         * 于是我们可以采用双重检测锁来解决这个问题(DCL懒汉式)
         */
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                User user2 = User.getInstance();
//                System.out.println(Thread.currentThread().getName() + "ccc" + user2.hashCode());
//            }).start();
//        }

        /**
         * 6.但是我们知道，java的反射可以通过获取字节码文件来新建对象，所以这样做也是不安全的
         */

//        User user=User.getInstance();
////        通过字节码文件获取构造器
//        Constructor<User> declaredConstructor = User.class.getDeclaredConstructor(null);
////      setAccessible可以临时改变私有变量的值，这样就可以将私有的构造器改为公共
//        declaredConstructor.setAccessible(true);
//
//        User user1 = declaredConstructor.newInstance();
//
//        System.out.println(user1.hashCode()+"ccc"+user.hashCode());

        /**
         * 7.但是如上所说，反射将构造器的属性改为public，但是我们也可以通过在构造器中判断当前对象是否存在来阻止反射创建对象
         */
//        User user=User.getInstance();
////        通过字节码文件获取构造器
//        Constructor<User> declaredConstructor = User.class.getDeclaredConstructor(null);
////        setAccessible可以临时改变私有变量的值，这样就可以将私有的构造器改为公共
//        declaredConstructor.setAccessible(true);
//        User user1 = declaredConstructor.newInstance();
//        System.out.println(user1.hashCode()+"ccc"+user.hashCode());

        /**
         * 8.但是这样还是有问题，在对象中我们使用了锁来锁住了class，但是我们可以不通过获得class来创建对象
         *
         */
        //通过字节码文件获取构造器
        Constructor<User> declaredConstructor = User.class.getDeclaredConstructor(null);
        //setAccessible可以临时改变私有变量的值，这样就可以将私有的构造器改为公共
        declaredConstructor.setAccessible(true);
        User user1 = declaredConstructor.newInstance();
        User user2 = declaredConstructor.newInstance();
        System.out.println(user1.hashCode()+"ccc"+user2.hashCode());

        /**
         * 9.解决方式是设置密钥，判断对象是否单一
         */
    }
}
