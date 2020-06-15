package reisbureau;

import java.util.ArrayList;

public class Locatie {
    private String naam;
    private String categorie;
    private double entreePrijs;
    private ArrayList<Souvenir> winkelVoorraad;

    public Locatie(String naam, String cat, double prijs) {
        this.naam = naam;
        this.categorie = cat;
        this.entreePrijs = prijs;
        this.winkelVoorraad = new ArrayList<>();
    }

    public void addShopItem(Souvenir s) {
        winkelVoorraad.add(s);
    }

    public void printShopItems() {
        for (Souvenir s : winkelVoorraad) {
            System.out.print("- ");
            System.out.println(s + " € " + s.getPrice());
        }
    }

    public String toString() {
        return this.naam;
    }
}
