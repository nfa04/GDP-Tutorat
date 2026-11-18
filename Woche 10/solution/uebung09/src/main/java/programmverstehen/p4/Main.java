package programmverstehen.p4;

class A {
    A() {
        System.out.println("A1");
    }

    A(int x) {
        System.out.println("A2");
    }
}

class B extends A {
    B() {
        this(5);
        System.out.println("B1");
    }

    B(int x) {
        super(x);
        System.out.println("B2");
    }
}

// Erwartete Ausgabe:
//   A2
//   B2
//   B1
// new B() -> this(5) -> B(int) -> super(x) -> A(int) gibt "A2" aus (A() wird nie aufgerufen);
// danach "B2" aus B(int) und zuletzt "B1" aus B().
public class Main {
    public static void main(String[] args) {
        B b = new B();
    }
}
