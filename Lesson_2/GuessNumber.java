public class GuessNumber {

    private int computerNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        computerNum = ((int) (Math.random() * 100)) + 1;
    }

    public boolean startPlayer1() {
        if(player1.getNum() < computerNum) {
            System.out.println("The number " + player1.getNum() 
                    + " is less than computer's number");
            return false;
        } else if(player1.getNum() > computerNum) {
            System.out.println("The number " + player1.getNum() 
                    + " is bigger than computer's number");
            return false;
        } else {
            System.out.println(player1.getName() + " won!");
            return true;
        }
    }

    public boolean startPlayer2() {
        if(player2.getNum() < computerNum) {
            System.out.println("The number " + player2.getNum() 
                    + " is less than computer's number");
            return false;
        } else if(player2.getNum() > computerNum) {
            System.out.println("The number " + player2.getNum() 
                    + " is bigger than computer's number");
            return false;
        } else {
            System.out.println(player2.getName() + " won!");
            return true;
        }
    }
}