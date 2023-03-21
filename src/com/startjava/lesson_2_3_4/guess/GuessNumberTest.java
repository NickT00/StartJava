package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player one, what's your name? ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Player two, what's your name? ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String decision = "yes";
        while(decision.equalsIgnoreCase("yes")) {
            game.start();
            do {
                System.out.println("Do you want to continue the game? [yes/no]");
                decision = scanner.nextLine();
            } while(!decision.equalsIgnoreCase("no") && !decision.equalsIgnoreCase("yes"));
        }
    }
}