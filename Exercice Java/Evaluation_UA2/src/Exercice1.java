import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        //Delcaration des variables
        int xa,ya,xb,yb,xc,yc;

        //Declaration du scanner
        Scanner scanner=new Scanner(System.in);

        //Saise des coordonées

        System.out.print("Veuillez saisir les coordonnées du premier point XA : ");
        xa=scanner.nextInt();

        System.out.print("Veuillez saisir les coordonnées du premier point YA : ");
        ya=scanner.nextInt();

        System.out.print("Veuillez saisir les coordonnées du second point XB : ");
        xb=scanner.nextInt();

        System.out.print("Veuillez saisir les coordonnées du second point YB : ");
        yb=scanner.nextInt();

        System.out.print("Veuillez saisir les coordonnées du troisième point XC : ");
        xc=scanner.nextInt();

        System.out.print("Veuillez saisir les coordonnées du troisième point YC : ");
        yc=scanner.nextInt();

        //Declaration des variables intermediaire
        double distanceab, distanceac,distancebc;

        //Calcul des distances
        distanceab=(Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2)));
        distanceac=(Math.sqrt(Math.pow(xa-xc,2)+Math.pow(ya-yc,2)));
        distancebc=(Math.sqrt(Math.pow(xb-xc,2)+Math.pow(yb-yc,2)));

        //Comparaison des distances et affichage des resultats de sortie

        if (distanceab == distanceac || distanceab==distancebc || distancebc==distanceac) {
            System.out.println("Le triangle est isocèle");
        } else if (distanceab == distanceac && distanceab==distancebc && distancebc==distanceac) {
            System.out.println("Le triangles est équilatéral");
        }else {
            System.out.println("Le triangle n'est ni isocèle ni équilatéral");
        }
    }
}
