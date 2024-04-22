package Laboratoire5;
import java.util.Scanner;
public class Exercice1TableDeMultiplicationV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplicande;
        int multiplicateur;
        do {
            System.out.print("Veuillez entre la valeur du multiplicande compris entre 1 et 9:");
            multiplicande = scanner.nextInt();
        } while (multiplicande<1 || multiplicande>9);

        for (multiplicateur=0;multiplicateur<=10;multiplicateur++){
            System.out.println(multiplicateur+" * "+multiplicande+ " = "+ (multiplicateur*multiplicande));
        }


    }
}
