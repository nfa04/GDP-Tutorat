class Fact {

    public static void main(String[] args) {
        System.out.println(facloop(5));
    }

    public static int facrec(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * facrec(n-1);
    }

    public static int facloop(int n) {
        int x = n;
        while(n > 1) {
            n--;
            x *= n;
        }
        return x;
    }

}