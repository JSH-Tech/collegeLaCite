package Laboratoire5;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        int x, y, z,max=0,min = 0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Entrer le premier nombre");
        x=scanner.nextInt();

        System.out.println("Entrer le second nombre");
        y=scanner.nextInt();

        System.out.println("Entrer le troisieme nombre");
        z=scanner.nextInt();

        if (x<y&&y<z){
            min=x; max=z;
        }else if (y<x && x<z){
            min=y; max=z;
        }else if (z<x&&x<y){
            min=z; max=y;
        }else if (z<y&&y<x){
            min=z; max=x;
        }else if (x<z &&z<y){
            min=x; max=y;
        }else if (y<z&&z<x){
            min=y; max=x;
        }

        System.out.println("min = "+min+" max = "+max);
    }
}
