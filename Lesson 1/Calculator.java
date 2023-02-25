public class Calculator {
    public static void main(String[] args) {
        int numA = 5;
        int numB = 10;
        char sign = '%';
        int result = 0;
        if(sign == '+') {
            result = numA + numB;
        } else if(sign == '-') {
            result = numA - numB;
        } else if(sign == '*') {
            result = numA * numB;
        } else if(sign == '/') {
            result = numA / numB;
        } else if(sign == '^') {
            int tempNumA = numA;
            for(int i = 1; i < numB; i++) {
                tempNumA *= numA;
                result = tempNumA;
            }
        } else {
            result = (int) (((double) numA / (double) numB) * 100);
        }
        System.out.println(numA + " " + sign + " " + numB + " = " + result);
    }
}