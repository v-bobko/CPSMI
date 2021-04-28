package lab_cо_2_по_6_и_16;

import java.util.Scanner;

public class RememberAll {
    public static void main(String[] args) {
        int i = 1;
        while (i != 0) {
            System.out.println("Введите число от 1 до 7. Для выхода введите 0");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            if (i > 0 && i < 8) {
                switch (i) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                }
            } else if (i != 0) {
                System.out.println("Неверное число");
            } else {
                System.out.println("Конец!");
                break;
            }
        }
    }
}
