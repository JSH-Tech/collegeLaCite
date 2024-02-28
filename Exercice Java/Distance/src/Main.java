import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valeur, m, dm,cm, mm, mile;
        String unitedemesure;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Veuillez entrer l'unité de mesure a affciher :");
        unitedemesure=scanner.next();

        if (unitedemesure!="m" || unitedemesure!="dm" || unitedemesure!="cm" ||unitedemesure!="mm" || unitedemesure!="mile" ) {

            System.out.println("L'unite de mesure entré n'est pas correct");
        }else {

            System.out.print("Veuillez entrer la valeur a convertir en Km : ");
            valeur = scanner.nextDouble();

            if (unitedemesure == "m") {
                m = valeur * 1_000;
                System.out.println("La valeur en m est : " + m);

            } else if (unitedemesure == "dm") {
                dm = valeur * 10_000;
                System.out.println("La valeur en dm est : " + dm);

            } else if (unitedemesure == "cm") {
                cm = valeur * 100_000;
                System.out.println("La valeur en cm est : " + cm);

            } else if (unitedemesure == "mm") {
                mm = valeur * 1_000_000;
                System.out.println("La valeur en mm est : " + mm);

            } else if (unitedemesure == "mile") {
                mile = valeur / 1.609344;
                System.out.println("La valeur en mile est : " + mile);
            }
        }


    }
}