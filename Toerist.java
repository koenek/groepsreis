package reisbureau;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public double getBudget() {
        return this.budget;
    }

    public String getStringBudget() {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(this.budget);
    }

    public ArrayList<Souvenir> getSouvenirs() {
        return this.souvenirs;
    }

    public void buySouvenir(Souvenir s) {
        if ((getBudget() - s.getPrice()) > 0) {
            this.budget -= s.getPrice();
            System.out.println(this.naam + " koopt een " + s.getName());
        } else {
            System.out.println(this.naam + " wil een " + s.getName() + " kopen, maar heeft onvoldoende budget.");
        }

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

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
