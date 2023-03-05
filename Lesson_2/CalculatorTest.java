import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Enter the sign of mathematical operation");
            calculator.setSign('a');
            char sign = calculator.getSign();
            while(true) {
                calculator.setSign(scanner.next().charAt(0));
                sign = calculator.getSign();
                if(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' 
                    && sign != '%') {
                    System.out.println("You should enter '+', '-', '*', '/', '^', '%'");
                } else {
                    break;
                }
            }
            System.out.println("Enter the second number");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Result " + calculator.calculate());
            while(true) {
                System.out.println("Do you want to continue? yes/no");
                String decision = scanner.nextLine();
                if(decision.equalsIgnoreCase("yes")) {
                    break;
                } else if(decision.equalsIgnoreCase("no")) {
                    System.exit(0);
                }
            }
        } while(true);
    }
}