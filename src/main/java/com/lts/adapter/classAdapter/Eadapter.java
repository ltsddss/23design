package com.lts.adapter.classAdapter;

//  电压适配器，输出5V电压
public class Eadapter extends E220V implements E5V{

    @Override
    public int get5voutput() {
//        获取220V电压
        int sou=getOutput();

        int dis=sou/44;
        return dis;
    }
}
