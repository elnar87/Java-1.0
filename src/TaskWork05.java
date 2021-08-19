/*
Задача №5_ Операторы
Напишите простой калькулятор:
Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */

import java.sql.SQLOutput;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TaskWork05 {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа и математическую операцию через пробел: ");
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(expression);

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        String operator = stringTokenizer.nextToken();

        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
        }

        System.out.println(result);
    }
}