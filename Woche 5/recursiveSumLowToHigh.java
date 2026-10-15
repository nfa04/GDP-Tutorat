class RekursiveSumme {
    public static int summeBis(int n, int currentNumber) {
        if(currentNumber >= n) {
            return n;
        } else {
            return currentNumber + summeBis(n, currentNumber + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summeBis(4, 2));
    }
}