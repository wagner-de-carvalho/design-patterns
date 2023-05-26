package com.home.singleton;

public class App {
    public static void main(String[] args) {
        SecurityManagerLazy sml = SecurityManagerLazy.getInstance();
        sml.login();

        SecurityManagerEager sme = SecurityManagerEager.getInstance();
        sme.login();
    }
}
