/* 
Justin Scranton
CPSC 1060 - RPG
5/4/2023
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Endings {
    public void detained() {
        System.out.println("- Mission Failed: You have been taken into custody and no reinforcements are available.");
        System.out.println("");
        System.exit(0);
    }

    public void destroyed() {
        System.out.println("- Mission Failed: The sheer amount of fighters is overwhelming. You are destroyed.");
        System.out.println("");
        System.exit(0);
    }

    public void bailed() {
        System.out.println("- Mission Failed: You abandon your mission and have let the Rebellion down tremendously. -");
        System.out.println("");
        System.exit(0);
    }

    public void vader() {
        System.out.println("- Mission Failed: The last thing you ever hear is the heavy breathing of a brutal Sith who squeezes every last bit of information out of you before taking your life -");
        System.out.println("");
        System.exit(0);
    }
    
    public void restricted() {
        System.out.println("- Mission Failed: You were too passive and the troopers were able to quickly offload your cargo before restricting you from further accessing the base -");
        System.out.println("");
        System.exit(0);
    }

    public void escape() {
        System.out.println("- Mission Success: In the midst of the chaos and confusion you slip away and the Empire is embarrasingly outsmarted by the Rebllion's newest hero -");
        System.out.println("");
        System.exit(0);
    }

    public void tiesDestroyed(int killCount) {
        System.out.println("- Mission Success: Great shooting pilot! Reinforcements are on their way -");
        System.out.println("");
        System.exit(0);
    }
}