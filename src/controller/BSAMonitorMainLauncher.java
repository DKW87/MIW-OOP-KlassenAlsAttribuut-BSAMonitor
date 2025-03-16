package Controller;

import Model.Score;
import Model.Vak;

import java.util.Scanner;

public class BSAMonitorMainLauncher {

    public static void main(String[] args) {

        // variabelen
        double ingevuldeCijfer;
        int behaaldePunten = 0;
        final double ONDERGRENS = 1.0;
        final double BOVENGRENS = 10.0;
        final int BSA_GRENS = 24;
        Scanner userInput = new Scanner(System.in);



        Vak[] alleVakkenArray = new Vak[7];
        alleVakkenArray[0] = new Vak("Project Fasten Your Seatbelts",12);
        alleVakkenArray[1] = new Vak("Programming",3);
        alleVakkenArray[2] = new Vak("Databases",3);
        alleVakkenArray[3] = new Vak("Personal Skills",2);
        alleVakkenArray[4] = new Vak("Project Skills",2);
        alleVakkenArray[5] = new Vak("OOP",3);
        alleVakkenArray[6] = new Vak("User Interaction",3);

        Score[] scoresArray = new Score[7];
        System.out.println("Voer behaalde cijfers in: ");
        for (int i = 0; i < alleVakkenArray.length; i++) {

            do {

                System.out.printf("%s: ", alleVakkenArray[i].getNaam());
                ingevuldeCijfer = userInput.nextDouble();
                if (ingevuldeCijfer < ONDERGRENS || ingevuldeCijfer > BOVENGRENS) {
                    System.out.printf("Foutieve invoer. Cijfer moet tussen %.1f en %.1f liggen. Probeer het opnieuw. %n", ONDERGRENS, BOVENGRENS);
                }

            } while (ingevuldeCijfer < ONDERGRENS || ingevuldeCijfer > BOVENGRENS);

            scoresArray[i] = new Score(alleVakkenArray[i],ingevuldeCijfer);

            if (ingevuldeCijfer >= alleVakkenArray[i].getCesuur()) {

                behaaldePunten += alleVakkenArray[i].getPunten();
            }

        }

        System.out.println(" ");

        for (int i = 0; i < scoresArray.length; i++) {
            System.out.printf("Vak/project: %-33s Cijfer: %4.1f Behaalde punten: %2d %n", alleVakkenArray[i].getNaam(), scoresArray[i].getCijfer(), scoresArray[i].getBehaaldePunten());
        }

        System.out.printf("%nTotaal behaalde studiepunten: %d/28 %n", behaaldePunten);
        if (behaaldePunten < BSA_GRENS) {
            System.out.printf("PAS OP: Als je zo doorgaat wordt je van school getrapt!!%nJe ligt op schema voor een negatief BSA!");
        }



    } // main

} // klasse
