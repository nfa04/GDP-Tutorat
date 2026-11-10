class Recursion {

    public static long sumOfSquares(long n) {
        if(n > 0) {
            return n * n + sumOfSquares(n - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(5));
    }
}