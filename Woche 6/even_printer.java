class EvenPrinter {

    public static void printNumbersLoop(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbersRec(int n) {
        // TODO
        return;
    }


    public static void main(String[] args) {
        printNumbersLoop(7);
    }

}
