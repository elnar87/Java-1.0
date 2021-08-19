package com.company;
import java.util.Scanner;

public class TaskWork12 {
      /*
    Задача №12_Работа с данными
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
Проверить, содержит ли строка подстроку “Java” (используйте contains()).
Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
     */

    public static void main(String[] args) {
        System.out.println("Ввдеите текст: ");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if(s.contains("Java") && s.startsWith("I like") && s.endsWith("!!!")) {
            System.out.println(s.toUpperCase());
        }

        String changedStr = s.replace('a', 'o');

        int i = changedStr.indexOf("J");

        int i2 = changedStr.indexOf("!");

        String substr = changedStr.substring(i, i2);
        System.out.println(substr);
    }
}