package com.test.mvvm.utils;

public class Bumblebee {

    private static void featureOne() {
        System.out.println("feature one");
        System.out.println("loremipsum");
        callAnotherMethod();
    }

    private static void callAnotherMethod() {
        System.out.println("method info");
    }

}
