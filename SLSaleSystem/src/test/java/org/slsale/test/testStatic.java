package org.slsale.test;

public class testStatic {

    public static void main(String[] args) {
        new testStatic();

    }

    static int num = 4;

    {
        num += 3;
        System.out.println("2b");
    }

    int a = 5;

    {
        System.out.println("3c");
    }

    testStatic() {
        System.out.println("4d");
    }

    static {
        System.out.println("1a");
    }

    static void run() {
        System.out.println("e");
    }
}