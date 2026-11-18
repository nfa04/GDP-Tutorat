package bibliothek;

public class Buch extends Medium {
    private String autor;

    public Buch(String titel, int jahr, String autor) {
        super(titel, jahr);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String getBeschreibung() {
        return "Buch: " + getTitel() + " (" + getJahr() + ") von " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Buch other = (Buch) obj; // sicher, da super.equals die Klassengleichheit prüft
        return autor == null ? other.autor == null : autor.equals(other.autor);
    }
}
