package bibliothek;

// Entfernen Sie /* und */, sobald Sie alle Klassen im Paket bibliothek implementiert haben.
/*
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import static org.junit.Assert.*;

public class BibliothekTests {

    @Test
    public void testVererbungUndBeschreibung() {
        Medium b = new Buch("Clean Code", 2008, "Robert C. Martin");
        Medium h = new Hoerbuch("Der Hobbit", 2012, 660);

        assertTrue(b instanceof Ausleihbar);
        assertTrue(h instanceof Ausleihbar);
        assertEquals("Buch: Clean Code (2008) von Robert C. Martin", b.getBeschreibung());
        assertEquals("Hörbuch: Der Hobbit (2012), 660 Min.", h.getBeschreibung());
    }

    @Test
    public void testAusleihenUndZurueckgeben() {
        Ausleihbar b = new Buch("Java", 2026, "Max Muster");
        assertFalse(b.istAusgeliehen());
        b.ausleihen();
        assertTrue(b.istAusgeliehen());
        b.zurueckgeben();
        assertFalse(b.istAusgeliehen());
    }

    @Test
    public void testEquals() {
        Buch b1 = new Buch("Dune", 1965, "Frank Herbert");
        Buch b2 = new Buch("Dune", 1965, "Frank Herbert");
        Buch b3 = new Buch("Dune", 1965, "Anderer Autor");
        Hoerbuch h1 = new Hoerbuch("Dune", 1965, 1260);
        Hoerbuch h2 = new Hoerbuch("Dune", 1965, 1260);
        Hoerbuch h3 = new Hoerbuch("Dune", 1965, 900);

        assertEquals(b1, b1);
        assertEquals(b1, b2);
        assertNotEquals(b1, b3);
        assertNotEquals(b1, h1);
        assertNotEquals(b1, null);
        assertEquals(h1, h2);
        assertNotEquals(h1, h3);
    }

    @Test
    public void testMedienListe() {
        MedienListe liste = new MedienListe();
        assertEquals(0, liste.size());
        assertEquals(0, liste.countVerfuegbar());

        Buch b1 = new Buch("Clean Code", 2008, "Robert C. Martin");
        Hoerbuch h1 = new Hoerbuch("Der Hobbit", 2012, 660);
        liste.add(b1);
        liste.add(h1);

        assertEquals(2, liste.size());
        assertEquals(2, liste.countVerfuegbar());

        b1.ausleihen();
        assertEquals(1, liste.countVerfuegbar());

        assertTrue(liste.contains(new Buch("Clean Code", 2008, "Robert C. Martin")));
        assertTrue(liste.contains(new Hoerbuch("Der Hobbit", 2012, 660)));
        assertFalse(liste.contains(new Buch("Clean Code", 2009, "Robert C. Martin")));
        assertFalse(liste.contains(null));
    }

    @Test
    public void testPrintAllReihenfolge() {
        MedienListe liste = new MedienListe();
        liste.add(new Buch("A", 2020, "Autor A"));
        liste.add(new Hoerbuch("B", 2021, 120));

        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos, true, StandardCharsets.UTF_8));
            liste.printAll();
        } finally {
            System.setOut(originalOut);
        }
        String[] lines = baos.toString(StandardCharsets.UTF_8).trim().split("\\R");
        assertEquals(2, lines.length);
        assertEquals("Buch: A (2020) von Autor A", lines[0]);
        assertEquals("Hörbuch: B (2021), 120 Min.", lines[1]);
    }
}
*/
