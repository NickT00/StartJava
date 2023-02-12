public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte cores = 2;
        short logicalProcessors = 2;
        int memory = 4;
        long diskSpace = 120;
        float frequency = 2.81f;
        double cashL3 = 2.0;
        char typeOfSystem = 'W';
        boolean active = true;
        System.out.println("    Количество ядер  процессора - " + cores + ";\n"
                + "    Количество логических процессоров - " + logicalProcessors + ";\n"
                + "    Объем оперативной памяти - " + memory + " GB;\n"
                + "    Объем жесткого диска - " + diskSpace + " GB;\n"
                + "    Частота процессора - " + frequency + " GHz;\n"
                + "    Объем кэша L3 - " + cashL3 + " MB;\n"
                + "    Тип операционной ситсемы - " + typeOfSystem + 
                " (W - Windows, M - MacOS, L - Linux, O - Other);\n"
                + "    Работает ли компютер? - " + active + " (true - Да, false - Нет);\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        double discount = 11;
        int sumGoods = penCost + bookCost;
        double discountPrice = sumGoods * (1 - discount/100);
        System.out.println("    Стоимость товаров без скидки = " + sumGoods + " руб.\n"
                + "    Сумма скидки = " + (int) discount + " %\n"
                + "    Стоимость товаров со скидкой = " + (int) discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA\n" 
                + "        J   a  v     v  a\n" 
                + "        J  a a  v   v  a a\n"
                + "    J  J  aaaaa  V V  aaaaa\n"
                + "     JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = 32_767;
        int intNum = 2_147_483_647;
        long longNum = 9_223_372_036_854_775_807L;
        System.out.println("    byte:\n        " + byteNum + "\n        " + (byteNum += 1) 
                + "\n        " + (byteNum -= 1));
        System.out.println("    short:\n        " + shortNum + "\n        " + (shortNum += 1) 
                + "\n        " + (shortNum -= 1));
        System.out.println("    int:\n        " + intNum + "\n        " + (intNum += 1) 
                + "\n        " + (intNum -= 1));
        System.out.println("    long:\n        " + longNum + "\n        " + (longNum += 1) 
                + "\n        " + (longNum -= 1));

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("    С помощью третьей переменной\n        Число №1 = " + num1
                + "  Число №2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("        Число №1 = " + num1 + "  Число №2 = " + num2);
        System.out.println("    С помощью арифметических операций\n        Число №1 = " + num1
                + "  Число №2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("        Число №1 = " + num1 + "  Число №2 = " + num2);
        System.out.println("    С помощью побитовой операции\n        Число №1 = " + num1
                + "  Число №2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("        Число №1 = " + num1 + "  Число №2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char numberSign = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char lowLine = '_';
        System.out.println("    " + (int) numberSign + " - " + numberSign + "\n    " 
                + (int) ampersand + " - " + ampersand + "\n    " 
                + (int) atSign + " - " + atSign + "\n    " 
                + (int) caret + " - " + caret + "\n    " 
                + (int) lowLine + " - " + lowLine );

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openingRoundBracket = '(';
        char closingRoundBracket = ')';
        System.out.println("        " + slash + backSlash + "\n       " 
                + slash + "  " + backSlash + "\n      " 
                + slash + lowLine + openingRoundBracket + " " + closingRoundBracket 
                + backSlash + "\n     " + slash + "      " + backSlash + "\n    " + slash 
                + lowLine + lowLine + lowLine + lowLine + slash + backSlash + lowLine + lowLine 
                + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        System.out.println("    Число " + num + " содержит:\n        " + hundreds 
                + " сотен\n        " + tens + " десятков\n        " + ones 
                + " единиц\n    Сумма его цифр = " + (hundreds + tens + ones) 
                + "\n    Произведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;
        System.out.println("    " + hours + ":" + minutes + ":" + seconds);
    }
}