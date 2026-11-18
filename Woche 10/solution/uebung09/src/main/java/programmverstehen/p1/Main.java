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

// Erwartete Ausgabe:
//   Fahrzeug startet
//   Hup Hup
// Auto erbt starten() von Fahrzeug und hat zusätzlich hupen().
public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.starten();
        a.hupen();
    }
}
