package lv.rvt;

import java.util.Scanner;

public class Pirksana {

    static void pirksanasMenu() {
        
        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========PIRKŠANA==========");
        System.out.println();
        System.out.println("Izvēlieties vienu no šīm opcijām: ");
        System.out.println();
        System.out.println("(1) Pievienot naudu");
        System.out.println("(2) Izvēlēties produktu");
        System.out.println("(3) Atpakaļ uz galveno izvēlni");
        System.out.println();
        System.out.println("Rakstiet vienu no šiem cipariem, lai veiktu atbilstošo darbību: ");

     while (true) {
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

            if (userInput.equals("1")) {
                pievienotNauduUI();
            } else if (userInput.equals("2")) {
                pirksanasUI();
            } else if (userInput.equals("3")) {
                Galvenais.galvenaisMenu();
            } 
        }
    }


    static void pievienotNauduUI() {
        double nauda = 0;
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========NAUDAS PIEVIENOŠANA==========");
        System.out.println();
        System.out.println("Ievieto pieņemtās monētas zīmes");
        System.out.println("Izvēlies vienu no opcijām:");
        System.out.println();
        System.out.println("(1) Pievienot 10 centus");
        System.out.println("(2) Pievienot 20 centus");
        System.out.println("(3) Pievienot 50 centus");
        System.out.println("(4) Pievienot 1 eiro");
        System.out.println("(5) Pievienot 2 eiro");
        System.out.println("(6) Atpakaļ uz pirkšanas izvēlni");
        System.out.println("Pievienotā nauda:" + nauda);
        System.out.println();
        System.out.println("(7) Uz satura izvēlni");

        if (userInput == "1") {
            nauda += 0.10;
            pievienotNauduUI();
        } else if (userInput == "2") {
            nauda += 0.20;
            pievienotNauduUI();
        } else if (userInput == "3") {
            nauda += 0.50;
            pievienotNauduUI();
        } else if (userInput == "4") {
            nauda += 1;
            pievienotNauduUI();
        } else if (userInput == "5") {
            nauda += 2;
            pievienotNauduUI();
        } else if (userInput == "6") {
            pirksanasMenu();
        } else if (userInput == "7") {
            Saturs.satursMenu();
        }
    }

    public static void pirksanasUI() {
        System.out.print("\033[H\033[2J");
        System.out.println("Šeit ir plānots:");
        System.out.println("- pirkumu grozs un tā informācija");
        System.out.println("- ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("");


        


    }
}
