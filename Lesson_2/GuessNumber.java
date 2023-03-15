import java.util.Scanner;

public class GuessNumber {

    private int computerNum;
    private Player player1;
    private Player player2;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("The game is beginning! The computer guesses a number.");
        computerNum = ((int) (Math.random() * 100)) + 1;
        while(true) {
            System.out.print("\n" + player1.getName() + " guess a number from 1 to 100. ");
            player1.setNum(scanner.nextInt());
            if(player1.getNum() < computerNum) {
                System.out.println("The number " + player1.getNum() 
                        + " is less than computer's number");
            } else if(player1.getNum() > computerNum) {
                System.out.println("The number " + player1.getNum() 
                        + " is bigger than computer's number");
            } else {
                System.out.println(player1.getName() + " won!");
                break;
            }
            System.out.print("\n" + player2.getName() + " guess a number from 1 to 100. ");
            player2.setNum(scanner.nextInt());
            if(player2.getNum() < computerNum) {
                System.out.println("The number " + player2.getNum() 
                        + " is less than computer's number");
            } else if(player2.getNum() > computerNum) {
                System.out.println("The number " + player2.getNum() 
                        + " is bigger than computer's number");
            } else {
                System.out.println(player1.getName() + " won!");
                break;
            }
        }
    }
}