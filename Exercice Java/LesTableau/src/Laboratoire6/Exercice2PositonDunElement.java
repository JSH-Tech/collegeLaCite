package Laboratoire6;

import java.util.Scanner;

public class Exercice2PositonDunElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Entrer la taille :");
        int taille= scanner.nextInt();
        scanner.nextLine();

        int [] tab=new int[taille];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Saisir tab["+i+"] :");
            tab[i]=scanner.nextInt();
        }

        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i]+" ");
        }
        System.out.println();
        System.out.print("Saisir l'entier :");
        int entierRechercher= scanner.nextInt();
        boolean entierTrouve=false;
        for (int i = 0; i < tab.length; i++) {
            if (entierRechercher==tab[i]){
                System.out.println("Position = "+i);
                entierTrouve=true;
            }

        }
        if (entierTrouve==false){
            System.out.println(entierRechercher+" n'existe pas dans le tableau");
        }
    }
}
