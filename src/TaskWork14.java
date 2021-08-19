package com.company;
import java.util.Arrays;
import java.util.Random;

public class TaskWork14 {

     /*
    Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.
     */

    public static void main(String[] args) {

        Random random = new Random();

        int [] numbers = new int[15];

        for(int i = 0; i < 15; i++) {
            int n = random.nextInt(20);
            if(random.nextBoolean()) {

                n *= -1;
            }
            numbers[i] = n;
        }
        System.out.println(Arrays.toString(numbers));

        int max = -21;
        int min = 21;

        for(int i = 0; i < 15; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        max = Math.abs(max);
        min = Math.abs(min);
        if(max > min) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }

    }
}