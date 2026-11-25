package A;

import B.B1;

public class A1 {

    public static void a11() {
        System.out.println("a11");
        A1.a12();
    }

    public static void a12() {
        System.out.println("a12");
        A2.a21();
    }
}
