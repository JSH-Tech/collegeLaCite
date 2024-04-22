package Laboratoire6;

import java.util.Scanner;

public class Exercice3TabTrie {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Entré la taille :");
        int taille= scanner.nextInt();
        scanner.nextLine();

        int [] tab=new int[taille];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Saisir tab["+i+"] :");
            tab[i]=scanner.nextInt();
        }

        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i]+" ");
        }
        boolean trie=true;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]<tab[i-1]) {
                trie=false;
                System.out.println("Le tableau n'est pas trié");
                break;
            }
        }
        if (trie){
            System.out.println("Le tableau est trie");
        }

    }
}
