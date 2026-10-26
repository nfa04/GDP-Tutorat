class Digits {

    public static int countDigitsRec(int n) {
        if (n >= -9 && n <= 9) {
            return 1;
        }
        return 1 + countDigitsRec(n / 10);
    }

    public static int countDigitsLoop(int n) {
        int counter = 1;
        while(n >= 10 || n <= -10) {
            n = n / 10;
            counter = counter + 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countDigitsLoop(123456));
    }

}