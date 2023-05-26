package com.home.singleton;

public class SecurityManagerSync {
    private static SecurityManagerSync instance;

    private SecurityManagerSync() {
    }

    public static SecurityManagerSync getInstance() {
        if (instance == null) {
            synchronized (SecurityManagerSync.class) {
                if (instance == null) {
                    instance = new SecurityManagerSync();
                }
            }

        }
        return instance;
    }

    public void login() {
        System.out.println("login()");
    }
}
