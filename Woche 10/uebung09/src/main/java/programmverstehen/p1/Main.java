package programmverstehen.p1;


public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.starten();
        a.hupen();
    }
}


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