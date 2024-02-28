package Laboratoire5;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier entre : ");
        int n = scanner.nextInt();
        scanner.close();

        int a = n / 100; // Premier chiffre
        int b = (n % 100) / 10; // Deuxième chiffre
        int c = n % 10; // Troisième chiffre les (unités)

        int resultat = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (resultat == n) {
            System.out.println(n + " est un nombre d'Armstrong.");
        } else {
            System.out.println(n + " n'est pas un nombre d'Armstrong.");
        }

    }
}
