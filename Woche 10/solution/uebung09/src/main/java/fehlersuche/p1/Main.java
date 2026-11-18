package fehlersuche.p1;

// Fehlerart: Kompilierfehler.
// Ursache: Die Variable t hat den statischen Typ Tier, und Tier kennt die Methode bellen() nicht
// (sie existiert nur in Hund). Der Compiler prüft Methodenaufrufe anhand des statischen Typs.
// Behebung: Auf Hund casten (oder t direkt als Hund deklarieren).
class Tier {
    void schlafen() {
        System.out.println("Schlafen");
    }
}

class Hund extends Tier {
    void bellen() {
        System.out.println("Wuff");
    }
}

public class Main {
    public static void main(String[] args) {
        Tier t = new Hund();

        t.schlafen();
        ((Hund) t).bellen();
    }
}
