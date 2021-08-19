package com.company.avg18;
import java.util.Arrays;
import java.util.Scanner;

public class TaskWork09 {
    /*
    Задача №9_ Циклы
    Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
Посчитайте среднее арифметическое элементов массива.
После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();

        double [] numbers = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            numbers[i] = scanner.nextDouble();
            System.out.println();
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = sum / n;
        System.out.println("Среднее арифметическое:" + average);

        for(int i = 0; i < n; i++) {
            numbers[i] *= average;
        }
        System.out.println("Результат:" + Arrays.toString(numbers));
    }
}