import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the first number: ");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Enter the sign of mathematical operation: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Enter the second number: ");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Result: " + calculator.calculate());
            scanner.nextLine();
            while(true) {
                System.out.println("Do you want to continue calculating? [yes/no]");
                String decision = scanner.nextLine();
                if(decision.equalsIgnoreCase("yes")) {
                    break;
                } else if(decision.equalsIgnoreCase("no")) {
                    System.exit(0);
                }
            }
        }
    }
}