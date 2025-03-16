package Model;

public class Vak {

    private String naam;
    private int punten;
    private static final double CESUUR = 5.50;

    public Vak(String naam, int punten) {
        this.naam = naam;
        this.punten = punten;

    }

    public String getNaam() {
        return naam;
    }

    public int getPunten() {
        return punten;
    }

    public double getCesuur() {
        return CESUUR;
    }
}
