/*
Задача №4_Операторы
Написать программу, которая будет выполнять следующие действия:

Ввести три числа с клавиатуры x, y, z
Найти и вывести в консоль среднее арифметическое этих чисел.
Разделить среднее арифметическое на 2 и округлить в меньшую сторону
Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

*/

import java.util.Scanner;

public class TaskWork04 {

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static int inputNumber() {
        while (true) {
            System.out.print("Введите число: ");
            String n = scanner.next();
            if(isNumeric(n)) {
                return Integer.parseInt(n);
            } else {
                System.out.println("Неккоректное значение, нужно ввести число");
            }
        }
    }

    public static void main(String[] args) {

        int x = inputNumber();
        int y = inputNumber();
        int z = inputNumber();
        double average = (x + y + z) / 3.0;
        System.out.println(average);
        int r2 = (int) (average / 2);
        System.out.println(r2);
        if (r2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}