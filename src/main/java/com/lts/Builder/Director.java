package com.lts.Builder;

/**
 * 具体指挥者，指挥工人建造对象
 */
public class Director {
    //  指挥建造对象
    private Builder builder;

//    构造构造器获取Builder
    public Director(Builder builder){
        this.builder=builder;
    }

//    指挥具体构造过程
    public Product getProduct(){
        builder.partA();
        builder.partB();
        builder.partC();
        return builder.getproduct();
    }
}
