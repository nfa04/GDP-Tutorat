package fehlersuche.p2;

// Fehlerart: Kompilierfehler.
// Ursache: Fahrzeug ist abstrakt, von abstrakten Klassen können keine Objekte erzeugt werden
// ("Fahrzeug is abstract; cannot be instantiated").
// Behebung: Eine konkrete Unterklasse schreiben und diese instanziieren
// (alternativ: abstract bei Fahrzeug entfernen).
abstract class Fahrzeug {

    void starten() {
        System.out.println("Fahrzeug startet");
    }
}

class Auto extends Fahrzeug {
}

public class Main {
    public static void main(String[] args) {
        Fahrzeug f = new Auto();
        f.starten();
    }
}
