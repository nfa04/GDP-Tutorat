class GeradeZiffern {
    public static int zaehleGeradeZiffern(int n) {
        // Tipp: n % 10 gibt letzte Ziffer der Zahl n
        int anzahl;
        if(n % 2 == 0) {
            anzahl = 1;
        } else {
            anzahl = 0;
        }

        if(n < 10) return anzahl;
        else {
            return anzahl + zaehleGeradeZiffern(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(zaehleGeradeZiffern(0));
        System.out.println(zaehleGeradeZiffern(135));
        System.out.println(zaehleGeradeZiffern(2048));
    }
}