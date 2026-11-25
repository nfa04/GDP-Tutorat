package uebung11;

import static org.junit.Assert.*;
import static uebung11.TestUtil.*;

import org.junit.Test;

public class InformationHidingTest {

    // 3.1
    @Test public void p1_mainAusgabe() {
        assertEquals("Wrong password! Returned empty book.\nOops, mistyped\n"
                + "Created the following Book: Lord of the Rings",
                runMain("informationhiding.p1.Main"));
    }
    @Test public void p1_eagerReaderKompiliertNicht() {
        assertFalse("EagerReader kompiliert noch", compiles("informationhiding/p1/EagerReader.java"));
    }

    // 3.2
    @Test public void p2_mainAusgabe() {
        assertEquals("Maximum attempts: 3\nPlaying...\nPlaying...\nPlaying...",
                runMain("informationhiding.p2.Main"));
    }
    @Test public void p2_villainKompiliertNicht() {
        assertFalse("Villain kompiliert noch", compiles("informationhiding/p2/Villain.java"));
    }

    // 3.3
    @Test public void p3_mainAusgabe() {
        assertEquals("10\n20\n30\nTotal:\n60", runMain("informationhiding.p3.Main"));
    }
    @Test public void p3_villainKompiliertNicht() {
        assertFalse("Villain kompiliert noch", compiles("informationhiding/p3/Villain.java"));
    }

    // 3.4
    @Test public void p4_mainAusgabe() {
        assertEquals("3", runMain("informationhiding.p4.Main"));
    }
    @Test public void p4_villainKompiliertNicht() {
        assertFalse("Villain kompiliert noch", compiles("informationhiding/p4/Villain.java"));
    }
}
