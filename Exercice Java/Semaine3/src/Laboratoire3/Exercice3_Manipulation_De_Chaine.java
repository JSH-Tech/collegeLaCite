package Laboratoire3;

import java.util.Scanner;

public class Exercice3_Manipulation_De_Chaine {
    public static void main(String[] args) {

        int longueurDeLaChaine;
        char  _premierCaractere;
        String laChaine;
        String _chaineEnMinuscule, _chaineExtraite, _chaineRepeter, _remplacerCaractere;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Donner la chaine : ");
        laChaine=scanner.nextLine();

        longueurDeLaChaine=laChaine.length();
        System.out.println("Longueur : " + longueurDeLaChaine);
        scanner.close();
        _chaineEnMinuscule=laChaine.toLowerCase();
        System.out.println("La chaine en minuscule : " + _chaineEnMinuscule);

        _premierCaractere=laChaine.charAt(0);
        System.out.println("Premier Caractere : " + _premierCaractere);

        _chaineExtraite=laChaine.substring(3,6);
        System.out.println("La chaine est extraite est : " + _chaineExtraite);

        //String m=laChaine.replace("\(\s","");
        _chaineRepeter=laChaine.repeat(3);
        System.out.println("Chaine avec repetition : " + _chaineRepeter);

        _remplacerCaractere=laChaine.replace("o","i");
        System.out.println("Apres echange : " + _remplacerCaractere);

    }
}
