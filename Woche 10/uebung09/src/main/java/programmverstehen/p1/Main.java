package programmverstehen.p1;

class Fahrzeug {
    void starten() {
        System.out.println("Fahrzeug startet");
    }
}

class Auto extends Fahrzeug {
    void hupen() {
        System.out.println("Hup Hup");
    }
}

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.starten();
        a.hupen();
    }
}
