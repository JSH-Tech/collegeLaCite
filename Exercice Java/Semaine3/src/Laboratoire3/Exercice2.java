package Laboratoire3;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double a,b,c,p,s;

        System.out.print("Entrer la distance A : ");
        a=scanner.nextFloat();

        System.out.print("Entrer la distance B : ");
        b=scanner.nextFloat();

        System.out.print("Entrer la distance C : ");
        c=scanner.nextFloat();

        p=((a+b+c)/2);

        s=Math.sqrt((p*((p-a)*(p-b)*(p-c))));

        System.out.println("Surface = " + s);

    }
}
