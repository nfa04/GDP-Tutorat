package fehlersuche.p2;

// Entfernen Sie /* und */, um dieses Programm zu testen und zu korrigieren.

abstract class Fahrzeug {

    void starten() {
        System.out.println("Fahrzeug startet");
    }
}

public class Main {
    public static void main(String[] args) {
        Fahrzeug f = new Fahrzeug();
        f.starten();
    }
}
*