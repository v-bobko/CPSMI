package lab_cо_2_по_6_и_16;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {

        char i = 'o';
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        while (i != 'q') {
            System.out.println("ax^2+bx+c=0");
            System.out.println("Введите число a");
            a = scanner.nextInt();
            System.out.println("Введите число b");
            b = scanner.nextInt();
            System.out.println("Введите число c");
            c = scanner.nextInt();

            double x, x1, x2;
            int D = b * b - 4 * a * c;
            if (D < 0) {
                System.out.println("Корней нет");
            } else if (D == 0) {
                x = (-b) / (2 * a);
                System.out.println("x = " + x);
            } else {
                x1 = (-b + sqrt(D)) / (2 * a);
                x2 = (-b - sqrt(D)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            System.out.println("Введите s для продолжения или q для выхода");
            i = scanner.next().charAt(0);

        }
    }
}
