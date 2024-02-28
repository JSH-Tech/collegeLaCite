package Revision;

/*****************************************************************
 ** Nom & prénom : Josue Yao Abotsidia
 ** Numéro : 2719507
 ** Date : 03/02/2024
 ** Exercice : 2
 *****************************************************************/
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        String nom, prenom, email;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Veuillez entrer le nom : ");
        nom=scanner.nextLine();

        System.out.println("Veuillez entrer le prenom : " );
        prenom=scanner.nextLine();

        String lestroispremierelettre=nom.substring(0,3);
        String lestroispremieremaj=lestroispremierelettre.toUpperCase();

        String lesdeuxpremierelettre=prenom.substring(0,2);
        String lesdeuxpremiereminus=lesdeuxpremierelettre.toLowerCase();

        email=lestroispremieremaj+"."+lesdeuxpremiereminus+"@Lacitec.on.ca";

        System.out.println(email);


    }
}
