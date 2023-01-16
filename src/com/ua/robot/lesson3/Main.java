package com.ua.robot.lesson3;

public class Main {

    public static void main(String[] args) {
        int year = 2023;
        int AfterTenYears = 10;

        int future = year + AfterTenYears;
        System.out.println(future);
        int a = 99;
        int b = -66;
        double d = 9.99;
        System.out.println(a -b);
        System.out.println(a +d);
        int c = (int) (a + d);
        System.out.println(c);
        System.out.println(a * b);
        System.out.println((double) a / (double) b);
        System.out.println(45986 % 2);
        System.out.println();
        int q = 1;
        System.out.println(q++ + ++q);
    }
}
