package programmverstehen.p2;

class Tier {
    void geraeusch() {
        System.out.println("Unbekanntes Geräusch");
    }
}

class Hund extends Tier {
    void geraeusch() {
        System.out.println("Wuff");
    }
}

class Katze extends Tier {
    void geraeusch() {
        System.out.println("Miau");
    }
}

// Erwartete Ausgabe:
//   Wuff
//   Miau
//   Wuff
// Dynamisches Binden: zur Laufzeit wird die Methode des tatsächlichen Objekttyps aufgerufen.
public class Main {
    public static void main(String[] args) {
        Tier[] tiere = {
            new Hund(),
            new Katze(),
            new Hund()
        };

        for (Tier t : tiere) {
            t.geraeusch();
        }
    }
}
