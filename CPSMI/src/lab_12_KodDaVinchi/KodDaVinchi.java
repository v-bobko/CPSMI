package lab_12_KodDaVinchi;

public class KodDaVinchi {
    public static void main(String[] args) {
        //112358132134
        int l = 1;
        int r = 1;
        System.out.print(l+" "+r+" ");

        int nextNumber = 0;
        while (nextNumber < 300) {
            nextNumber = l + r;
            System.out.print(nextNumber+" ");
            l = r;
            r = nextNumber;
        }
    }
}
