package lab_15_Srednii_po_bolnice;

public class SredneeArif {

    public static float srednee(float[] arr) {
        float sum = 0;
        float arf;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        arf = sum / arr.length;
        return arf;
    }

}
