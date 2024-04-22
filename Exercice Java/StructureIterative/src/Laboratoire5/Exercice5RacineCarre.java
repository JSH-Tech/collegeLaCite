package Laboratoire5;

import java.util.Scanner;

public class Exercice5RacineCarre {
    public static void main(String[] args) {
        double x1,xj,xj1;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Saisir X");
        double A=scanner.nextInt();

        System.out.println("Entrer la precision de recurence : ");
        double j=scanner.nextInt();

        x1=A;
        xj=0;
        xj1=0;
        for (int i = 0; i < j; i++) {

        }
        double valint=(xj+(A/xj));
        xj1=((1/2)*valint);
        x1=xj1;
    }
}
