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
        } while(counter <= 21);
        System.out.println("In the interval [-10, 21] sum of even numbers = " 
                + sumEven + ", but odd numbers = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num2;
        int min = num1;
        if(num1 > max) {
            max = num1;
        } 
        if(num3 > max) {
            max = num3;
        } 
        if(num2 < min) {
            min = num2;
        } 
        if(num3 < min) {
            min = num3;
        }
        for(int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        while(num > 0) {
            int digit = num % 10;
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
        if(counter != 1 && counter < 5) {
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
            System.out.println();
        }
        int amountStrings = 5;
        int stringLength = 5;
        while(amountStrings != 0) {
            while(stringLength != 0) {
                System.out.print("#");
                stringLength--;
            }
            System.out.println();
            amountStrings--;
            stringLength = amountStrings;
        }
        System.out.println();
        // Doesn't work, cannot make reverse outprint
        amountStrings = 1;
        int symbols;
        do {
            symbols = 1;
            do {
                System.out.print("$");
                symbols++;
            } while(symbols <= amountStrings);
            System.out.println("");
            amountStrings++;
        } while(amountStrings <= 3);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for(int i = 1; i < 48; i += 2) {
            System.out.printf("%3d %2c%n", i, (char) i);
        }
        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%3d %2c%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1_234_321;
        int reverseNum = 0;
        copyNum = num;
        while(num > 0) {
            int digit = num % 10;
            reverseNum = (reverseNum * 10) + digit;
            num /= 10;
        }
        if(copyNum == reverseNum) {
            System.out.println("The Number " + copyNum + " is a polindrome");
        } else {
            System.out.println("The Number " + copyNum + " is not a polindrome");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 837_990;
        int rightHalfNum = num % 1000;
        int leftHalfHum = num / 1000;
        int copyRightHalfNum = rightHalfNum;
        int copyLeftHalfHum = leftHalfHum;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 3; i++) {
            int digit = rightHalfNum % 10;
            rightHalfNum /= 10;
            sum1 += digit;
            digit = leftHalfHum % 10;
            leftHalfHum /= 10;
            sum2 += digit;
        }
        System.out.println("Sum of the digits " + copyRightHalfNum + " = " + sum1 
                + "\nSum of the digits " + copyLeftHalfHum + " = " + sum2);
        if(sum1 == sum2) {
            System.out.println("This number is lucky");
        } else {
            System.out.println("This number is not lucky");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\n       ТАБЛИЦА   ПИФАГОРА\n");
        for(int i = 1; i < 10; i++) {
            if(i == 1) {
                System.out.printf("%4s", "|");
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();
        for(int i = 1; i < 11; i++) {
            System.out.printf("%s", "___");
        }
        System.out.println();
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(j == 1) {
                    System.out.printf("%2d %1s", i, "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}
