package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String decision = "yes";
        while(decision.equalsIgnoreCase("yes")) {
            System.out.print("Enter the first number: ");
            calculator.setNum1(scanner.nextInt());
            boolean isSignFit;
            do {
                System.out.print("Enter the sign of mathematical operation: ");
                isSignFit = calculator.setSign(scanner.next().charAt(0));
            } while(!isSignFit);
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