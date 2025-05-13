package lv.rvt;

import java.util.Scanner;

public class Darbibas {
        Scanner input = new Scanner(System.in);

    public static void darbibasMenuUI() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========DARBĪBAS==========");
        System.out.println();
        System.out.println("Izvēlaties vienu no šīm opcijām: ");
        System.out.println();
        System.out.println("(1) Skatīt saturu");
        System.out.println("(2) Pievienot naudu");
        System.out.println("(3) Atpakaļ uz galveno izvēlni");
        System.out.println();
        System.out.println("Rakstiet vienu no šiem cipariem, lai veiktu atbilstošo darbību: ");


            String userInput = input.nextLine();
                if (userInput.equals("1")) {
                    Saturs.raditSaturu();
                } else if (userInput.equals("2")) {
                    Nauda.pievienotNauduUI();
                } else if (userInput.equals("3")) {
                    Galvenais.galvenaisMenu();
                } 
    }
}

    

    
    
