package shop;

import verlag.Buch;

public class SonderEdition extends Buch {
    public double rabatt;

    public SonderEdition(String titel, double basisPreis, double rabatt) {
        super(titel, basisPreis, "Limitierte Auflage");
        this.rabatt = rabatt;
    }

    public double berechneEndpreis() {
        return this.basisPreis * (1.0 - this.rabatt);
    }
}
