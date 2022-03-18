package com.lts.Factory.FactoryMethod;


public class user {
    private int uid;

    private String name;

    public user(int uid, String name) {
        this.uid = uid;
        this.name=name;
    }

    public user() {

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                '}';
    }
}
