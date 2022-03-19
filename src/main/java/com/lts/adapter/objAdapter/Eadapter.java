package com.lts.adapter.objAdapter;

//  电压适配器，输出5V电压
public class Eadapter implements E5V {

    private E220V e220V;

//    通过构造器来实现参数的传递
    public Eadapter(E220V e220V){
        this.e220V=e220V;
    }

    @Override
    public int get5voutput() {
//        获取220V电压
        int sou=e220V.getOutput();

        int dis=sou/44;
        return dis;
    }
}
