public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter == 21);
        System.out.println("In the interval [-10, 21] sum of even numbers = " 
                + sumEven + ", but odd numbers = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if(num2 > num3 & num2 > num1) {
            max = num2;
        } else if(num3 > num1) {
            max = num3;
        }
        if(num1 < num2 & num1 < num3) {
            min = num1;
        } else if(num3 < num2) {
            min = num3;
        }
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int digit;
        int sumDigits = 0;
        while(num > 0) {
            digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 1;
        for(int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            counter++;
            if(counter > 5) {
                System.out.println();
                counter = 1;
            }
        }
        if(counter < 5 & counter != 1) {
            for(int i = 0; i <= (5 - counter); i++)
                System.out.printf("%4d", 0);
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        num = 3_242_592;
        int countTwos = 0;
        int copyNum = num;
        while(copyNum > 0) {
            if(copyNum % 10 == 2) {
                countTwos++;
            }
            copyNum /= 10;
        }
        if(countTwos % 2 == 0) {
            System.out.println("Number " + num + " contains " + countTwos 
                    + " (even) amount of twos");
        } else {
            System.out.println("Number " + num + " contains " + countTwos 
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

        /* Doesn't work, cannot make reverse outprint
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
        } while(strings <= 3);*/

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
        copyNum = num;
        int reverseTemp = 0;
        while(num > 0) {
            reverseTemp = num % 10;
            reverseNum = (reverseNum * 10) + reverseTemp;
            num /= 10;
        }
        if(copyNum == reverseNum) {
            System.out.println("The Number " + copyNum + " is a polindrom");
        } else {
            System.out.println("The Number " + copyNum + " is not a polindrom");
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

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\n           ТАБЛИЦА   ПИФАГОРА\n");
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 9; j++) {
                if(i == 1) {
                    if(j == 1) {
                        System.out.printf("%5s", "|");
                    } else {
                        System.out.printf("%4d", i * j);
                    }
                } else if(i == 2) { 
                    System.out.printf("%s", "____");
                } else if(i == 3){
                    if(j == 2) {
                        System.out.printf("%s", "|");
                    }
                    System.out.printf("%4d", (i - 1) * j);
                } else {
                    if(j == 2) {
                        System.out.printf("%s", "|");
                    }
                    System.out.printf("%4d", (i - 1) * j);
                }
            }
            System.out.println("");
        }
    }
}
