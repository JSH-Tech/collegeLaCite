package Revision;

/*****************************************************************
 ** Nom & prénom : Josue Yao Abotsidia
 ** Numéro : 2719507
 ** Date : 03/02/2024
 ** Exercice : 1
 *****************************************************************/
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        double distanceSaisie, distanceEnPousse;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Veuillez entrer la distance en mettre : ");
        distanceSaisie=scanner.nextDouble();
        distanceEnPousse=(distanceSaisie/39.37);
        System.out.println(distanceSaisie+" metres = "+distanceEnPousse+" pouces.");

    }
}
