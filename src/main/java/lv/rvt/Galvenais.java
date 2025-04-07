package lv.rvt;

import java.util.Scanner;

public class Galvenais {    
    public static void galvenaisMenu () {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println();
        System.out.println("==========GALVENĀ IZVĒLNE==========");
        System.out.println();
        System.out.println("Izvēlieties vienu no šīm opcijām: ");
        System.out.println();
        System.out.println("(1) Rādīt tirdzniecības automāta saturu");
        System.out.println("(2) Pirkt");
        System.out.println("(3) Iziet");
        System.out.println();
        System.out.println("Rakstiet vienu no šiem cipariem, lai veiktu atbilstošo darbību: ");
        
        while (true) {
            String userInput = input.nextLine();
                if (userInput.equals("1")) {
                    Saturs.satursMenu();
                } else if (userInput.equals("2")) {
                    Pirksana.pirksanasMenu();
                } else if (userInput.equals("3")) {
                    System.out.print("\033[H\033[2J");
                    System.out.println(ConsoleColors.RED_BACKGROUND);
                    System.out.println("Programma ir beigusies.");
                    System.out.println();

                    System.exit(0);
                } 
            }
        }




    }
