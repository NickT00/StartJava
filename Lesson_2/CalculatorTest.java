import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            char sign = 'a';
            System.out.println("Enter the first number");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Enter the sign of mathematical operation");
            calculator.setSign(scanner.next().charAt(0));
            sign = calculator.getSign();
            while(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' 
                    && sign != '%') {
                System.out.println("You should enter signs: '+', '-', '*', '/', '^', '%'");
                calculator.setSign(scanner.next().charAt(0));
                sign = calculator.getSign();
            }
            System.out.println("Enter the second number");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Result " + calculator.calculate());
            do {
                System.out.println("Do you want to continue?");
                String decision = scanner.nextLine();
                if(decision.equalsIgnoreCase("yes")) {
                    break;
                } else if(decision.equalsIgnoreCase("no")) {
                    System.exit(0);
                }
            } while(true);
        } while(true);
    }
}