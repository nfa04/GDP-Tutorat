package erfundene_sprache.p1;

public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static String concatenate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        int c = 5;
        int d = 3;
        int e = add(c, d);
        System.out.println(e);
        String f = "Hallo";
        String g = "Test";
        String h = concatenate(f, g);
        System.out.println(h);
    }
}
