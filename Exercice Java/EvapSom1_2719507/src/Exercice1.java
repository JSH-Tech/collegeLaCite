import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        //Declaration des variables d'entrée

        double d1,d2;

        //Declaration variable intermediaire

        double DistanceConvertie;
        double DiffenceEntreMetreEtPied;

        //Declaration de la variable Valeur absolue du resultat
        double resultatValAbsolu;



        //Declaration du Scanner

        Scanner scanner=new Scanner(System.in);

        //Demande et recuperation de la valeur des variables d'entrée

        System.out.print("Saisir la 1ère distance en m : ");
        d1=scanner.nextDouble();

        System.out.print("Saisir la 2ème distance en pied : ");
        d2=scanner.nextDouble();

        //Convertion de la distance saisie en mètre, en pied

        DistanceConvertie=(d1*3.28084);

        //Calcul de la difference entre les deux distances et la valeur absolue

        DiffenceEntreMetreEtPied=(DistanceConvertie-d2);

        resultatValAbsolu=Math.abs(DiffenceEntreMetreEtPied);

        //Affichage du reusltat final

        System.out.println("La distance entre d1 : "+d1+" m et la distance d2 : "+d2+" pied est : "+resultatValAbsolu+" pied");
    }
}
