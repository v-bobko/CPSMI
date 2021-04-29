package lab_11_HaplessBuilder;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод размеров отверстия
        System.out.println("Введите размеры отверстия.");
        System.out.print("Высота: ");
        int a = sc.nextInt();
        System.out.print("Длина: ");
        int b = sc.nextInt();

        // Ввод размеров кирпича
        System.out.println("Введите размеры кирпича.");
        System.out.print("Высота: ");
        int x = sc.nextInt();
        System.out.print("Ширина: ");
        int y = sc.nextInt();
        System.out.print("Длина: ");
        int z = sc.nextInt();

        if ((a >= x && b >= z) || (a >= z && b >= a) || (a >= x && b >= y) || (a >= y && b >= x) || (a >= z && b >= y) || (a >= y && b >= z)) {
            System.out.println("Ура! Кирпич проходит в отверстие!");
        } else {
            System.out.println("Кирпич не проходит в отверстие!!!");
        }
    }
}
