/* 
Justin Scranton
CPSC 1060 - RPG
5/4/2023
*/

import java.util.Scanner;

public class Choice {
    public boolean validateApproachChoice (String choice) {
        return  choice.equalsIgnoreCase("Comply") ||
                choice.equalsIgnoreCase("Bail");
    }

    public boolean validateBoardingChoice (String choice) {
        return  choice.equalsIgnoreCase("Hide") ||
                choice.equalsIgnoreCase("Wait");
    }

    public boolean validateAttackChoice (String choice) {
        return  choice.equalsIgnoreCase("Attack") ||
                choice.equalsIgnoreCase("Wait");
    }

    public boolean validateWhichWay (String choice) {
        return  choice.equalsIgnoreCase("North") ||
                choice.equalsIgnoreCase("South");
    }

    public boolean validateLoudOrSneaky (String choice) {
        return  choice.equalsIgnoreCase("Infiltrate") ||
                choice.equalsIgnoreCase("Attack");
    }

    public boolean validateMove (String choice) {
        return  choice.equalsIgnoreCase("Roll") ||
                choice.equalsIgnoreCase("Dive");
    }
}