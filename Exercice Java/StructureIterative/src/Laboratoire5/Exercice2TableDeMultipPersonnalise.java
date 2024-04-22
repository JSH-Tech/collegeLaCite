package Laboratoire5;

import java.util.Scanner;

public class Exercice2TableDeMultipPersonnalise {
    public static void main(String[] args) {
        int debMultiplicande,finMultiplicande,debMultiplicateur,FinMultiplicateur;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Entrer le premier multiplicande : ");
        debMultiplicande=scanner.nextInt();

        System.out.print("Entrer le dernier multiplicande : ");
        finMultiplicande= scanner.nextInt();

        System.out.print("Entrer le premier multiplicateur : ");
        debMultiplicateur= scanner.nextInt();

        System.out.print("Entrer le Second multiplicateur : ");
        FinMultiplicateur= scanner.nextInt();

        while (debMultiplicande<=finMultiplicande){
            System.out.println(debMultiplicateur+"*"+debMultiplicande+" = "+(debMultiplicateur*debMultiplicande));
            System.out.println(FinMultiplicateur+"*"+debMultiplicande+" = "+(FinMultiplicateur*debMultiplicande));
            System.out.println("--------");

            debMultiplicande++;
        }
    }
}
