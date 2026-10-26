import java.util.Arrays;

public class Aufgabe4 {
    public static int[] verdoppeln(int[] zahlen) {
        int[] ergebnis = zahlen;
        for (int i = 0; i < ergebnis.length; i++) {
            ergebnis[i] = ergebnis[i] * 2;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int[] original = {2, 4, 6};
        int[] neu = verdoppeln(original);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(neu));
    }
}