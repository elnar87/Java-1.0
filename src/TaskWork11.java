package com.company;
import java.util.Scanner;

public class TaskWork11 {
    /*
    Задача №11_Работа с данными
Напишите программу:
Ввести первое  число с клавиатуры и записать его в строковую переменную.
Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
Сравнить 2 числа и вывести большее на экран .
Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
     */

    public static void main(String[] args) {
        System.out.println("Сравнение чисел");
        System.out.println("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);

        String number1 = scanner.next();

        int number2 = scanner.nextInt();

        if (Integer.parseInt(number1) > number2) {
            System.out.println("max = " + number1);
            System.out.println("min = " + (double) number2);
        } else {
            System.out.println("max = " + number2);
            System.out.println("min = " + Double.parseDouble(number1));
        }
    }
}