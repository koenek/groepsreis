package reisbureau;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Toerist {
    private ArrayList<Souvenir> souvenirs;
    private String naam;
    private String landVanHerkomst;
    private double budget;

    public Toerist(String naam, String land, double budget) {
        this.naam = naam;
        this.landVanHerkomst = land;
        this.budget = budget;
        this.souvenirs = new ArrayList<>();
    }

    public String toString() {
        return this.naam;
    }

    public String getName() {
        return this.naam;
    }

    public String getCountry() {
        return this.landVanHerkomst;
    }

    public String getBudget() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.budget);
    }

    public ArrayList<Souvenir> getSouvenirs() {
        return this.souvenirs;
    }

    public void buySouvenir(Souvenir s) {
/*        if (getBudget() - s.getPrice() < getBudget()) {

        }*/
    }

    public void spendMoney(double geld) {
        if (this.budget - geld < 0) {
            System.out.println(this.naam + " heeft onvoldoende budget om te kunnen betalen.");
        } else {
            this.budget -= geld;
        }
    }

    public void spendMoney(int geld) {
        double g = (double) geld;
        if (this.budget - g < 0) {
            System.out.println(this.naam + " heeft onvoldoende budget om te kunnen betalen.");
        } else {
            this.budget -= g;
        }
    }
}
