package uebung11;

import static uebung11.TestUtil.*;

import org.junit.Test;

public class Aufgabe21Test {
    @Test public void klassen() {
        assertClass("A.A1", "public");
        assertClass("A.A2", "public");
        assertClass("B.B1", "public");
    }

    @Test public void a11() { assertMethod("A.A1", "a11", "protected"); }
    @Test public void a12() { assertMethod("A.A1", "a12", "private"); }
    @Test public void a21() { assertMethod("A.A2", "a21", "package-private"); }
    @Test public void a22() { assertMethod("A.A2", "a22", "public"); }
    @Test public void b11() { assertMethod("B.B1", "b11", "private"); }
    @Test public void b12() { assertMethod("B.B1", "b12", "public"); }
}
