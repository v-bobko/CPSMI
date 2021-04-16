package lab;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        try {
            n = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Ошибка! Введите число!");
        }
        if (n < 0) {
            System.out.println("Нет факториала!");
        } else if (n == 0) {
            System.out.println("F = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("F = " + f);
        }
    }
}


