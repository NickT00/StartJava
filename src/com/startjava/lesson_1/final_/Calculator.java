package com.startjava.lesson_1.final_;

public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 9;
        char sign = '%';
        int result = 0;
        if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if(sign == '*') {
            result = num1 * num2;
        } else if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '^') {
            result = num1;
            for(int i = 1; i < num2; i++) {
                result *= num1;
            }
        } else {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}