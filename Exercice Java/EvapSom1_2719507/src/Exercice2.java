import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {

        //Declaration des variable d'entrée
        String nom,prenom,dateDeNaiss;

        //Declaration des variables intermediaire
        char premierChifDuJour,premierCarDuPrenom,premierChifDumois,dernierCaracDuNom;
        String deuxDernChifDeAnne;

        //Declaration du Scanner

        Scanner scanner=new Scanner(System.in);

        //Demande et recuperation de la valeur des variables d'entrée

        System.out.print("Saisir votre nom : ");
        nom=scanner.nextLine();

        System.out.print("Saisir votre prenom : ");
        prenom=scanner.nextLine();

        System.out.print("Saisir votre date de naissance (jj/mm/aa) : ");
        dateDeNaiss=scanner.nextLine();

        //Extraction des caracteres

        premierChifDuJour=dateDeNaiss.charAt(0);


        premierCarDuPrenom=prenom.charAt(0);


        premierChifDumois=dateDeNaiss.charAt(3);


        dernierCaracDuNom=nom.charAt(nom.length()-1);


        deuxDernChifDeAnne=dateDeNaiss.substring(dateDeNaiss.length()-2);

        System.out.println("Votre mot de passe est : " + premierChifDuJour + premierCarDuPrenom + premierChifDumois + dernierCaracDuNom + deuxDernChifDeAnne);

    }
}
