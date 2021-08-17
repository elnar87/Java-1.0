/*
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
*/

import java.util.Scanner;

public class TaskWork06 {

    public final static int MASS = 1;
    public final static int DISTANCE = 2;

    public final static int METRIC = 1;
    public final static int MILE = 2;
    public final static int YARD = 3;
    public final static int FOOT = 4;

    public final static int KG = 1;
    public final static int FUNT = 2;
    public final static int GRAMM = 3;
    public final static int TONNA = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние ");

        int choice = scanner.nextInt();

        if (choice == MASS) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунты, 3 - граммы, 4 - тонны");

            choice = scanner.nextInt();

            int m = scanner.nextInt();

            switch (choice) {
                case KG:
                    System.out.println("Килограмм: " + m);
                    System.out.println("Фунты:" + m * 2.20462);
                    System.out.println("Граммы:" + m * 1000);
                    System.out.println("Тонны:" + m * 0.001);
                    break;
                case FUNT:
                    System.out.println("Килограмм: " + m * 0.453592);
                    System.out.println("Фунты:" + m);
                    System.out.println("Граммы:" + m * 453.592);
                    System.out.println("Тонны:" + m * 0.000453592);
                    break;
                case GRAMM:
                    System.out.println("Килограмм: " + m * 0.001);
                    System.out.println("Фунты:" + m * 0.00220462);
                    System.out.println("Граммы:" + m);
                    System.out.println("Тонны:" + m * 1e-6);
                    break;
                case TONNA:
                    System.out.println("Килограмм: " + m * 1000);
                    System.out.println("Фунты:" + m * 2204.62);
                    System.out.println("Граммы:" + m * 1e+6);
                    System.out.println("Тонны:" + m);
            }



        } else if (choice == DISTANCE){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            choice = scanner.nextInt();

            int d = scanner.nextInt();

            switch (choice) {
                case METRIC:
                    System.out.println("Метры: " + d);
                    System.out.println("Мили:" + d * 0.00062137139107608450449);
                    System.out.println("Ярды:" + d * 1.0936136482939087244);
                    System.out.println("Футы:" + d * 3.2808409448817257292);
                    break;
                case MILE:
                    System.out.println("Метры: " + d * 1609.34451499);
                    System.out.println("Мили: " + d);
                    System.out.println("Ярды:" + d * 1760.000563199912222);
                    System.out.println("Футы:" + d * 5280.0016895997359825);
                    break;
                case YARD:
                    System.out.println("Метры: " + d * 0.9144);
                    System.out.println("Мили: " + d * 0.000568182);
                    System.out.println("Ярды: " + d);
                    System.out.println("Футы: " + 3.00000096);
                    break;
                case FOOT:
                    System.out.println("Метры: " + d * 0.30480009753598480415);
                    System.out.println("Мили: " + d * 0.00018939399999999055016);
                    System.out.println("Ярды: " + d * 0.33333343999998338303);
                    System.out.println("Футы: " + d);
            }
        }






    }}