import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaration du scanner
        Scanner scanner=new Scanner(System.in);

        //Declaration des variable
        int nombre, reconversion1,reconversion2,reconversion3;
        char premierCarac, deuxiemeCarac,troisiemeCarac;

        //Declaration Vaiable de chaine de caractere vide pour reconstituer la phrase
        String reconstitution="";

        //Demande et recuperation du nomre
        System.out.println("Entrer le nombre : ");
        nombre=scanner.nextInt();

        //Conversion du nombre en String
        String nomConverti=Integer.toString(nombre);

        //Si la taille du nom est 3 on fait ce qui suit
        if (nomConverti.length()==3){
            //Extraction des caracteres
            premierCarac=nomConverti.charAt(0);
            deuxiemeCarac=nomConverti.charAt(1);
            troisiemeCarac=nomConverti.charAt(2);

            //Conversion des caractere en entier
            reconversion1=Character.getNumericValue(premierCarac);
            reconversion2=Character.getNumericValue(deuxiemeCarac);
            reconversion3=Character.getNumericValue(troisiemeCarac);

            int resultat=(int)(Math.pow(reconversion1,3)+Math.pow(reconversion2,3)+Math.pow(reconversion3,3));
            if (resultat==nombre) {
                System.out.println(nombre + " est un nombre d'Armstrong.");
            }else {
                System.out.println(nombre+" n'est pas un nombre Armstrong");
            }
            //Si la taille du nombre n'est pas trois on fait ce qui suit
        }else if (nomConverti.length()<3){
            //Creation d'une boucle pour parcourir la chaine
            for (int i = 0; i < nomConverti.length(); i++) {

                if (nomConverti.charAt(i)=='\u0000'){
                    //A chaque caratere vide retrouver on ajoute 0 en caracte
                    reconstitution=reconstitution+'0';

                }

            }

            //On reaffecte la chaine converti a la variable nombre converti

            nomConverti=reconstitution;

            premierCarac=nomConverti.charAt(0);
            deuxiemeCarac=nomConverti.charAt(1);
            troisiemeCarac=nomConverti.charAt(2);

            reconversion1=Character.getNumericValue(premierCarac);
            reconversion2=Character.getNumericValue(deuxiemeCarac);
            reconversion3=Character.getNumericValue(troisiemeCarac);

            int resultat=(int)(Math.pow(reconversion1,3)+Math.pow(reconversion2,3)+Math.pow(reconversion3,3));
            if (resultat==nombre) {
                System.out.println(nombre + " est un nombre d'Armstrong.");
            }else {
                System.out.println(nombre+" n'est pas un nombre Armstrong");
            }
        }
            }
        }