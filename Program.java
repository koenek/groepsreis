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

        glennFinnanViaduct.addShopItem(new Souvenir("The Jacobite Steam Train Model", 125));
        glennFinnanViaduct.addShopItem(new Souvenir("Glenfinnan ansichtkaart", 2.95));

        // Maak toeristen aan die meegaan met de reis
        Toerist laura = new Toerist("Laura", "Italië", 200);
        Toerist michael = new Toerist("Michael", "USA", 150);
        Toerist fernando = new Toerist("Fernando", "Spanje", 375);
        Toerist sofia = new Toerist("Sofia", "Portugal", 188);
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
        System.out.println("----------\n");
        // Wie koopt wat?
        System.out.println("De toeristen kopen de volgende souvenirs: ");
        System.out.println("==========");

        laura.buySouvenir(lochNess.getShopItems().get(0));
        laura.buySouvenir(lochNess.getShopItems().get(2));

        michael.buySouvenir(lochNess.getShopItems().get(1));

        jonas.buySouvenir(lochNess.getShopItems().get(0));
        jonas.buySouvenir(lochNess.getShopItems().get(1));
        jonas.buySouvenir(lochNess.getShopItems().get(2));
        System.out.println("----------\n");

        schotland.printToeristBudgets();

        // Aankomst tweede locatie
        System.out.println("----------");
        System.out.print("\nWe komen aan op de tweede locatie: ");
        schotland.printLocatie(1);
        System.out.println("----------");
        // Wat is er hier te koop aan souvenirs?
        System.out.println("In de souvenirwinkel worden de volgende voorwerpen verkocht:");
        System.out.println("==========");
        glennFinnanViaduct.printShopItems();
        System.out.println("----------\n");
        // Wie koopt wat?
        System.out.println("De toeristen kopen de volgende souvenirs: ");
        System.out.println("==========");
        laura.buySouvenir(glennFinnanViaduct.getShopItems().get(0));
        michael.buySouvenir(glennFinnanViaduct.getShopItems().get(0));
        fernando.buySouvenir(glennFinnanViaduct.getShopItems().get(0));
        sofia.buySouvenir(glennFinnanViaduct.getShopItems().get(0));
        jonas.buySouvenir(glennFinnanViaduct.getShopItems().get(0));

        System.out.println("----------\n");

        schotland.printToeristBudgets();

        /* etcetera */
        System.out.println("\n.......................etcetera, etcetera, etcetera.......................\n");

        System.out.println("********* EINDE VAN DE REIS *********");
    }
}
