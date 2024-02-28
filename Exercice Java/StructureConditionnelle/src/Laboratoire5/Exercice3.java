package Laboratoire5;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int nombre;
        String nombreSaisieEnChaine;
        char premiercarac, deuxiemecarac;
        Scanner scanner=new Scanner(System.in);

        int reconversion1,reconversion2;
        do {
            System.out.print("Entrer le nombre : ");
            nombre=scanner.nextInt();

            nombreSaisieEnChaine=Integer.toString(nombre);

            premiercarac=nombreSaisieEnChaine.charAt(0);
            deuxiemecarac=nombreSaisieEnChaine.charAt(1);

             reconversion1=Character.getNumericValue(premiercarac);
             reconversion2=Character.getNumericValue(deuxiemecarac);
            if (reconversion1==0 || reconversion2==0){
                System.out.println("Aucun des deux chiffres ne doit etre egal de 0");

            }else {
                int modulo1=nombre%reconversion1;
                int modulo2=nombre%reconversion2;

                if (modulo1==0 && modulo2==0){
                    System.out.println(nombre+" est un nombre valide total.");

                } else if ((modulo1==0 && modulo2!=0) || (modulo1!=0 && modulo2==0)){
                    System.out.println(nombre+" est un nombre valide partiel.");

                } else if ((modulo1!=0 && modulo2!=0)) {
                    System.out.println(nombre+" est un nombre non valide total.");
                }
            }
        }while (reconversion1==0 || reconversion2==0);


    }
}
