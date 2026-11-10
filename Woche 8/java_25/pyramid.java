class Pyramid {

    public static void drawPyramid(int n) {
        int numStars = 1;
        for(int i = 0; i < n; i++) {
            for(int x = 0; x < (2*n - numStars) / 2; x++) {
                System.out.print(" ");
            }
            for(int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            for(int x = 0; x < (2*n - numStars) / 2; x++) {
                System.out.print(" ");
            }
            System.out.println("");
            numStars += 2;
        }
    }

    public static void main(String[] args) {
        drawPyramid(4);
    }

}