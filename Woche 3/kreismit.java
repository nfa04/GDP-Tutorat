class KreisMitVariablen {
    public static void main(String[] args) {
        double radius = 5.0;             // Diese eine Zahl ändern.
        double flaeche = Math.PI * radius * radius;
        double umfang = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
    }
}
KreisMitVariablen.main(new String[0]);