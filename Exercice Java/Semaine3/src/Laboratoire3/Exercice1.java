package Laboratoire3;

import java.util.Scanner;


public class Exercice1 {
    public static void main(String[] args) {
        int XA,YA,XB,YB;
        double distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le cordooné X de A : ");
        XA=scanner.nextInt();

        System.out.print("Entrer le cordooné Y de A : ");
        YA=scanner.nextInt();

        System.out.print("Entrer le cordooné X de B : ");
        XB=scanner.nextInt();

        System.out.print("Entrer le cordooné Y de B : ");
        YB=scanner.nextInt();

        distance=Math.sqrt(Math.pow((XA-XB),2)+Math.pow((YA-YB),2));

        System.out.println("Distance = " + distance);
    }
}
