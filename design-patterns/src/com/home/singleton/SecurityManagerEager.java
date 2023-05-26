package com.home.singleton;

public class SecurityManagerEager {
    private static SecurityManagerEager instance;
    static {
        try {
            instance = new SecurityManagerEager();
        } catch (Exception e) {
            // Tratar exceção
        }
    }

    private SecurityManagerEager() {
    }

    public static SecurityManagerEager getInstance() {
        return instance;
    }

    public void login() {
        System.out.println("login()");
    }
}
