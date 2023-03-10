import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player one, what's your name? ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Player two, what's your name? ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber();
        game.guess();
        System.out.print("The game is beginning! " + player1.getName() 
                + " guess a number from 1 to 100. ");
        game.setPlayerNum1(scanner.nextInt());
        System.out.print(player2.getName() + " guess a number from 1 to 100. ");
        game.setPlayerNum2(scanner.nextInt());
        while(true) {
            game.startPlayer1();
            if(game.startPlayer1()) {
                System.out.println(player1.getName() + " won!");
                break;
            } 
            game.startPlayer2();
            if(game.startPlayer2()) {
                System.out.println(player2.getName() + " won!");
                break;
            }
            System.out.println("Nobody wins\n" + player1.getName() 
                    + " try to guess another number. ");
        }
    }
}