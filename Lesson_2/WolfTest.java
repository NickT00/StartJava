public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "Boy";
        wolfOne.nickname = "Wolfy";
        wolfOne.weight = 30;
        wolfOne.age = 9;
        wolfOne.color = "Gray";
        System.out.println("Sex - " + wolfOne.sex + "\nNickname - " + wolfOne.nickname 
                + "\nWeight - " + wolfOne.weight + "\nAge - " + wolfOne.age + "\nColor - " 
                + wolfOne.color);
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}