package bibliothek;

public class Hoerbuch extends Medium {
    private int dauerMinuten;

    public Hoerbuch(String titel, int jahr, int dauerMinuten) {
        super(titel, jahr);
        this.dauerMinuten = dauerMinuten;
    }

    public int getDauerMinuten() {
        return dauerMinuten;
    }

    @Override
    public String getBeschreibung() {
        return "Hörbuch: " + getTitel() + " (" + getJahr() + "), " + dauerMinuten + " Min.";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Hoerbuch other = (Hoerbuch) obj;
        return dauerMinuten == other.dauerMinuten;
    }
}
