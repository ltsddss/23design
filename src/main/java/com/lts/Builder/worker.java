package com.lts.Builder;

//  工人负责具体的实现建造者的抽象方法
public class worker extends Builder{

//    工人创建产品对象
    private Product product;

    public worker(){
        this.product=new Product();
    }

    @Override
    void partA() {
        product.setPartA("你应该这么做");
        System.out.println("你应该这么做");
    }

    @Override
    void partB() {
        product.setPartb("然后那么做");
        System.out.println("然后那么做");
    }

    @Override
    void partC() {
        product.setPartc("最后这么做");
        System.out.println("最后这么做");
    }

    @Override
    Product getproduct() {
//        建造完成之后返回产品
        return product;
    }
}
