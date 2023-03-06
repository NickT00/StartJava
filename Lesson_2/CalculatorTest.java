import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String decision = "yes";
        char sign = calculator.getSign();
        while(decision.equalsIgnoreCase("yes")) {
            System.out.print("Enter the first number: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Enter the sign of mathematical operation: ");
            calculator.setSign(scanner.next().charAt(0));
            while(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' 
                    && sign != '%') {
                System.out.print("Enter the sign of mathematical operation: ");
                sign = scanner.next().charAt(0);
            }
            System.out.print("Enter the second number: ");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Result: " + calculator.calculate());
            scanner.nextLine();
            do {
                System.out.println("Do you want to continue calculating? [yes/no]");
                decision = scanner.nextLine();
            } while(!decision.equalsIgnoreCase("no") && !decision.equalsIgnoreCase("yes"));
        }
    }
}