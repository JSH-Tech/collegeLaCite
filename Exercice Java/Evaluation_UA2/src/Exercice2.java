import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        //Declaration du scanner
        Scanner scanner = new Scanner(System.in);

        //Declaration des variables
        int valeursaisie = -1;
        int ncb = 0;
        int somme=0;

        //Generation du nombre aléatoire
        ncb = (int) (100 * Math.random());

        //Jai utilisé la boucle While par ce que la condition doit est vérifié avant l'execution du bloc d'instruction

        while (ncb != valeursaisie){

            //Saisie de la valeur
            do {
                //J'ai utilisé la boucle do-While par ce que on doit executé le bloc d'instruction au moins une fois.

                System.out.print("Veuillez un entier :");
                valeursaisie = scanner.nextInt();

            } while (valeursaisie < 0 || valeursaisie > 100);


            //Condition de validation du nombre

            if (ncb == valeursaisie) {
                System.out.println("Bravo");

            } else if (ncb > valeursaisie) {
                System.out.println("Nombre caché est supérieur");

            } else {
                System.out.println("Nombre caché est inférieur");
            }
            somme++;
        }
        System.out.println("Vous avez trouvé le nombre caché en "+somme+" tentative(s)");

    }
}
