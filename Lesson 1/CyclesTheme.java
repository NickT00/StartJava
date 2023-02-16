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
        int counter = 1;
        for(int i = 1; i < 24; i += 2) {
            if(counter < 5) {
                System.out.printf("%4d", i);
                counter++;
            } else if (counter == 5) {
                counter = 1;
                System.out.printf("%4d%n", i);
            }
        }
        if(counter < 5 & counter != 1) {
            for(int k = 0; k <= (5 - counter); k++)
                System.out.printf("%4d", 0);
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3_242_592;
        int check;
        int twos = 0;
        int tempNum = num;
        while(tempNum > 0) {
            check = tempNum % 10;
            if(check == 2) {
                twos++;
            }
            tempNum /= 10;
        }
        if(twos % 2 == 0) {
            System.out.println("Number " + num + " contains " + twos 
                    + " (even) amount of twos");
        } else {
            System.out.println("Number " + num + " contains " + twos 
                    + " (odd) amount of twos");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int strings = 5;
        int stringLength = 5;
        while(strings != 0) {
            while(stringLength != 0) {
                System.out.print("#");
                stringLength--;
            }
            System.out.println("");
            strings--;
            stringLength = strings;
        }
        /*strings = 5;
        stringLength = 3;
        int symbols = 1;
        do {
            
            do {
                System.out.print("$");
                
            } while(symbols == stringLength);
            System.out.println("");
            symbols++;
            stringLength++;
        } while();*/
    }
}
