package lab_23_MatrixHasYou;

import java.util.Random;

public class Matrix {
    private int[][] matrix;
    private int m;
    private int n;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public void zapolnenieMatrix() {
        matrix = new int[getM()][getN()];
        for (int i = 0; i < getM(); i++) {
            for (int j = 0; j < getN(); j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void add(Matrix x) {
        if (x.getM() == getM() && x.getN() == getN()) {
            for (int i = 0; i < getM(); i++) {
                for (int j = 0; j < getN(); j++) {
                    matrix[i][j] = matrix[i][j] + x.matrix[i][j];
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Ошибка! Сложить матрицы нельзя");
        }

    }
}
