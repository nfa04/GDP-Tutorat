package programmverstehen.p3;

class A {
    void anzeigen() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void anzeigen() {
        super.anzeigen();
        System.out.println("B");
    }
}

class C extends B {
    @Override
    void anzeigen() {
        super.anzeigen();
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new C();
        obj.anzeigen();
    }
}
