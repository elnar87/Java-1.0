package com.company.avg18;
import java.util.Scanner;

public class FinalTask02 {
    /*
    Итоговая задача №2
    Напишите программу, которая позволит решить простое уравнение относительно x.
    Программа принимает на вход строку длиной 5 символов.
    Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
    Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
    Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
     */

    public static void main(String[] args) {

        int result = 0;

        System.out.println("Введите уравнение:");
        Scanner scanner = new Scanner(System.in);

        String task = scanner.nextLine();

        char second = task.charAt(1);
        char first = task.charAt(0);
        char third = task.charAt(2);
        char five = task.charAt(4);

        if(five == 'x') {
            switch (second){
                case '+':
                    result = first - '0' + (third - '0');
                    break;
                case '-':
                    result = first - '0' - (third - '0');
            }
        } else if (first  == 'x') {
            switch (second){
                case '+':
                    result = five - '0' - (third - '0');
                    break;
                case '-':
                    result = five - '0' + third - '0';
            }
        } else {
            switch (second){
                case '+':
                    result = five - '0'  - (first - '0');
                    break;
                case '-':
                    result = -(five - '0' - (first - '0'));
            }
        }

        System.out.println("Ввод: " + result);
    }
}