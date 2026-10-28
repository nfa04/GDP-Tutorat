public class Aufgabe2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 7;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}