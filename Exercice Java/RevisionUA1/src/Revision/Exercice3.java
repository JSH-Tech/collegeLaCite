package Revision;

/*****************************************************************
 ** Nom & prénom : Josue Yao Abotsidia
 ** Numéro : 2719507
 ** Date : 03/02/2024
 ** Exercice : 3
 *****************************************************************/

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Veuillez entrer le premier nombre : ");
        a=scanner.nextInt();

        System.out.print("Veuillez entrer le deuxieme nombre : ");
        b=scanner.nextInt();

        System.out.print("Veuillez entrer le troisieme nombre : ");
        c=scanner.nextInt();

        int Intermediare=Math.min(a,b);
        int PlusPetit =Math.min(Intermediare,c);

        System.out.println("Le plus petit chiffre entre "+a+", "+b+" et "+c+" est "+PlusPetit);
    }
}
