package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] numbers = {4, 5, 1, 3, 2, 7, 6};
        int[] temps = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            temps[i] = numbers[numbers.length - 1 - i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = temps[i];
            System.out.print(numbers[i] + " ");
        }
    }
}
