package com.ua.robot.lesson7;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 5;
        int max = getMaxNumber(firstNumber, secondNumber);
        System.out.println(max);
    }

    static int getMaxNumber(int a, int b){
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

}
