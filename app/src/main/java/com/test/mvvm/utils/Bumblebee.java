package com.test.mvvm.utils;

public class Bumblebee {

    private static void featureOne() {
        System.out.println("feature one");
        System.out.println("loremipsum");
        System.out.println("new feature from feature branch");
        System.out.println("feedback from feature branch");
        callAnotherMethod();
    }

    private static void callAnotherMethod() {
        System.out.println("method info");
    }

    private static void m100() {
        System.out.println("m100");
    }

    private static void m101() {
        System.out.println("m101");
    }

}
