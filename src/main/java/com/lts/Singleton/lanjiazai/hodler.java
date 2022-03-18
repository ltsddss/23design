package com.lts.Singleton.lanjiazai;

//  使用静态内部类的方式来创建对象
public class hodler {

    private hodler() {
    }

    public static hodler getInstance(){
        return hodlers.HODLER;
    }

    public static class hodlers {
//        在静态内部类里面创建对象
        private static final hodler HODLER=new hodler();
    }

}
