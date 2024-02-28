import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double PrixHt,PrixTTC, tauxReduction, Valeuraprereduction;
        final double taxe=1.13;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Veuillez entrer le prix HT : ");
        PrixHt=scanner.nextDouble();

        System.out.print("Veullez entrer le taux de reduction sans % : ");
        tauxReduction=scanner.nextDouble();

        Valeuraprereduction=(PrixHt-(PrixHt*(tauxReduction/100)));

        PrixTTC= Valeuraprereduction*taxe;

        System.out.println("Le prix TTC est "+ PrixTTC);

    }
}