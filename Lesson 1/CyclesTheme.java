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
        System.out.println("In the interval [-10, 21] sum of even numbers = " 
                + even + ", but odd numbers = " + odd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if(num1 > num2 & num1 > num3) {
            max = num1;
        } else if(num2 > num3 & num2 > num1) {
            max = num2;
        } else {
            max = num3;
        }
        if(num1 < num2 & num1 < num3) {
            min = num1;
        } else if(num2 < num3 & num2 < num1) {
            min = num2;
        } else {
            min = num3;
        }
        for(int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num = 1234;
        int sumDigits = 0;
        while(num > 0) {
            System.out.print(num % 10);
            sumDigits += num % 10;
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j = 1;
        for(int i = 1; i < 24; i += 2) {
            if(j < 5) {
                System.out.printf("%4d", i);
                j++;
            } else if (j == 5) {
                j = 1;
                System.out.printf("%4d%n", i);
            }
        }
        if(j < 5 & j != 1) {
            for(int k = 0; k <= (5 - j); k++)
                System.out.printf("%4d", 0);
        }
    }
}
