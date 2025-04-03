package lv.rvt;

import java.util.Scanner;

public class Saturs {
        Scanner input = new Scanner(System.in);

    public static void satursMenu() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========AUTOMĀTA SATURS==========");
        System.out.println();
        System.out.println("Izvēlieties vienu no šīm opcijām: ");
        System.out.println();
        System.out.println("(1) Skatīt produktus");
        System.out.println("(2) Pievienot naudu");
        System.out.println("(3) Atpakaļ uz galveno izvēlni");
        System.out.println();
        System.out.println("Rakstiet vienu no šiem cipariem, lai veiktu atbilstošo darbību: ");

        while (true) {
            String userInput = input.nextLine();
                if (userInput.equals("1")) {
                    raditSaturu();
                } else if (userInput.equals("2")) {
                    Pirksana.pievienotNauduUI();
                } else if (userInput.equals("3")) {
                    Galvenais.galvenaisMenu();
                } 
        }
    }

    public static void raditSaturu() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.println("Te tiktu rādīts automāta saturs");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("daudz vietas - ņemts no XML faila");

        while (true) {
            // if... kaut kas
        }
    }
}
