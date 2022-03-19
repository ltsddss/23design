package com.lts.Builder;

/**
 * 建造者模式(将建造产品的方式抽象为一个类)
 */
public abstract class Builder {
    abstract void partA();
    abstract void partB();
    abstract void partC();
    abstract Product getproduct();
}
