/* 
Justin Scranton
CPSC 1060 - RPG
5/4/2023
*/

import java.util.Scanner;
import java.util.Random;

public class DeathStarHeist {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Star Wars: Death Star Heist");
        System.out.println("Type 'Start' to Begin Mission Briefing");
        String start = scnr.next();
        while (!start.equalsIgnoreCase("Start")) {
            start = scnr.next();
        }

        System.out.println("Okay pilot, it's up to you to infiltrate the Death Star and steal important supply chain intel.");
        System.out.println("Or we can go at it head on and try to recover some of the wreckage of a few fighters, your choice.");
        


        
        System.out.println();
        System.out.println("What will it be?");
        System.out.println("\t| Infiltrate |\t|  Attack |");

        String loudOrSneaky = scnr.next();

        Choice choice = new Choice();
        while (!choice.validateLoudOrSneaky(loudOrSneaky)) {
            System.out.println("* Not really an option at the moment, gotta try something else *");
            loudOrSneaky = scnr.next();
        }

        if (loudOrSneaky.equalsIgnoreCase("AttacK")) {
            DogFight dogFight = new DogFight();
            dogFight.begin(scnr); 
        }
        
        System.out.println("Covert, I like it, May the Force be with you.");
        System.out.println("");
        System.out.println("- Exiting Hyperspace, beginning approach -");
        System.out.println();

        System.out.println("You have entered a restricted Imperial airspace.");
        System.out.println("Please state your business and submit clearance codes for validation.");
        System.out.println("");
        System.out.println("* Better not leave them waiting to long, what should I do? *");
        System.out.println("\t| Comply |\t|  Bail |");
        System.out.println("");

        Choice choice2 = new Choice();
        String approachChoice = scnr.next();
        
        while(!(choice.validateApproachChoice(approachChoice))){
            System.out.println("* Not really an option at the moment, gotta try something else *");
            approachChoice = scnr.next();
        }   

        if (approachChoice.equalsIgnoreCase("Comply")) {
            System.out.println("Codes received, standby . . .");
            System.out.println("");
            System.out.println("You have been assigned to Docking Bay 343, proceed for landing and inspection.");
            System.out.println("- Tractor beam engaged, docking commenced, prepare for boarding - ");
            System.out.println("");

            DeathStarInterior.beginBoarding(scnr);
            DeathStarInterior.navigateBase(scnr);
        }
        else {
            Endings ending = new Endings();
            System.out.println("- Your nerves get the best of you. You turn and run -");
            ending.bailed();
        }
    }
}