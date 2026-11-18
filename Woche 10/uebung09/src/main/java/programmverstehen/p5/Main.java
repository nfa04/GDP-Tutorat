package programmverstehen.p5;

abstract class Tier {
    Tier() {
        System.out.println("Tier");
    }

    void bewegen() {
        System.out.println("Tier bewegt sich");
    }

    abstract void geraeusch();
}

class Hund extends Tier {
    Hund() {
        System.out.println("Hund");
    }

    void bewegen() {
        super.bewegen();
        System.out.println("Hund läuft");
    }

    void geraeusch() {
        System.out.println("Wuff");
    }
}

class Welpe extends Hund {
    Welpe() {
        System.out.println("Welpe");
    }

    void geraeusch() {
        System.out.println("Wuff Wuff");
    }
}

public class Main {
    public static void main(String[] args) {
        Tier t = new Welpe();

        t.bewegen();
        t.geraeusch();
    }
}
