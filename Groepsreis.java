package reisbureau;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Groepsreis {
    private ArrayList<Toerist> toeristen = new ArrayList<>();
    private ArrayList<Locatie> locaties = new ArrayList<>();

    public ArrayList<Locatie> getLocations() {
        return this.locaties;
    }

    public void addLocation(Locatie locationToAdd) {
        locaties.add(locationToAdd);
    }

    public ArrayList<Toerist> getTourists() {
        return this.toeristen;
    }

    public void addTourist(Toerist touristToAdd) {
        toeristen.add(touristToAdd);
    }

    public void printLocaties() {
        for (Locatie locatie : locaties) {
            System.out.print("- ");
            System.out.println(locatie);
        }
    }

    public void printLocatie(int i) {
        System.out.println(locaties.get(i));
    }

    public void printToeristBudgets() {

        System.out.println("Het huidige budget per toerist: ");
        System.out.println("==========");
        for (Toerist t : toeristen) {
            System.out.print("- ");
            System.out.println(t.getName() + " € " + t.getStringBudget());
        }
    }

    public void printToeristen() {
        for (Toerist toerist : toeristen) {
            System.out.print("- ");
            System.out.println(toerist + " uit " + toerist.getCountry());
        }
    }

}
