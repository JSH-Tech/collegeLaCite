package Laboratoire6;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Exercice5NbConssonneVoyelle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sommeVoyelle =0;
        int sommeConssonne=0;
        int sommeEspace=0;
        int sommeDivers=0;

        System.out.println("Saisir la chaine :");
        String chaineSaisie= scanner.nextLine();

        String [] tabChaine=new String[chaineSaisie.length()];

        for (int i = 0; i <tabChaine.length ; i++) {
            tabChaine[i]= String.valueOf(chaineSaisie.charAt(i));
        }



        for (int i = 0; i < tabChaine.length; i++) {
            String chaineEnminuscule=tabChaine[i].toLowerCase();
            if (chaineEnminuscule.equals("a")||
                    chaineEnminuscule.equals("e")||
                    chaineEnminuscule.equals("i")||
                    chaineEnminuscule.equals("o")||
                    chaineEnminuscule.equals("u")||
                    chaineEnminuscule.equals("y")){
                sommeVoyelle=sommeVoyelle+1;
            }else if (chaineEnminuscule.matches("[a-z]")){

                sommeConssonne=sommeConssonne+1;

            }else if (chaineEnminuscule.equals(" ")){
                sommeEspace=sommeEspace+1;
            } else  {
                sommeDivers=sommeDivers+1;
            }
        }

        System.out.println("Nombre d'espace ="+sommeEspace);
        System.out.println("Nombre de voyelle ="+sommeVoyelle);
        System.out.println("Nombre de conssonne ="+sommeConssonne);
        System.out.println("Nombre de caractere divers = "+sommeDivers);
    }
}
