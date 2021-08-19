import java.util.Scanner;

public class FinalTask01 {
    /*
    Итоговая задача №1
    Напишите программу конвертер валют.
    Программа должна переводить рубли в доллары по текущему курсу.
    Пользователь вводит текущий курс и количество рублей.
    Итоговое значение должно быть округлено до двух знаков после запятой.
    Пример для теста работы программы:

    Курс доллара: 67,55
    Количество рублей: 1000
    Итого: 14,80 долларов

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите курс доллара: ");
        double dollarCourse = scanner.nextDouble();
        System.out.println("Введите количество рублей: ");
        double roubleSum = scanner.nextDouble();
        double result = roubleSum/dollarCourse;

        String rounded = "";

        StringBuilder resStr = new StringBuilder(Double.toString(result));
        int i = resStr.indexOf(".");
        String subStr = resStr.substring(i+1);
        int size = subStr.length();
        if(size < 3) {
            for(int j = 0; j < 2 - size; j++) {
                resStr.append("0");
            }
            rounded = resStr.toString();
        } else {
            int third = resStr.toString().charAt(5) - '0';
            if(third < 5) {
                rounded = resStr.substring(0, 5);
            } else {
                rounded = resStr.substring(0, 4) + (resStr.toString().charAt(4) - '0' + 1);
            }
        }

        System.out.println("Курс доллара: " + dollarCourse);
        System.out.println("Количество рублей: " + roubleSum);
        System.out.println("Итого: " + rounded + " долларов");


        }

}