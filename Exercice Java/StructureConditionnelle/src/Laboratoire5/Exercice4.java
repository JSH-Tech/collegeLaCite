package Laboratoire5;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        int a,b,resultat=0;
        String operateur;
        boolean operationReussi=true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier nombre : ");
        a=scanner.nextInt();

        System.out.print("Entrer le second nombre : ");
        b=scanner.nextInt();

        System.out.println("Saisir l'operateur de calcul (+,-,*,/)");
        operateur=scanner.next();
        switch (operateur){
            case "/" :
                resultat=(a/b);
              //  System.out.println(a+operateur+b+" = "+resultat);
                break;
            case "*" :
                resultat=(a*b);
              //  System.out.println(a+operateur+b+" = "+resultat);
                break;
            case "+" :
                resultat=(a+b);
              //  System.out.println(a+operateur+b+" = "+resultat);
                break;
            case "-" :
                resultat=(a-b);
               // System.out.println(a+operateur+b+" = "+resultat);
                break;
            default:
                operationReussi=false;
                System.out.println("Erreur sur l'operateur");
                break;
        }
        if (operationReussi) {
            System.out.println(a+operateur+b+" = "+resultat);
        }
    }
}
