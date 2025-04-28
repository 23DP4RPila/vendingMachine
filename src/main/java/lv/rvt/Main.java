package lv.rvt;

import java.util.*;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Paths;

public class Main {

public static void main(String[] args)
{   
    Scanner izvele = new Scanner(System.in);
    String izveletais = "galvenais";

    Galvenais.galvenaisMenu();

    while (true) {
        izveletais = izvele.nextLine();

    if (izveletais.equals("galvenais")) {
        Galvenais.galvenaisMenu();
    }

}
}

}