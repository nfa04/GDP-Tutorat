class Aufgabe1 {

    // Die Methode soll n Sterne ausgeben

    public static void printStars(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("*");
        printStars(n-1);
    }

    public static void main(String[] args) {
        printStars(5);
    }
}