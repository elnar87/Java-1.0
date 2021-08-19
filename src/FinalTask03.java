package com.company.avg18;
import java.util.Scanner;

public class FinalTask03 {
    /*
    Итоговая задача № 3
    Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
    Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
Количество строк: 3
Строка 1: привети
Строка 2: анализанализ
Строка 3: 111111111111223276712
Ответ: привет
     */

    public static void main(String[] args) {
        System.out.println("Количество строк: ");
        Scanner scanner = new Scanner(System.in);

        String max = "";
        int maxSize = 0;

        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Строка " + i + ": ");
            scanner = new Scanner(System.in);
            String current = scanner.nextLine();
            int size = calculateUniqueSymbolsSize(current);
            if(size > maxSize) {
                max = current;
                maxSize = size;
            }
        }

        System.out.println("Ответ: " + max);
    }

    private static int calculateUniqueSymbolsSize(String line) {
        String n = line + "";
        StringBuilder unique = new StringBuilder();

        while (n.length() > 0) {
            char letter = n.charAt(0);
            unique.append(letter);
            n = n.replace(letter+"", "");
        }

        return unique.toString().length();
    }
}