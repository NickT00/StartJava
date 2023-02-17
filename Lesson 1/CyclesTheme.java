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

        // Doesn't work, cannot make reverse outprint
        strings = 1;
        int symbols;
        do {
            symbols = 1;
            do {
                System.out.print("$");
                symbols++;
            } while(symbols <= strings);
            System.out.println("");
            strings++;
        } while(strings <= 3);
        // // // // // // //

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec" + " Char");
        for(int i = 1; i < 48; i += 2) {
            System.out.println(i + " " + (char) i);
        }
        for(int i = 98; i < 123; i += 2) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1_234_321;
        int reverseNum = 0;
        tempNum = num;
        int reverseTemp = 0;
        while(num > 0) {
            reverseTemp = num % 10;
            reverseNum = (reverseNum * 10) + reverseTemp;
            num /= 10;
        }
        if(tempNum == reverseNum) {
            System.out.println("The Number " + tempNum + " is a polindrom");
        } else {
            System.out.println("The Number " + tempNum + " is not a polindrom");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 837_990;
        int firstDigits = num % 1000;
        int lastDigits = num / 1000;
        int tempFirstDigits = firstDigits;
        int tempLastDigits = lastDigits;
        int sum1 = 0;
        int sum2 = 0;
        int digit1;
        int digit2;
        for(int i = 0; i < 3; i++) {
            digit1 = firstDigits % 10;
            firstDigits /= 10;
            sum1 += digit1;
            digit2 = lastDigits % 10;
            lastDigits /= 10;
            sum2 += digit2;
        }
        System.out.println("Sum of the digits " + tempFirstDigits + " = " + sum1 
                + "\nSum of the digits " + tempLastDigits + " = " + sum2);
        if(sum1 == sum2) {
            System.out.println("This number is lucky");
        } else {
            System.out.println("This number is not lucky");
        }
    }
}
