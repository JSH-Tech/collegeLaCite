package Laboratoire3;

import java.util.Scanner;

public class Exercice4_Heure_Minute_Seconde {

    public static void main(String[] args) {

        int nombreDeSeondeSaisie, heure,resteApreHeure, minutes, seconde;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Entrée le nombre en seconde : ");
        nombreDeSeondeSaisie=scanner.nextInt();

        heure=(nombreDeSeondeSaisie/3600);

        resteApreHeure=(nombreDeSeondeSaisie%3600);

        minutes=(resteApreHeure/60);
        seconde=(resteApreHeure%60);

        System.out.println(heure + "h" + minutes + "min" + seconde + "s");

    }
}
