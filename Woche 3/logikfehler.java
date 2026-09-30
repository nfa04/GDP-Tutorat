class LogischerFehlerDemo {
    public static void main(String[] args) {
        double radius = 5.0;
        double flaeche = 2 * Math.PI * radius * radius; // erwartet: Math.PI * radius * radius
        System.out.println("Fläche: " + flaeche);
    }
}