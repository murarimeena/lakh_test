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

    private static void thidMehod() {
        System.out.println("third method");
    }

}
