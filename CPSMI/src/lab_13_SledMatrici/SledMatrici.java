package lab_13_SledMatrici;

import java.util.Scanner;
import java.util.Random;

public class SledMatrici {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int a = in.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Random r = new Random();
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sled = 0;
        for (int i = 0; i < arr.length; i++) {
            sled += arr[i][i];
        }
        System.out.println("СЛЕД МАТРИЦЫ =" + sled);
    }
}
