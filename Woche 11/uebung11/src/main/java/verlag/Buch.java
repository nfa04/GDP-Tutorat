package verlag;

public class Buch {
    public String titel;
    public String interneNotiz;
    public double basisPreis;

    public Buch(String titel, double basisPreis, String interneNotiz) {
        this.titel = titel;
        this.basisPreis = basisPreis;
        this.interneNotiz = interneNotiz;
    }

    public String getInterneNotiz() {
        return this.interneNotiz;
    }

    public String formatiereInfo() {
        return this.titel + " (" + this.getInterneNotiz() + ")";
    }
}
