public class GuessNumber {

    private int computerNum;
    private int playerNum1;
    private int playerNum2;

    public void setPlayerNum1(int num) {
        playerNum1 = num;
    }

    public void setPlayerNum2(int num) {
        playerNum2 = num;
    }

    public void guess() {
        computerNum = ((int) (Math.random() * 100)) + 1;
    }

    public boolean startPlayer1() {
        if(playerNum1 < computerNum) {
            System.out.println("The number " + playerNum1 + " is less than computer's number");
            return false;
        } else if(playerNum1 > computerNum) {
            System.out.println("The number " + playerNum1 + " is bigger than computer's number");
            return false;
        } else {
            return true;
        }
    }

    public boolean startPlayer2() {
        if(playerNum2 < computerNum) {
            System.out.println("The number " + playerNum2 + " is less than computer's number");
            return false;
        } else if(playerNum2 > computerNum) {
            System.out.println("The number " + playerNum2 + " is bigger than computer's number");
            return false;
        } else {
            return true;
        }
    }
}