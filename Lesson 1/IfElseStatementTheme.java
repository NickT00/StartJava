public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 10;
        boolean maleGender = true;
        double height = 1.70;

        if(age > 20) {
            System.out.println("Your age is more than 20");
        } else {
            System.out.println("Your age is 20 or less");
        }
        if(!maleGender) {
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
        int ones1 = num1 % 10;
        int ones2 = num2 % 10;
        int tens1 = num1 % 100 / 10;
        int tens2 = num2 % 100 / 10;
        int hundreds1 = num1 / 100;
        int hundreds2 = num2 / 100;
        System.out.println("We have a number " + num1 + " and a number " + num2);
        if(ones1 != ones2 & tens1 != tens2 & hundreds1 != hundreds2) {
            System.out.println("All digits are different");
        } else {
            if(ones1 == ones2) {
                System.out.println(ones1 + " is equal," + " digits of the number is " + 1);
            }
            if(tens1 == tens2) {
                System.out.println(tens1 + " is equal," + " digits of the number is " + 2);
            }
            if(hundreds1 == hundreds2) {
                System.out.println(hundreds1 + " is equal," + " digits of the number is " + 3);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char character = '\u0057';
        if(character >= 'A' && character <= 'Z') {
            System.out.println(character + " is a capital letter");
        } else if(character >= 'a' && character <= 'z') {
            System.out.println(character + " is a small letter");
        } else if(character >= '0' & character <= '9') {
            System.out.println(character + " is a digit");
        } else {
            System.out.println(character + " is not a digit or a letter");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 300_000;
        double depositInterest;
        if(deposit < 100_000) {
            depositInterest = 0.05;
        } else if(deposit > 300_000) {
            depositInterest = 0.1;
        } else {
            depositInterest = 0.07;
        }
        System.out.println("Deposit amount is " + (int) deposit + " RUB\nDeposit interest is " 
                + (int) (depositInterest * 100) + "%\n" + "Grand total is " 
                + (int) (deposit += deposit * depositInterest) + " RUB");

        System.out.println("\n7. Определение оценки по предметам");
        int historyScore = 59;
        int programmingScore = 91;
        int historyGrade;
        int programmingGrade;
        if(historyScore <= 60) {
            historyGrade = 2;
        } else if(historyScore > 91) {
            historyGrade = 5;
        } else if(historyScore > 73) {
            historyGrade = 4;
        } else {
            historyGrade = 3;
        }
        if(programmingScore <= 60) {
            programmingGrade = 2;
        } else if(programmingScore > 91) {
            programmingGrade = 5;
        } else if(programmingScore > 73) {
            programmingGrade = 4;
        } else {
            programmingGrade = 3;
        }
        System.out.println(historyGrade + " in history\n" + programmingGrade + " in programming\n" 
                + ((historyGrade + programmingGrade) / 2) + " - average grade\n" 
                + ((historyScore + programmingScore) / 2) + "% - average score\n");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int profit = 13000;
        int costPrice = 9000;
        int annualProfit = (profit - rent - costPrice) * 12;
        if(annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int ones = 50;
        int tens = 5;
        int hundreds = 10;
        int requiredOnes = money % 110 % 10;
        int requiredTens = (money % 100 - requiredOnes) / 10;
        int requiredHundreds = money / 100;
        /*if(ones + 10 * tens + 100 * hundreds < money) {
            System.out.println("The cash machine doesn't have enough money");
        } else {
            if(money % 100 == 0) {
                int money1 = money / 100;
                System.out.println(money1);
            } else {
                int amountHundreds = money / 100;
                money -= hundreds * 100;
                if(money % 10 == 0) {
                   money /= tens * 10;
                   System.out.println(amountHundreds + " " + money);
                } else {
                   int amountTens = money / 10;
                  money -= tens * 10;
                  System.out.println(amountHundreds + " " + amountTens + " " + ones);
                }
            }
        }*/
    }
}
