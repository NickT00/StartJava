public class Calculator {

    private int num1;
    private int num2;
    private char sign;
    private int result;
    private boolean isSignFit;

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
        if(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' && sign != '%') {
            System.out.println("You should enter '+', '-', '*', '/', '^', '%'");
            isSignFit = false;
        } else {
            this.sign = sign;
            isSignFit = true;
        }
    }

    public boolean getIsSignFit() {
        return isSignFit;
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                return result = num1 + num2;
            case '-' :
                return result = num1 - num2;
            case '*' :
                return result = num1 * num2;
            case '/' :
                return result = num1 / num2;
            case '^' :
                result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            default:
                return result = num1 % num2;
        }
    }
}