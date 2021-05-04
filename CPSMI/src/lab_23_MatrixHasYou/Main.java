package lab_23_MatrixHasYou;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4, 4);
        Matrix m2 = new Matrix(4, 4);
        Matrix m3 = new Matrix(2, 3);

        System.out.println("Первая матрица: ");
        m1.zapolnenieMatrix();
        System.out.println("Вторая матрица: ");
        m2.zapolnenieMatrix();
        System.out.println("Сумма 1 и 2 матриц: ");
        m1.add(m2);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("третья матрица: ");
        m3.zapolnenieMatrix();
        System.out.println("Сумма 1 и 3 матриц: ");
        m1.add(m3);


    }
}
