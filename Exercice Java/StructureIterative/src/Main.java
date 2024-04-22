//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nb=0;
        int somme=0;

        while (nb<=10){
                somme+=nb;
            nb++;
        }
        System.out.println(somme);

        int nombre = 12345; // Remplacez par votre nombre
        int longueur = (int) Math.log10(nombre) + 1;
        System.out.println("Le nombre " + nombre + " contient " + longueur + " chiffres.");

    }
}