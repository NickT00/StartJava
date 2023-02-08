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
        int sumPurchase = penCost + bookCost;
        double sumWithDiscount = sumPurchase * (1 - discount/100);
        System.out.println("    Стоимость товаров без скидки = " + sumPurchase + " руб.\n"
                + "    Сумма скидки = " + (int) discount + " %\n"
                + "    Стоимость товаров со скидкой = " + (int) sumWithDiscount + " руб.");

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
        System.out.println("    byte:\n        " + byteNum);
        byteNum++;
        System.out.println("        " + byteNum);
        byteNum--;
        System.out.println("        " + byteNum);
        System.out.println("    short:\n        " + shortNum);
        shortNum++;
        System.out.println("        " + shortNum);
        shortNum--;
        System.out.println("        " + shortNum);
        System.out.println("    int:\n        " + intNum);
        intNum++;
        System.out.println("        " + intNum);
        intNum--;
        System.out.println("        " + intNum);
        System.out.println("    long:\n        " + longNum);
        longNum++;
        System.out.println("        " + longNum);
        longNum--;
        System.out.println("        " + longNum);

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
        char sign1 = '#';
        char sign2 = '&';
        char sign3 = '@';
        char sign4 = '^';
        char sign5 = '_';
        int character1 = 35;
        int character2 = 38;
        int character3 = 64;
        int character4 = 94;
        int character5 = 95;
        System.out.println("    " + character1 + " - " + sign1 
                + "\n    " + character2 + " - " + sign2 
                + "\n    " + character3 + " - " + sign3 
                + "\n    " + character4 + " - " + sign4 
                + "\n    " + character5 + " - " + sign5 );
    }
}