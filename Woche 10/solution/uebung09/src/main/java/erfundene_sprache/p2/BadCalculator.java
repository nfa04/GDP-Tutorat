package erfundene_sprache.p2;

public class BadCalculator implements Calculator {
    private int result;

    public BadCalculator(int a) {
        this.result = a;
    }

    @Override
    public int add(int a, int b) {
        return this.result;
    }

    @Override
    public int multiply(int a, int b) {
        return this.result;
    }
}
