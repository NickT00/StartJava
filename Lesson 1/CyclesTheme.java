public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int even = 0;
        int odd = 0;
        do {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num++;
        } while(num == 21);
        System.out.println("In the interval [" + num + ", 21] sum of even numbers = " 
                + even + ", but odd numbers = " + odd);
    }
}
