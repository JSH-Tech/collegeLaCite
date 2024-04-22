import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int taille;
        int somme=0;

        do {
            System.out.print("Veuillez saisir la taille du tableau : ");
            taille = scanner.nextInt();

        } while (taille<5 || taille>10);

        int []tableau=new int[taille];

        for (int i = 0; i < tableau.length; i++) {

            System.out.print("Entrer la valeur "+i+" du tableau : ");
            tableau[i]=scanner.nextInt();

        }

        for (int j = 0; j < tableau.length; j++) {

            somme=somme+tableau[j];
        }

        System.out.println("La somme est :"+somme);

        for (int i = 0; i < tableau.length; i++) {

            System.out.println("L'element "+i+" est "+tableau[i]);
        }

    }
}