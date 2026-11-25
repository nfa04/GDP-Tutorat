package verlag;

public class VerlagsKatalog {
    public static void druckeKatalogEintrag(Buch buch) {
        System.out.println(buch.titel + ": " + buch.formatiereInfo());
    }
}
