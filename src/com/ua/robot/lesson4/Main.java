package com.ua.robot.lesson4;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String lowercase = str.toLowerCase();
        String uppercase = str.toUpperCase();

        System.out.println(str.charAt(6));

        int lenght = str.length();
        int lastIndex = lenght -1;
        System.out.println(str.charAt(lastIndex));

        String s2 = "first" + "second";
        String s3 = Integer.parseInt("3") + (4 + 5);
        System.out.println(s3);

        System.out.println(str.concat(""));
    }
}
