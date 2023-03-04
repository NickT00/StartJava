import java.util.Scanner;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private int result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num) {
        num1 = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num) {
        num2 = num;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if(sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '^' || sign == '%') {
            this.sign = sign;
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '^' :
                result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            default:
                result = num1 % num2;
        }
        return result;
    }
}