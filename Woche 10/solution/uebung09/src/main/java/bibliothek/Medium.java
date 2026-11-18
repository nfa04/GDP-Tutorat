package bibliothek;

public abstract class Medium implements Ausleihbar {
    private String titel;
    private int jahr;
    private boolean ausgeliehen = false;

    public Medium(String titel, int jahr) {
        this.titel = titel;
        this.jahr = jahr;
    }

    public String getTitel() {
        return titel;
    }

    public int getJahr() {
        return jahr;
    }

    @Override
    public boolean istAusgeliehen() {
        return ausgeliehen;
    }

    @Override
    public void ausleihen() {
        ausgeliehen = true;
    }

    @Override
    public void zurueckgeben() {
        ausgeliehen = false;
    }

    public abstract String getBeschreibung();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Medium other = (Medium) obj;
        return jahr == other.jahr
                && (titel == null ? other.titel == null : titel.equals(other.titel));
    }
}
