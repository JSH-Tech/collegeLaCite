import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une chaîne
        System.out.print("Veuillez saisir une chaîne de caractères : ");
        String chaine = scanner.nextLine();

        // Calculer et afficher la longueur de la chaîne
        int longueur = chaine.length();
        System.out.println("La longueur de la chaîne est : " + longueur);


        // Fermer le scanner pour éviter les fuites de ressources
        //scanner.close();

        int x=5,y=9,z=-2;
        String s="Ceci est une chaine de test";
        System.out.println("abc".compareToIgnoreCase("abc"));
        System.out.println("----------------------------------------------------------------------------");
        String ChaineMaman="Mamanetpapa";
                           // 0 1 2  3  4
        System.out.println(ChaineMaman.substring(ChaineMaman.length()-5));
    }
}