package lab_11_HaplessBuilder;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args) {

        int a, b, x, y, z;
        a = b = x = y = z = 0;
        boolean f = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                // Ввод размеров отверстия
                System.out.println("Введите размеры отверстия.");
                System.out.print("Высота: ");
                a = sc.nextInt();
                System.out.print("Длина: ");
                b = sc.nextInt();

                // Ввод размеров кирпича
                System.out.println("Введите размеры кирпича.");
                System.out.print("Высота: ");
                x = sc.nextInt();
                System.out.print("Ширина: ");
                y = sc.nextInt();
                System.out.print("Длина: ");
                z = sc.nextInt();

                f = false;
            } catch (Exception e) {
                System.out.println("Неверный ввод данных! Введите число");
            }
        } while (f);

        if ((a >= x && b >= z) || (a >= z && b >= a) || (a >= x && b >= y) || (a >= y && b >= x) || (a >= z && b >= y) || (a >= y && b >= z)) {
            System.out.println("Ура! Кирпич проходит в отверстие!");
        } else {
            System.out.println("Кирпич не проходит в отверстие!!!");
        }
    }
}

