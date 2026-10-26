class EvenPrinter {

    public static void printNumbersLoop(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbersRec(int n) {
        if(n % 2 == 0) {
            System.out.println(n);
        }
        if(n > 1) printNumbersRec(n - 1);
    }


    public static void main(String[] args) {
        printNumbersRec(7);
    }

}