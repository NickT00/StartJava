package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num) {
        num1 = num;
    }

    public void setNum2(int num) {
        num2 = num;
    }

    public boolean setSign(char sign) {
        if(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' && sign != '%') {
            System.out.println("You should enter '+', '-', '*', '/', '^', '%'");
            return false;
        } else {
            this.sign = sign;
            return true;
        }
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '^' :
                int result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            case '%' :
                return num1 % num2;
            default:
                return 0;
        }
    }
}