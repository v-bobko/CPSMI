package lab_10_Poisk_genomnih_posledovatelnostey;
import java.util.Random;

public class Genom {
    public static void main(String[] args) {
        int[] arr = new int[10];
        boolean sort = false;
        int x;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    sort = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
