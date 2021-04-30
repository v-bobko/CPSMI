package lab_6_Palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int x = 1; // число, которое вводит пользователь
        int n1, n2, n3, n4, n5; // нумерация цифр
        Scanner scanner = new Scanner(System.in);
        while (x != 0) {
            System.out.println(" Введите пятизначное число или 0 для выхода");
            x = scanner.nextInt();
            String b = String.valueOf(x);//Для определения кол-ва знаков в числе
            if (x == 0) {
                System.out.println("Конец!");
            } else if (b.length() != 5) {
                System.out.println("Ошибка!");
            } else {
                n1 = x % 10;
                x = (x - x % 10) / 10;
                n2 = x % 10;
                x = (x - x % 10) / 10;
                n3 = x % 10;
                x = (x - x % 10) / 10;
                n4 = x % 10;
                x = (x - x % 10) / 10;
                n5 = x % 10;
                if (n1 == n5 && n2 == n4) {
                    System.out.println("Это число палиндром!");
                } else {
                    System.out.println("Это число  не палиндром.");
                }
            }
        }
    }
}