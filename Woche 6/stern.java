class SternDreieck {
    public static void druckeDreieck(int hoehe) {
        for(int i = 1; i <= hoehe; i++) {
            for(int c = 0; c < (hoehe - i); c++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("**");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        druckeDreieck(4);
        druckeDreieck(0);
    }
}