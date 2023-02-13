public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 10;
        boolean isSexMale = true;
        double height = 1.70;

        if(age > 20) {
            System.out.println("Your age is more than 20");
        } else {
            System.out.println("Your age is 20 or less");
        }
        if(!isSexMale) {
            System.out.println("You are a woman");
        } else {
            System.out.println("You are a man");
        }
        if(height < 1.80) {
            System.out.println("Your height is less than 1.8 m.");
        } else {
            System.out.println("Your height is 1.8 m. or higher");
        }

        char firstLetterName = "Alex".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Your name starts M");
        } else if(firstLetterName == 'I') {
            System.out.println("Your name starts I");
        } else {
            System.out.println("Your name doesn't start M or I");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 5;
        int num2 = 6;
        System.out.println("We have a number - " + num1 + " and a number - " + num2 + ";");
        if(num1 > num2) {
            System.out.println(num1 + " - max\n" + num2 + " - min");
        } else if(num1 < num2) {
            System.out.println(num2 + " - max\n" + num1 + " - min");
        } else {
            System.out.println(num1 + " is equal " + num2);
        }

        System.out.println("\n3. Проверка числа");
        num1 = 5;
        System.out.println("We have a number - " + num1);
        if(num1 == 0) {
            System.out.println(num1 + " is equal 0");
        } else {
            if(num1 % 2 == 0) {
                System.out.println(num1 + " is even");
            } else {
                System.out.println(num1 + " is odd");
            }
            if(num1 > 0) {
                System.out.println(num1 + " is positive");
            } else {
                System.out.println(num1 + "is negative");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 555;
        num2 = 223;
        int ones1 = num1 % 110 % 10;
        int ones2 = num2 % 110 % 10;
        int tens1 = (num1 % 100 - ones1) / 10;
        int tens2 = (num2 % 100 - ones2) / 10;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        System.out.println("We have a number " + num1 + " and a number " + num2);
        if(ones1 != ones2 & tens1 != tens2 & hundreds1 != hundreds2) {
            System.out.println("All digits are different");
        } else {
            if(ones1 == ones2) {
                System.out.println(ones1 + " is equal," + " digits of the number is " + 1);
            } else {}
            if(tens1 == tens2) {
                System.out.println(tens1 + " is equal," + " digits of the number is " + 2);
            } else {}
            if(hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " is equal," + " digits of the number is " + 3);
            } else {}
        }

        System.out.println("\n5. Определение символа по его коду");
    }
}