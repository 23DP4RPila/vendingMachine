package lv.rvt;

import java.util.Scanner;

public class Pirksana {
    public static void pirksanasUI() {

        System.out.print("\033[H\033[2J");
        System.out.println("==========PIRKŠANA==========");
        System.out.println("");
        System.out.println("Ievadi produkta numuru:");
        System.out.println("(1) Uz darbību izvēlni");
        System.out.println();
        System.out.println("Numurs Formātā BurtsCipars (A-F;1-5 - piemēram, A2):");
    }



    public static void pirksana() {
        
        while(true) {
            Scanner input = new Scanner(System.in);

            String userInput = input.nextLine();
        if (userInput.equals("A1")) {
            System.out.println("Tu nopirki: Vangažu Čipsi - Kraukšķīgie kartupeļi 100g, 1.95€");
            Products.appendList(0);
        } else if (userInput.equals("A2")) {
            System.out.println("Tu nopirki: Augļu un riekstu maisījums Energy Limi 500g, 6.00€");
            Products.appendList(1);
        } else if (userInput.equals("A3")) {
            System.out.println("Tu nopirki: Dabīgais minerālūdens Angļi 0.75L, 1.25€");
            Products.appendList(2);
        } else if (userInput.equals("A4")) {
            System.out.println("Tu nopirki: Gāzēts dzēriens Lepsi, 1.50€");
            Products.appendList(3);
        } else if (userInput.equals("A5")) {
            System.out.println("Tu nopirki: Gāzēts dzēriens Mana Kola 0.33L, 1.50€");
            Products.appendList(4);
        } else if (userInput.equals("B1")) {
            System.out.println("Tu nopirki: Batoniņš Fnickers šs Danone persiku 125g, 0.85€");
            Products.appendList(5);
        } else if (userInput.equals("B2")) {
            System.out.println("Tu nopirki: Jogurs Tutta daudzaugļu 1L, 1.55€");
            Products.appendList(6);
        } else if (userInput.equals("B3")) {
            System.out.println("Tu nopirki: Sula Sido dzērveņu 1L, 1.70€");
            Products.appendList(7);
        } else if (userInput.equals("B4")) {
            System.out.println("Tu nopirki: Cepumi Loreo šokolādes 154g, 1.80€");
            Products.appendList(8);
        } else if (userInput.equals("B5")) {
            System.out.println("Tu nopirki: Batoniņš Karss šokolādes 51g, 0.85€");
            Products.appendList(9);
        } else if (userInput.equals("C1")) {
            System.out.println("Tu nopirki: Jogurts Dzertimel zemeņu 100g, 0.90€");
            Products.appendList(10);
        } else if (userInput.equals("C2")) {
            System.out.println("Tu nopirki: Cepumi Digestive pilngraudu 400g, 2.00€");
            Products.appendList(11);
        } else if (userInput.equals("C3")) {
            System.out.println("Tu nopirki: Sula Šokolādes 50g, 0.85€");
            Products.appendList(12);
        } else if (userInput.equals("C4")) {
            System.out.println("Tu nopirki: Batoniņš Swikss šokolādes 50g, 0.85€");
            Products.appendList(13);
        } else if (userInput.equals("C5")) {
            System.out.println("Tu nopirki: Cepumi Nelga klasiskie 180g, 1.20€");
            Products.appendList(14);
        } else if (userInput.equals("D1")) {
            System.out.println("Tu nopirki: Jogurts Danone banānu 125g, 0.85€");
            Products.appendList(15);
        } else if (userInput.equals("D2")) {
            System.out.println("Tu nopirki: Sula Sido ābolu 1L, 1.50€");
            Products.appendList(16);
        } else if (userInput.equals("D3")) {
            System.out.println("Tu nopirki: Cepumi Leibniz sviesta 200g, 1.70€");
            Products.appendList(17);
        } else if (userInput.equals("D4")) {
            System.out.println("Tu nopirki: Batoniņš NaudKakis šokolādes 41.5g, 0.90€");
            Products.appendList(18);
        } else if (userInput.equals("D5")) {
            System.out.println("Tu nopirki: Sula Tutta apelsīnu 1L, 1.60€");
            Products.appendList(19);
        } else if (userInput.equals("E1")) {
            System.out.println("Tu nopirki: Jogurts Dzertimel melleņu 100g, 0.90€");
            Products.appendList(20);
        } else if (userInput.equals("E2")) {
            System.out.println("Tu nopirki: Cepumi Tutta ar šokolādi 150g, 1.50€");
            Products.appendList(21);
        } else if (userInput.equals("E3")) {
            System.out.println("Tu nopirki: Sula Sido vīnogu 1L, 1.65€");
            Products.appendList(22);
        } else if (userInput.equals("E4")) {
            System.out.println("Tu nopirki: Batoniņš County šokolādes 57g, 0.85€");
            Products.appendList(23);
        } else if (userInput.equals("E5")) {
            System.out.println("Tu nopirki: Cepumi Loreo šokolādes 154g, 1.80€");
            Products.appendList(24);
        } else if (userInput.equals("F1")) {
            System.out.println("Tu nopirki: Cepumi Digestive pilngraudu 400g, 2.00€");
            Products.appendList(25);
        } else if (userInput.equals("F2")) {
            System.out.println("Tu nopirki: Jogurts Staltais vaniļas 150g, 0.80€");
            Products.appendList(26);
        } else if (userInput.equals("F3")) {
            System.out.println("Tu nopirki: Sula Sido dzērveņu 1L, 1.70€");
            Products.appendList(27);
        } else if (userInput.equals("F4")) {
            System.out.println("Tu nopirki: Cepumi Nelga klasiskie 180g, 1.20€");
            Products.appendList(28);
        } else if (userInput.equals("F5")) {
            System.out.println("Tu nopirki: Batoniņš Bruners šokolādes 50g, 0.85€");
            Products.appendList(29);
        }
    }
}
}