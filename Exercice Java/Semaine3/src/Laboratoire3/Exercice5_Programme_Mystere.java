package Laboratoire3;

import java.util.Scanner;

public class Exercice5_Programme_Mystere {
    public static void main(String[] args) {
        System.out.print("Saisir un entier à trois chiffres : ");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int x = nb % 10;
        int y = (nb%100)/10;
        int z = nb/100;
        int res = x * 100 + y * 10 + z;
        System.out.print("res = "+res);

        //La sortie est 596
    }
}
