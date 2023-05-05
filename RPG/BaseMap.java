/* 
Justin Scranton
CPSC 1060 - RPG
5/4/2023
*/

import java.util.Scanner;

public class BaseMap {
    public static void loadMap(String youAreHere) {
        
        if (youAreHere.equalsIgnoreCase("Docking Bay 343")) {
            System.out.println("- You are here: " + youAreHere + " -");
            System.out.println("* I can either take the north corridor for a straight shot to Level 300 Data Center 1 or I can try to slip passed the barracks and head south to Data Center 2 *");
            System.out.println("");
        }
        else if (youAreHere.equalsIgnoreCase("Data Center 1")) {
            System.out.println("* It's a straight shot back to the ship, I'm almost out of here *");
            System.out.println("");
        }
        else {
            System.out.println("* Since the barracks are empty, I think I'll cause a diversion to ensure a safe path back to the ship *");
            System.out.println("");
        }
    }
}