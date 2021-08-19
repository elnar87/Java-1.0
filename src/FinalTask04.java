package com.company.avg18;
 import java.util.Scanner;

public class FinalTask04 {
    /*
    Итоговая задача №4
 Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
 Ответ: “Заархивированный вирус”.

У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
     */

    public static void main(String[] args) {
        String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.";
        String correctAnswer = "Заархивированный вирус".toLowerCase();

        System.out.println(question);

        Scanner scanner = new Scanner(System.in);

        int n = 3;
        boolean isSuccess = false;
        boolean useHint = false;
        for(int i = 0; i < n; i++) {
            System.out.println("Ответ:");
            String answer = scanner.nextLine().trim().toLowerCase();

            if(answer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                isSuccess = true;
                break;
            } else if(answer.equals("подсказка")) {
                if(i == 0) {
                    System.out.println("з***х***р***н**й в***с");
                    useHint = true;
                } else {
                    System.out.println("Подсказка уже недоступна");
                    i--;
                }
            } else {
                if(useHint) {
                    break;
                }
                if(i < n -1) {
                    System.out.println("Подумай еще!");
                }
            }
        }

        if(!isSuccess) {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}