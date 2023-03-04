import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            String decision = "yes";
            System.out.println("Do you want to continue?");
            decision = scanner.nextLine();
            if(decision.equalsIgnoreCase("no")) {
                break;
            }
        } while(true);
        System.out.println("Enter the first number");
        calculator.setNum1(scanner.nextInt());
        System.out.println("Enter the sign of mathematical operation");
        calculator.setSign(scanner.next().charAt(0));
        char sign = calculator.getSign();
        while(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' 
                && sign != '%') {
            System.out.println("You should enter signs: '+', '-', '*', '/', '^', '%'");
            calculator.setSign(scanner.next().charAt(0));
            sign = calculator.getSign();
        }
        System.out.println("Enter the second number");
        calculator.setNum2(scanner.nextInt());
        System.out.println("Result " + calculator.calculate());
    }
}