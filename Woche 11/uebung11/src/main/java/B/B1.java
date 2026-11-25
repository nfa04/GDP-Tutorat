package B;

import A.A1;
import A.A2;

public class B1 extends A1 {

    public static void b11() {
        System.out.println("b11");
        A1.a11();
    }

    public static void b12() {
        System.out.println("b12");
        A2.a22();
        B1.b11();
    }
}
