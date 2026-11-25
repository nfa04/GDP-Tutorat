package uebung11;

import static org.junit.Assert.assertEquals;
import static uebung11.TestUtil.*;

import org.junit.Test;

public class Aufgabe22Test {
    @Test public void klassen() {
        assertClass("verlag.Buch", "public");
        assertClass("verlag.VerlagsKatalog", "public");
        assertClass("shop.SonderEdition", "package-private");
        assertClass("shop.ShopApp", "package-private");
    }

    @Test public void felder() {
        assertField("verlag.Buch", "titel", "package-private");
        assertField("verlag.Buch", "interneNotiz", "private");
        assertField("verlag.Buch", "basisPreis", "protected");
        assertField("shop.SonderEdition", "rabatt", "private");
    }

    @Test public void konstruktoren() {
        assertConstructor("verlag.Buch", "protected", String.class, double.class, String.class);
        assertConstructor("shop.SonderEdition", "package-private", String.class, double.class, double.class);
    }

    @Test public void methoden() {
        assertMethod("verlag.Buch", "getInterneNotiz", "private");
        assertMethod("verlag.Buch", "formatiereInfo", "package-private");
        assertMethod("verlag.VerlagsKatalog", "druckeKatalogEintrag", "public", cls("verlag.Buch"));
        assertMethod("shop.SonderEdition", "berechneEndpreis", "package-private");
        assertMethod("shop.ShopApp", "main", "public", String[].class);
    }

    @Test public void ausgabe() {
        assertEquals("Java Kompakt: Java Kompakt (Limitierte Auflage)\nEndpreis: 30.0 CHF",
                runMain("shop.ShopApp"));
    }
}
