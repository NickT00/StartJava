public class MyFirstGame {
    public static void main(String[] args) {
        int computersNum = 75;
        int playersNum = 50;
        do {
            if(playersNum < computersNum) {
                System.out.println(playersNum + " is less than computer's number");
                playersNum++;
            } else {
                System.out.println(playersNum + " is bigger than computer's number");
                playersNum--;
            }
        } while(computersNum != playersNum);
        System.out.println("You won!");
    }
}