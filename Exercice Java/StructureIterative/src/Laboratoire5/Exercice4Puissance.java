package Laboratoire5;

import java.util.Scanner;

public class Exercice4Puissance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Entrer le nombre :");
        double nombre= scanner.nextDouble();

        System.out.println("Entrer l'exposant :");
        int expo= scanner.nextInt();
        double nnombre=1;
        while (expo>0){

            nnombre=nnombre*nombre;
            expo--;
        }
        System.out.println(nnombre);
    }
}
