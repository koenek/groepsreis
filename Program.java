package reisbureau;

public class Program {
    public static void main(String[] args) {

        // Maak een nieuwe groepsreis aan
        Groepsreis schotland = new Groepsreis();

        // Maak wat locaties aan die tijdens de groepsreis zullen worden bezocht
        Locatie lochNess = new Locatie("Loch Ness", "Bezienswaardigheid", 0);
        Locatie glennFinnanViaduct = new Locatie("Glenfinnan-Viaduct", "Bezienswaardigheid", 0);
        Locatie eileanDonanCastle = new Locatie("EileanDonanCastle", "Bezienswaardigheid", 15);
        Locatie edinburgh = new Locatie("Edinburgh", "Stad", 100);
        Locatie benNevisDistillery = new Locatie("Ben Nevis Distillery", "Touristische attractie", 30);

        // Voeg aangemaakte locaties toe aan groepsreis
        schotland.addLocation(lochNess);
        schotland.addLocation(glennFinnanViaduct);
        schotland.addLocation(eileanDonanCastle);
        schotland.addLocation(edinburgh);
        schotland.addLocation(benNevisDistillery);

        // Voeg souvenirs toe per locatie
        lochNess.addShopItem(new Souvenir("Nessie Mok", 3.95));
        lochNess.addShopItem(new Souvenir("Nessie Koelkastmagneet", 3.00));
        lochNess.addShopItem(new Souvenir("Loch Ness ansichtkaart", 1.95));

        // Maak toeristen aan die meegaan met de reis
        Toerist laura = new Toerist("Laura", "Italië", 500);
        Toerist michael = new Toerist("Michael", "USA", 450);
        Toerist fernando = new Toerist("Fernando", "Spanje", 675);
        Toerist sofia = new Toerist("Sofia", "Portugal", 688);
        Toerist jonas = new Toerist("Jonas", "Duitsland", 75);

        // Voeg aangemaakte toeristen toe aan groepsreis
        schotland.addTourist(laura);
        schotland.addTourist(michael);
        schotland.addTourist(fernando);
        schotland.addTourist(sofia);
        schotland.addTourist(jonas);

        // Daadwerkelijke programma
        // Welkomstbericht
        System.out.println("Welkom bij de groepsreis! \n" +
                "========== \n" +
                "Deze groepsreis gaat langs de volgende locaties in Schotland: ");
        schotland.printLocaties();

        System.out.println("----------");

        // Wie gaan er mee?
        System.out.println("\nOp deze reis gaan mee: ");
        System.out.println("==========");
        schotland.printToeristen();
        System.out.println("----------\n");
        schotland.printToeristBudgets();

        // Aankomst eerste locatie
        System.out.println("----------");
        System.out.print("\nWe komen aan op de eerste locatie: ");
        schotland.printLocatie(0);
        System.out.println("----------");
        // Wat is er hier te koop aan souvenirs?
        System.out.println("In de souvenirwinkel worden de volgende voorwerpen verkocht:");
        System.out.println("==========");
        lochNess.printShopItems();


    }
}
