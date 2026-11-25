package programmverstehen.p2;


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