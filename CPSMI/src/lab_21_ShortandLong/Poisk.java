package lab_21_ShortandLong;

import java.util.Random;

public class Poisk {
    final static int SIZE = 10;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        int min = Integer.MIN_VALUE; // Для поиска максимального значения
        int max = Integer.MAX_VALUE; // Для поиска минисального значения
        for (int i = 0; i < SIZE; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Поиск минимального значения
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + max);

        // Поиск максимального значения
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + min);
    }

}
