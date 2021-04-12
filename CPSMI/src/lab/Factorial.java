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
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("f="+f);
    }
}


