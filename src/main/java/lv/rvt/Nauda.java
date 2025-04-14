package lv.rvt;

import java.util.Scanner;

public class Nauda {
    
    public static void naudasOpcijas() {
        Scanner izvele = new Scanner(System.in);
        String izveletais = izvele.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.println("==========NAUDAS iZVĒLNE==========");
        System.out.println("");
        System.out.println("naudu Tev nedabūt");
        System.out.println("1 - uz izvēlni");

        if (izveletais.equals("1")) {
            Galvenais.galvenaisMenu();
        }
    }
}
