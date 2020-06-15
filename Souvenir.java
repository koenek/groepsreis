package reisbureau;

import java.text.DecimalFormat;

public class Souvenir {
    private String objectNaam;
    private double prijs;

    public Souvenir(String naam, double prijs) {
        this.objectNaam = naam;
        this.prijs = prijs;
    }

    public String getPrice() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.prijs);
    }

    public String toString() {
        return this.objectNaam;
    }
}
