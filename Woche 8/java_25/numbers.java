class Numbers {

    public static Boolean prime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void twinPrimes(int lo, int hi) {
        for(int n = lo; n <= hi; n++) {
            if(prime(n) && prime(n+2)) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        // Aufruf für lo = 2 und hi = 11
        twinPrimes(2, 11);
    }

}