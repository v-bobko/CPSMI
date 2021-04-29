package lab_15_Srednii_po_bolnice;

import java.util.Random;

import static lab_15_Srednii_po_bolnice.SredneeArif.srednee;

public class Main {
    public static void main(String[] args) {
        float masiv[] = new float[10];
        float s;
        Random r = new Random();

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = r.nextInt(100);
            System.out.print(masiv[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов массива = " + srednee(masiv));
    }
}
