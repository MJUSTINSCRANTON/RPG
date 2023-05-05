/* 
Justin Scranton
CPSC 1060 - RPG
5/4/2023
*/

import java.util.Scanner;

public class DeathStarInterior {
    public static void beginBoarding(Scanner scnr) { //beggin boarding method

        System.out.println("* Two stormtroopers are approaching for boarding, I'll need to eliminate them to acquire armor and secuirty codes for disguise *");
        System.out.println("\t| Hide |\t| Wait |");

        Choice choice = new Choice();
        String boardingChoice = scnr.next();
        
        while(!(choice.validateBoardingChoice(boardingChoice))){
            System.out.println("* Not really an option at the moment, gotta try something else *");
            boardingChoice = scnr.next();
        }   

        if (boardingChoice.equalsIgnoreCase("Hide")) { //hide option
            Endings ending = new Endings();
            System.out.println("* Not many spaces to hide in here, guess I'm going in the ducts *");
            System.out.println("- The troopers find you and you are detained");
            ending.detained();
        }
        else { //wait option
            System.out.println("- Troopers approach, barging onto the ship -");
            System.out.println("* The commander rushes to inspect the cargo hold, now could be my chance *");
            System.out.println("\t| Attack |\t| Wait |");

            Choice choice2 = new Choice();
            String attackChoice = scnr.next();
        
            while(!(choice2.validateAttackChoice(attackChoice))){
                System.out.println("* Not really an option at the moment, gotta try something else *");
                attackChoice = scnr.next();
            }   
            
            if (attackChoice.equalsIgnoreCase("Attack")) { //attack option
                System.out.println("- You catch the trooper off guard by attacking so quickly -");
                System.out.println("- With his weapon and the element of the surprise, you easily eliminate the commander as well -");
                System.out.println("* That was easier than I thought, time to get a move on *");
                System.out.println("");
            }
            else { //wait option
                Endings ending = new Endings();
                System.out.println("- The commander approves your inspection, your cargo is offloaded =, and they send you on your way -");
                System.out.println("");
                ending.restricted();
            }
        }
    }

    public static void navigateBase(Scanner scnr) {
        String youAreHere = "Docking Bay 343";
        System.out.println("* If I'm gonna make it to this level's data center, I'm gonna need to plot my course *");
        BaseMap.loadMap(youAreHere);
        System.out.println("");

        System.out.println("\t| North |\t| South |");

        Choice choice3 = new Choice();
        String moveChoice = scnr.next();
    
        while(!(choice3.validateWhichWay(moveChoice))){
            System.out.println("* Not really an option at the moment, gotta try something else *");
            moveChoice = scnr.next();
        }   
        
        if (moveChoice.equalsIgnoreCase("North")) { //north corridor
            Endings ending = new Endings();
            youAreHere = "Data Center 1";
            System.out.println("- The corridor is clear, you make it to the data center and are able to extract the data -");
            BaseMap.loadMap(youAreHere);
            System.out.println("- You return to find a nearby patrol waiting for you and you are detained -");
            System.out.println("- They notice you are in possession of vital Imperial information and escort you to interrogation -");
            System.out.println("");
            ending.vader();
        }
        else { //south corridor 
            Endings ending = new Endings();
            youAreHere = "Data Center 2";
            System.out.println("- Surprisingly, the corridor is clear, you make it to the data center and are able to extract the data -");
            BaseMap.loadMap(youAreHere);
            System.out.println("- You plant an explosive in the barracks, the blast is loud enough to draw every troop on the level, you make a quick exit to your ship -");
            ending.escape();
        }
    }
}