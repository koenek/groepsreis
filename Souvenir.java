package reisbureau;

import java.text.DecimalFormat;

public class Souvenir {
    private String objectNaam;
    private double prijs;

    public Souvenir(String naam, double prijs) {
        this.objectNaam = naam;
        this.prijs = prijs;
    }

    public String getName() {
        return this.objectNaam;
    }

    public double getPrice() {
        return prijs;
    }

    public String getStringPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(this.prijs);
    }

    public String toString() {
        return this.objectNaam;
    }
}
