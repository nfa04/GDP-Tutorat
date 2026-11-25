package shop;

import verlag.VerlagsKatalog;

public class ShopApp {
    public static void main(String[] args) {
        SonderEdition edition = new SonderEdition("Java Kompakt", 40.0, 0.25);
        VerlagsKatalog.druckeKatalogEintrag(edition);
        System.out.println("Endpreis: " + edition.berechneEndpreis() + " CHF");
    }
}
