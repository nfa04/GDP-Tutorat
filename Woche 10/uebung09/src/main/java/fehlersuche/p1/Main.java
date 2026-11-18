package fehlersuche.p1;

// Entfernen Sie /* und */, um dieses Programm zu testen und zu korrigieren.

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
        t.bellen();
    }
}
