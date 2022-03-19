package com.lts.adapter.objAdapter;

//  表示输出220V的电压
public class E220V {
    private static int output=220;

//    获取电压
    public int getOutput(){
        System.out.println("电压为220V");
        return output;
    }
}
