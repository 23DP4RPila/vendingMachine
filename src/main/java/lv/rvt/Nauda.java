package lv.rvt;

import java.util.Scanner;

public class Nauda {
    
    public static void naudasOpcijas() {
        Scanner izvele = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("==========NAUDAS IZVĒLNE==========");
        System.out.println("");
        System.out.println("naudu Tev nedabūt (pagaidām)");
        System.out.println("(1) Uz galveno izvēlni");

        String izveletais = izvele.nextLine();

        if (izveletais.equals("1")) {
            Galvenais.galvenaisMenu();
        }
    }
}
