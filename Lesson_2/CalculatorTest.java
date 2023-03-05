import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number:");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Enter the sign of mathematical operation:");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Enter the second number:");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Result\n" + calculator.calculate());
            while(true) {
                System.out.println("Do you want to continue calculating? [yes/no]");
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