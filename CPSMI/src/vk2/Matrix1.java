package vk2;

import java.util.Random;

public class Matrix1 {
    final static int SIZE=3;
    public static void main(String[] args) {
        int m[][] = new int[SIZE][SIZE];
        int n[][] = new int[SIZE][SIZE];
        int sum[][] = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Random random = new Random();
                m[i][j] = random.nextInt(20);
                n[i][j] = random.nextInt(20);
            }
        }
        printMatrix(m);
        printMatrix(n);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sum[i][j] = m[i][j] + n[i][j];
            }
        }
        System.out.println("++++++++++++++++++++");
        printMatrix(sum);
    }
    private static void printMatrix(int[][] m) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
