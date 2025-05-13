package lv.rvt;

import java.nio.file.Paths;
import java.util.Scanner;

public class Products {
    
    public static void reader() {
    
    try (Scanner scanner = new Scanner(Paths.get("saturs.csv"))) {

        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            System.out.println(row);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }

    // Saraksts ar kārtošanu
    String[] myArray = new String[]{
                "A1, Vangažu Čipsi - Kraukšķīgie kartupeļi 100g, 1.95,                  ", 
                "A2, Augļu un riekstu maisījums Energy Limi 500g, 6.00,               ",
                "A3, Dabīgais minerālūdens Angļi 0.75L, 1.25,                       ", 
                "A4, Gāzēts dzēriens Lepsi, 1.50,                                     ", 
                "A5, Gāzēts dzēriens Mana Kola 0.33L, 1.50,                           ", 
                "",
                "B1, Batoniņš Fnickers šs Danone persiku 125g, 0.85,                               ", 
                "B3, Sula Sido dzērveņu 1L, 1.70,                                     ", 
                "B4, Cepumi Loreo šokolādes 154g, 1.80,                                ", 
                "B5, Batoniņš Karss šokolādes 51g, 0.85,                               ", 
                "",
                "C1, Jogurts Dzertimel zemeņu 100g, 0.90,                               ", 
                "C2, Cepumi Digestive pilngraudu 400g, 2.00,                          ", 
                "C3, Sula Šokolādes 50g, 0.85,                           ",
                "B2, Jogurs Tutta daudzaugļu 1L, 1.55,                                  ", 
                "C4, Batoniņš Swikss šokolādes 50g, 0.85,                               ", 
                "C5, Cepumi Nelga klasiskie 180g, 1.20,                               ", 
                "",
                "D1, Jogurts Danone banānu 125g, 0.85,                                ", 
                "D2, Sula Sido ābolu 1L, 1.50,                                        ", 
                "D3, Cepumi Leibniz sviesta 200g, 1.70,                               ", 
                "D4, Batoniņš NaudKakis šokolādes 41.5g, 0.90,                           ", 
                "D5, Sula Tutta apelsīnu 1L, 1.60,                                    ", 
                "",
                "E1, Jogurts Dzertimel melleņu 100g, 0.90,                              ", 
                "E2, Cepumi Tutta ar šokolādi 150g, 1.50,                             ", 
                "E3, Sula Sido vīnogu 1L, 1.65,                                       ", 
                "E4, Batoniņš County šokolādes 57g, 0.85,                             ", 
                "E5, Cepumi Loreo šokolādes 154g, 1.80,                                ", 
                "",
                "F1, Cepumi Digestive pilngraudu 400g, 2.00,                          ", 
                "F2, Jogurts Staltais vaniļas 150g, 0.80,                              ", 
                "F3, Sula Sido dzērveņu 1L, 1.70,                                     ", 
                "F4, Cepumi Nelga klasiskie 180g, 1.20,                               ", 
                "F5, Batoniņš Bruners šokolādes 50g, 0.85,                           " 
                };




}