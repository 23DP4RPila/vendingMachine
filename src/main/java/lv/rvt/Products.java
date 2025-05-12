package lv.rvt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
                "A1, Ādažu Čipsi - Kraukšķīgie kartupeļi 100g, 1.95,                  ", 
                "A2, Augļu un riekstu maisījums Energy Rimi 500g, 6.00,               ",
                "A3, Dabīgais minerālūdens Mangaļi 0.75L, 1.25,                       ", 
                "A4, Gāzēts dzēriens Pepsi, 1.50,                                     ", 
                "A5, Gāzēts dzēriens Coca Cola 0.33L, 1.50,                           ", 
                "",
                "B1, Batoniņš Snickers šokolādes 50g, 0.85,                           ", 
                "B2, Jogurts Danone persiku 125g, 0.85,                               ", 
                "B3, Sula Cido dzērveņu 1L, 1.70,                                     ", 
                "B4, Cepumi Oreo šokolādes 154g, 1.80,                                ", 
                "B5, Batoniņš Mars šokolādes 51g, 0.85,                               ", 
                "",
                "C1, Jogurts Actimel zemeņu 100g, 0.90,                               ", 
                "C2, Cepumi Digestive pilngraudu 400g, 2.00,                          ", 
                "C3, Sula Gutta daudzaugļu 1L, 1.55,                                  ", 
                "C4, Batoniņš Twix šokolādes 50g, 0.85,                               ", 
                "C5, Cepumi Selga klasiskie 180g, 1.20,                               ", 
                "",
                "D1, Jogurts Danone banānu 125g, 0.85,                                ", 
                "D2, Sula Cido ābolu 1L, 1.50,                                        ", 
                "D3, Cepumi Leibniz sviesta 200g, 1.70,                               ", 
                "D4, Batoniņš KitKat šokolādes 41.5g, 0.90,                           ", 
                "D5, Sula Gutta apelsīnu 1L, 1.60,                                    ", 
                "",
                "E1, Jogurts Actimel melleņu 100g, 0.90,                              ", 
                "E2, Cepumi Gutta ar šokolādi 150g, 1.50,                             ", 
                "E3, Sula Cido vīnogu 1L, 1.65,                                       ", 
                "E4, Batoniņš Bounty šokolādes 57g, 0.85,                             ", 
                "E5, Cepumi Oreo šokolādes 154g, 1.80,                                ", 
                "",
                "F1, Cepumi Digestive pilngraudu 400g, 2.00,                          ", 
                "F2, Jogurts Baltais vaniļas 150g, 0.80,                              ", 
                "F3, Sula Cido dzērveņu 1L, 1.70,                                     ", 
                "F4, Cepumi Selga klasiskie 180g, 1.20,                               ", 
                "F5, Batoniņš Snickers šokolādes 50g, 0.85,                           " 
               };




}