class CommaRound {
    public static double commaRound(double x) {
        x = x * 10;
        int rounded = Math.round(x);
        x = rounded / 10.0;
        return x;
    }

    public static void main(String[] args) {
        double x = 3.1415;
        double rounded = commaRound(x);
        System.out.println(rounded)
    }
}