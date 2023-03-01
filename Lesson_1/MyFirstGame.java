public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 75;
        int playerNum = 50;
        do {
            if(playerNum < computerNum) {
                System.out.println(playerNum + " is less than computer's number");
                playerNum++;
            } else {
                System.out.println(playerNum + " is bigger than computer's number");
                playerNum--;
            }
        } while(computerNum != playerNum);
        System.out.println("You won!");
    }
}