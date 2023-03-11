import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player one, what's your name? ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Player two, what's your name? ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber();
        String decision = "yes";
        while(decision.equalsIgnoreCase("yes")) {
            System.out.println("The game is beginning! The computer guesses a number.");
            game.guess();
            while(true) {
                System.out.print(player1.getName() + " guess a number from 1 to 100. ");
                game.setPlayerNum1(scanner.nextInt());
                game.startPlayer1();
                if(game.startPlayer1()) {
                    System.out.println(player1.getName() + " won!");
                    break;
                }
                System.out.print(player2.getName() + " guess a number from 1 to 100. ");
                game.setPlayerNum2(scanner.nextInt());
                game.startPlayer2();
                if(game.startPlayer2()) {
                    System.out.println(player2.getName() + " won!");
                    break;
                }
                System.out.println("Nobody wins");
            }
            scanner.nextLine();
            do {
                System.out.println("Do you want to continue the game? [yes/no]");
                decision = scanner.nextLine();
            } while(!decision.equalsIgnoreCase("no") && !decision.equalsIgnoreCase("yes"));
        }
    }
}