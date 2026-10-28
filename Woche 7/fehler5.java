import java.util.Arrays;

public class Aufgabe5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays sind gleich");
        } else {
            System.out.println("Arrays sind verschieden");
        }
    }
}
