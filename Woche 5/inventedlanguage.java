class ExampleInvented {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a % b;

        System.out.println(c);

        if(a < b) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        System.out.println(a == b);
    }
}
