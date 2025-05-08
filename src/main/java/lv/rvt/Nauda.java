package lv.rvt;

import java.util.Scanner;

public class Nauda {
    static double nauda = 0;

    public static void pievienotNauduUI() {
        
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========NAUDAS PIEVIENOŠANA==========");
        System.out.println();
        System.out.println("Tev ir neierobežots naudas daudzums!");
        System.out.println("Ievieto pieņemtās monētas zīmes");
        System.out.println("Izvēlies vienu no opcijām:");
        System.out.println();
        System.out.println("Pievienotā nauda: >> " + nauda + " eiro <<");
        System.out.println();
        System.out.println("(1) Pievienot 10 centus");
        System.out.println("(2) Pievienot 20 centus");
        System.out.println("(3) Pievienot 50 centus");
        System.out.println("(4) Pievienot 1 eiro");
        System.out.println("(5) Pievienot 2 eiro");
        System.out.println("");
        System.out.println("(6) Uz darbību izvēlni");
        System.out.println("(7) Uz satura izvēlni");
        
        String userInput = input.nextLine();


        if (userInput.equals("1")) {
            nauda += 0.10;
            pievienotNauduUI();
        } else if (userInput.equals("2")) {
            nauda += 0.20;
            pievienotNauduUI();
        } else if (userInput.equals("3")) {
            nauda += 0.50;
            pievienotNauduUI();
        } else if (userInput.equals("4")) {
            nauda += 1;
            pievienotNauduUI();
        } else if (userInput.equals("5")) {
            nauda += 2;
            pievienotNauduUI();
        } else if (userInput.equals("6")) {
            Darbibas.darbibasMenuUI();
        } else if (userInput.equals("7")) {
            Saturs.raditSaturu();
        }
    }
}
