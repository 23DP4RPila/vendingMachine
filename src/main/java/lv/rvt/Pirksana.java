package lv.rvt;

import java.util.Scanner;

public class Pirksana {
    public static void pirksanasUI() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("==========PIRKŠANA==========");
        System.out.println("");
        System.out.println("Ievadi produkta numuru:");
        System.out.println("(1) Uz darbību izvēlni");
        System.out.println();
        System.out.println("Numurs:");

        String userInput = input.nextLine();

        if (!(userInput.isEmpty())) {
            System.out.println();
            System.out.println("JOKS! šie produkti nav domāti pirkšanai");
        }

        if (userInput.equals("1")) {
            Darbibas.darbibasMenuUI();
            
        }
    }
}
