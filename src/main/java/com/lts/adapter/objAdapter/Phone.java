package com.lts.adapter.objAdapter;

//  手机类,行为是充电
public class Phone {

    public void charging(E5V e5V){
        if(e5V.get5voutput()==5){
            System.out.println("电压满足要求，可以充电");
        }
        else{
            System.out.println("电压太强，不可充电");
        }
    }
}
