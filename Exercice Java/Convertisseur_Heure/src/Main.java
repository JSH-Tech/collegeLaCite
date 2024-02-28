import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nombreEnMinute;
        int nombreEnHeure;
        int resteEnMinute;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Veuillez entrer le nombre en minute : ");
        nombreEnMinute=scanner.nextInt();

        nombreEnHeure=(nombreEnMinute/60);
        resteEnMinute=(nombreEnMinute%60);

        System.out.println("Le nombre d'heure est egal a " + nombreEnHeure + "h" + resteEnMinute + "min.");

    }
}