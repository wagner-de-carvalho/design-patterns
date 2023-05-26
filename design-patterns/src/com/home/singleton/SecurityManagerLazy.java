package com.home.singleton;

public class SecurityManagerLazy {
    private static SecurityManagerLazy instance;

    private SecurityManagerLazy() {
    }

    public static SecurityManagerLazy getInstance() {
        if (instance == null) {
            instance = new SecurityManagerLazy();
        }
        return instance;
    }

    public void login() {
        System.out.println("login()");
    }
}
