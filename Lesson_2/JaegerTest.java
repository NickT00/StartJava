public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Cherno Alpha");
        jaeger1.setOrigin("Russia");
        jaeger1.setWeight(2412);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(10);
        jaeger1.move();

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "China", 1722, 9, 8);
        jaeger2.move();
        System.out.println(jaeger1.getName() + " " + jaeger1.getWeight() + " tons");
        jaeger1.shoot();
        System.out.println(jaeger1.getName() + " " + jaeger1.getWeight() + " tons");
        System.out.println(jaeger2.getName() + " " + jaeger2.getWeight() + " tons");
        jaeger2.shoot();
        System.out.println(jaeger2.getName() + " " + jaeger2.getWeight() + " tons");
    }
}