package com.lts.Singleton.hungry;

public class main {
    public static void main(String[] args) {
        User user=User.getInstance();

        user.Hello();
    }
}
