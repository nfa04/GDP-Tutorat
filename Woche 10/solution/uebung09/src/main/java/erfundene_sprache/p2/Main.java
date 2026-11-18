package erfundene_sprache.p2;

public class Main {

    public static void main(String[] args) {
        BadCalculator c1 = new BadCalculator(2);
        BadCalculator c2 = new BadCalculator(16);
        System.out.println(c1.add(1, 1));      // 2
        System.out.println(c2.multiply(2, 8)); // 16
        System.out.println(c1.multiply(2, 8)); // 2
    }
}
