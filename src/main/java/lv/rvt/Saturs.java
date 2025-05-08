package lv.rvt;

import java.util.Scanner;

public class Saturs {
    public static void raditSaturu() {
        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("");
        System.out.println("(1) Uz izvēlni | (2) Pievienot naudu | (3) Uz pirkšanas izvēlni");
        System.out.println("");
        System.out.println("╔══════════════════════════════ RINDA 1 ══════════════════════════════╗");
        System.out.println("║A1, Ādažu Čipsi - Kraukšķīgie kartupeļi 100g, 1.95,                  ║");
        System.out.println("║A2, Augļu un riekstu maisījums Energy Rimi 500g, 6.00,               ║");
        System.out.println("║A3, Dabīgais minerālūdens Mangaļi 0.75L, 1.25,                       ║");
        System.out.println("║A4, Gāzēts dzēriens Pepsi, 1.50,                                     ║");
        System.out.println("║A5, Gāzēts dzēriens Coca Cola 0.33L, 1.50,                           ║");
        System.out.println("╠══════════════════════════════ RINDA 2 ══════════════════════════════╣");
        System.out.println("║B1, Batoniņš Snickers šokolādes 50g, 0.85,                           ║");
        System.out.println("║B2, Jogurts Danone persiku 125g, 0.85,                               ║");
        System.out.println("║B3, Sula Cido dzērveņu 1L, 1.70,                                     ║");
        System.out.println("║B4, Cepumi Oreo šokolādes 154g, 1.80,                                ║");
        System.out.println("║B5, Batoniņš Mars šokolādes 51g, 0.85,                               ║");
        System.out.println("╠══════════════════════════════ RINDA 3 ══════════════════════════════╣");
        System.out.println("║C1, Jogurts Actimel zemeņu 100g, 0.90,                               ║");
        System.out.println("║C2, Cepumi Digestive pilngraudu 400g, 2.00,                          ║");
        System.out.println("║C3, Sula Gutta daudzaugļu 1L, 1.55,                                  ║");
        System.out.println("║C4, Batoniņš Twix šokolādes 50g, 0.85,                               ║");
        System.out.println("║C5, Cepumi Selga klasiskie 180g, 1.20,                               ║");
        System.out.println("╠══════════════════════════════ RINDA 4 ══════════════════════════════╣");
        System.out.println("║D1, Jogurts Danone banānu 125g, 0.85,                                ║");
        System.out.println("║D2, Sula Cido ābolu 1L, 1.50,                                        ║");
        System.out.println("║D3, Cepumi Leibniz sviesta 200g, 1.70,                               ║");
        System.out.println("║D4, Batoniņš KitKat šokolādes 41.5g, 0.90,                           ║");
        System.out.println("║D5, Sula Gutta apelsīnu 1L, 1.60,                                    ║");
        System.out.println("╠══════════════════════════════ RINDA 5 ══════════════════════════════╣");
        System.out.println("║E1, Jogurts Actimel melleņu 100g, 0.90,                              ║");
        System.out.println("║E2, Cepumi Gutta ar šokolādi 150g, 1.50,                             ║");
        System.out.println("║E3, Sula Cido vīnogu 1L, 1.65,                                       ║");
        System.out.println("║E4, Batoniņš Bounty šokolādes 57g, 0.85,                             ║");
        System.out.println("║E5, Cepumi Oreo šokolādes 154g, 1.80,                                ║");
        System.out.println("╠══════════════════════════════ RINDA 6 ══════════════════════════════╣");
        System.out.println("║F1, Cepumi Digestive pilngraudu 400g, 2.00,                          ║");
        System.out.println("║F2, Jogurts Baltais vaniļas 150g, 0.80,                              ║");
        System.out.println("║F3, Sula Cido dzērveņu 1L, 1.70,                                     ║");
        System.out.println("║F4, Cepumi Selga klasiskie 180g, 1.20,                               ║");
        System.out.println("║F5, Batoniņš Snickers šokolādes 50g, 0.85,                           ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════╝ ");
        System.out.println("");
        System.out.println("(1) Uz izvēlni | (2) Pievienot naudu | (3) Uz pirkšanas izvēlni");
        System.out.println("");

        String userInput = input.nextLine();

        
        if (userInput.equals("1")) {
            Darbibas.darbibasMenuUI();
        } else if (userInput.equals("2")) {
            Nauda.pievienotNauduUI();
        } else if (userInput.equals("3")) {
            Pirksana.pirksanasUI();
        } else if (userInput.equals("4")) {
            
        }
        
    }
}

