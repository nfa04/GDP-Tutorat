package fehlersuche.p2;

// Entfernen Sie /* und */, um dieses Programm zu testen und zu korrigieren.

public class Main {
    public static void main(String[] args) {
        Fahrzeug f = new Auto();
        f.starten();
    }
}

class Auto extends Fahrzeug {
    Auto() {

    }
}

abstract class Fahrzeug {

    void starten() {
        System.out.println("Fahrzeug startet");
    }
}
