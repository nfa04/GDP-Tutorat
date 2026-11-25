package fehlersuche.p1;

// Entfernen Sie /* und */, um dieses Programm zu testen und zu korrigieren.


public class Main {
    public static void main(String[] args) {
        Tier t = new Hund();

        t.schlafen();
        t.bellen();
    }
}

class Tier {
    void schlafen() {
        System.out.println("Schlafen");
    }
    void bellen() {

    }
}

class Hund extends Tier {
    void bellen() {
        System.out.println("Wuff");
    }
}