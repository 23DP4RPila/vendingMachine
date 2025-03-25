package lv.rvt;

import java.util.Scanner;

public class Pirksana {
    Scanner input = new Scanner(System.in);

    public static void pirksanasMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("==========PIRKŠANAS IZVĒLNE==========");
        System.out.println();
        System.out.println("Izvēlieties vienu no šīm opcijām: ");
        System.out.println();
        System.out.println("(1) Pievienot naudu");
        System.out.println("(2) Izvēlēties produktu");
        System.out.println("(3) Atpakaļ uz galveno izvēlni");
        System.out.println();
        System.out.println("Rakstiet vienu no šiem cipariem, lai veiktu atbilstošo darbību: ");

     while (true) {
        String userInput = input.nextLine();
            if (userInput.equals("1")) {
                // pievienot
            } else if (userInput.equals("2")) {
                // pievienot
            } else if (userInput.equals("3")) {
                // pievienot
            } 
        }
    }
}
