public class MaxWert {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else if (b >= a) {
            return b;
        }
        // Hinweis: Weiss der Compiler, dass wir alle Fälle abgedeckt haben?
    }

    public static void main(String[] args) {
        System.out.println(max(7, 12));
    }
}