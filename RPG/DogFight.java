import java.util.Scanner; 
import java.util.Arrays;

public class DogFight {
    public static void begin(Scanner scnr) {
        String[] tieFighters = new String[3];
        tieFighters[0] = "TIE 1";
        tieFighters[0] = "TIE 2";
        tieFighters[0] = "TIE 3";

        int killCount = 0;
        
        System.out.println("Alright, you're call. Reinforcements are on their way. Let's do this.");
        System.out.println("");
        System.out.println("- You are now labeled as a threat. A squadron of TIE fighters have been scrambled to your position -");
        System.out.println("");

        System.out.println("Pilot, you are going to need to eliminate that sqaudron of fighters headed your way before we can bring the capital ship in for reinforcements");
        System.out.println("* Radar systems are showing three TIEs closing in fast, gotta make some quick decisions here *");
        System.out.println("\t| Roll |\t| Dive|");

        String move = scnr.next();
        Choice choice = new Choice();

        if (!(choice.validateMove(move))) {
            while (!(choice.validateMove(move))) {
                System.out.println("* Not really an option at the moment, gotta try something else *");
                move = scnr.next();
            }
        }

        if (move.equalsIgnoreCase("Roll")) {
            System.out.println("Great move pilot! Your tail gunner was able to elimate" + tieFighters[0]);
            System.out.println("Only " + (tieFighters.length - 1) + " remaining");
            killCount++;

            System.out.println("");
            System.out.println("* I can't find him, where- *");
            System.out.println("");
            System.out.println("The remaining fighter comes screaching by, flashes of green bolts are the last thing you ever see -");
            Endings ending = new Endings();
            ending.destroyed();
        }

        else {
            System.out.println("- You descend out of harms way, but lose sight of the fighters and miss a golden opportunity to take one out -");
            System.out.println("");
            System.out.println("- Sensors are beeping wildly now, a photon torpedo is closing in, what will you do? -");
            System.out.println("\t| Feel the Force |");
            scnr.nextLine();

            move = scnr.nextLine(); 

            if (!move.equalsIgnoreCase("Feel the Force")) {
                while ((!move.equalsIgnoreCase("Feel the Force"))) {
                    System.out.println("* Not really an option at the moment, gotta try something else *");
                    move = scnr.nextLine();
                }
            }
            System.out.println("- You look within to find what you have always known to be true, you possess a strong connection with the Force -");
            System.out.println("- You move with intent and vision as if you know the torpedos trajectory and the TIEs' next move -");
            System.out.println("- And in one fell swoop you misdirect the torpedo and cause two of the TIEs to collide, leaving one TIE remaining -");
            System.out.println("");
            killCount += 2;

            System.out.println("\t   |");
            System.out.println("\t   |");
            System.out.println("\t--|0|--");
            System.out.println("\t   |");
            System.out.println("\t   |");

            System.out.println("");
            System.out.println("- In the chaos and confusion the remaining fighter lost track of you it seems -");
            System.out.println("- He has aligned himself right in line with your onboard targeting computer, take the shot -");
            System.out.println("\t| Fire |");

            move = scnr.next(); 

            if (!move.equalsIgnoreCase("Fire")) {
                while ((!move.equalsIgnoreCase("Fire"))) {
                    System.out.println("* Not really an option at the moment, gotta try something else *");
                    move = scnr.next();
                }
            }
            killCount++;
            Endings ending = new Endings();
            ending.tiesDestroyed(killCount);
        }
    }
}