package com.ua.robot.lesson4;

import java.util.Scanner;

public class HwTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово: ");
            String fromInput = scanner.nextLine();
            int lenght = fromInput.length();
            int LastIndex = lenght - 1;
                System.out.println(fromInput.toLowerCase());
                System.out.println(fromInput.toUpperCase());
                System.out.println((fromInput.substring(0,1) + (fromInput.substring(LastIndex))));
//        System.out.println(str.charAt(LastIndex));


    }
}
