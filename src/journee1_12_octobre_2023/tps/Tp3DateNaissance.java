package journee1_12_octobre_2023.tps;

import java.time.Year;
import java.util.Scanner;

public class Tp3DateNaissance {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Donnez votre âge : ");
        var age = input.nextInt();

        var currentYear = Year.now().getValue();
        var birthYear = currentYear - age;

        System.out.printf("Votre année de naissance est : %d\n", birthYear);
        input.close();
    }
}
