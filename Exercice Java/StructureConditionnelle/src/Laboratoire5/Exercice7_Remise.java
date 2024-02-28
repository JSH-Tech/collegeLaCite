package Laboratoire5;

import java.util.Scanner;

public class Exercice7_Remise {
    public static void main(String[] args) {
         double montant, tauxDeRemise, remise,NAP;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Veuillez entrer le montant : ");
        montant=scanner.nextDouble();

         if (montant>=100 && montant<=500){
             tauxDeRemise=0.05;
             remise=montant*tauxDeRemise;
             NAP=montant-remise;
             System.out.println("La remise est de : "+remise);
             System.out.println("Let net a payé est de : "+NAP);
         } else if (montant>500) {
             tauxDeRemise=0.08;
             remise=montant*tauxDeRemise;
             NAP=montant-remise;
             System.out.println("La remise est de : "+remise);
             System.out.println("Let net a payé est de : "+NAP);
         }
    }
}
