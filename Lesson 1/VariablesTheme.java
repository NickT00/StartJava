public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль");
        byte cores = 2;
        short logicalProcessors = 2;
        int memory = 4;
        long diskSpace = 120;
        float frequency = 2.81f;
        double CashL3 = 2.0;
        char typeOfSystem = 'W';
        boolean active = true;
        System.out.println("    Количество ядер  процессора - " + cores + ";\n"
                + "    Количество логических процессоров - " + logicalProcessors + ";\n"
                + "    Объем оперативной памяти - " + memory + " GB;\n"
                + "    Объем жесткого диска - " + diskSpace + " GB;\n"
                + "    Частота процессора - " + frequency + " GHz;\n"
                + "    Объем кэша L3 - " + CashL3 + " MB;\n"
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
    }
}