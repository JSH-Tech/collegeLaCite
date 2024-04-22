package Laboratoire6;

import java.util.Scanner;

public class Exercice4Permutation {

    public static void main(String[] args) {
        //Declaration du scanner
        Scanner scanner = new Scanner(System.in);

        //Demander la taille du tableau
        System.out.print("Entré la taille :");
        int taille = scanner.nextInt();
        scanner.nextLine();

        //Creation du tableau
        int[] tab = new int[taille];

        //Boucle de saisie
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Saisir tab[" + i + "] :");
            tab[i] = scanner.nextInt();
        }

        //Boucle d'affichage avant permutation
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+",");
        }
        System.out.println("]");

        //Les indice a saisir
        int premierIndice;
        int deuxiemeIndice;

        //Boucle de saisie du premier indice
        do {
            System.out.print("Saisir le premier indice appartenant a [0,4]: ");
            premierIndice = scanner.nextInt();
        } while (premierIndice<0 || premierIndice>4);

        //Boucle de saisie du deuxieme indice
        do {
            System.out.print("Saisir le second indice differement de "+premierIndice+" et appartenant a [0,4] :");
            deuxiemeIndice= scanner.nextInt();
        }while (deuxiemeIndice<0 || deuxiemeIndice>4 || deuxiemeIndice==premierIndice);

        //Declaration d'un tableau temporaire
        int [] tabtemp=new int[1];
        tabtemp[0]=tab[premierIndice];

        //Permutation des contenus
        tab[premierIndice]=tab[deuxiemeIndice];
        tab[deuxiemeIndice]=tabtemp[0];

        //Boucle d'affichage apres permutation
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+",");
        }
        System.out.print("]");
    }

}
