package com.company.avg18;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TaskWork10 {
    /*
    Задача №10_Циклы
    Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
    а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
    Размерность матрицы задается пользователем.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размермерность матрицы (2 числа через пробел n m):");
        String str = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int [][] matrix = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("a[" + i + "," + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        print(matrix);

        int num = 3;
        multiply(matrix, num);
        System.out.println();

        System.out.println("Матрица умноженная на " + num + ": ");
        print(matrix);
    }

    private static void multiply(int[][] matrix, int num) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= num;
            }
        }
    }

    private static void print(int[][] matrix) {
        // вывод матрицы
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}