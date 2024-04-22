package Laboratoire5;

import java.util.Scanner;

public class Exercice3ChiffreDeChance {
    public static void main(String[] args) {

        int nombre, somme, premier, deuxieme, troisieme, quatrieme;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Veuillez entrer un nombre positif de quatre chiffres :");
            nombre = scanner.nextInt();
        } while (nombre < 1 || ((int) Math.log10(nombre) + 1) < 4);

        premier = nombre / 1000;
        deuxieme = (nombre % 1000) / 100;
        troisieme = (nombre % 100) / 10;
        quatrieme = (nombre % 10);
        somme = premier + deuxieme + troisieme + quatrieme;

        int nouvelsomme = 0;
        //Verification de la longueur de l'entier saisie tant que cest > 1 on entre dans la boucle
        while (((int) Math.log10(somme) + 1) > 1) {
            nouvelsomme=0;
            //Tant que la somme est superieur a 0 on execute cette boucle
            while (somme>0){
                //On calcule le dernier chiffre on affect a nouvelle somme
                nouvelsomme += somme % 10;
                //On verifie si somme est >0 c'est a dire il reste encore un chiffre? si non on sort de la boucle
                //Chiffre des dizaines
                somme =somme/ 10;
            }
            //On affecte la nouvelle somme calculer a somme pour que l'execution de la premiere boucle s'arrete
            somme=nouvelsomme;
        }

        System.out.println(nouvelsomme+" est le chiffre de chance");


    }


}
