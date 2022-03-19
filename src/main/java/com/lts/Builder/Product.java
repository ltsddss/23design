package com.lts.Builder;

/**
 * 产品类，包含多个生产的步骤
 */
public class Product {
    private String partA;
    private String partb;
    private String partc;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartb(String partb) {
        this.partb = partb;
    }

    public void setPartc(String partc) {
        this.partc = partc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partb='" + partb + '\'' +
                ", partc='" + partc + '\'' +
                '}';
    }
}
