/*
Задача №7_ Циклы
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив
2. Сравнить элементы массива с заранее заданными константами x, y, z.
3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
*/
import java.util.Arrays;
import java.util.Scanner;

public class TaskWork07 {

    private final static int CONSTANT1 = 1;
    private final static int CONSTANT2 = 2;
    private final static int CONSTANT3 = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] array = new int[size];

        
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]=");
            int n = sc.nextInt();
            System.out.println();

            array[i] = n;
        }

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if (array[i] == CONSTANT1 || array[i] == CONSTANT2 || array[i] == CONSTANT3) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }
}