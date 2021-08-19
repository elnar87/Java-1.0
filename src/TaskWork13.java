package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
  Задача №13_ Работа с данными
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов.
   */

public class TaskWork13 {

    public static boolean isAlpha(String word) {
        char[] chars = word.toCharArray();

        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            } else if(!(c >= a && c <= z || c >= A && c <= Z)) {
                return false;
            }
        }

        return true;
    }
    public static boolean isAlpha2(String word) {
        return word.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {

        int wordsCounter = 0;

        System.out.println("Введите текст на английском и русском: ");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s);

        while (stringTokenizer.hasMoreTokens()) {
            String word = stringTokenizer.nextToken();
            if(isAlpha(word)) {
                System.out.println(word);
                wordsCounter++;
            }
        }
        System.out.println("Количество слов: " + wordsCounter);

    }
}