package Laboratoire6;

import java.util.Scanner;

public class Exercice1Occurrence {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int somme=0;

        System.out.print("Entrer la taille :");
        int taille= scanner.nextInt();
        scanner.nextLine();

        String []tab=new String[taille];

        for (int i = 0; i <tab.length ; i++) {

            System.out.print("Saisir tab["+i+"] :");

            tab[i]=scanner.nextLine();
        }

        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i]+" ");
        }

        System.out.print("Saisir la chaine a recherché : ");
        String chaineRechercher=scanner.nextLine();

        for (int i = 0; i < tab.length; i++) {

            if (chaineRechercher.contains(tab[i])){

                somme=somme+1;

            }

        }
        System.out.println(somme);
    }
}
