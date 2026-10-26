class Product {

    public static int prodloop(int a, int b) {
        int result = 0;

        while (b > 0) {
            result = result + a;
            b = b - 1;
        }

        return result;
    }

    public static int prodrec(int a, int b) {
        if(b <= 0) {
            return 0;
        }
        return a + prodrec(a, b - 1);
    }


    public static void main(String[] args) {
        System.out.println(prodrec(3, 5));
    }

}