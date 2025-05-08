package lv.rvt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Product {
    
    public static void reader() {
    
    try (Scanner scanner = new Scanner(Paths.get("saturs.csv"))) {

        // we read the file until all lines have been read
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            System.out.println(row);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}