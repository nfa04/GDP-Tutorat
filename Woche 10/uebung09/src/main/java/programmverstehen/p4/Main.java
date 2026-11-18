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

public class Main {
    public static void main(String[] args) {
        B b = new B();
    }
}
