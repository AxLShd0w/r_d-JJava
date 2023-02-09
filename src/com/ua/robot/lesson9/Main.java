package com.ua.robot.lesson9;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World!");
    }

    static String reverse (String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0 ; i--) {
            reversed += original.charAt(1);
            System.out.println(reversed);

        }

        return reversed;

    }
}

