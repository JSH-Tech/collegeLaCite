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

        if (x<y && x<z){
            min=x;

        } else if (y<x && y<z) {
            min=y;
        } else if (z<x && z<y) {
            min=z;
        }

        if (x>y && x>z){
            max=x;

        } else if (y>x && y>z) {
            max=y;
        } else if (z>x && z>y) {
            max=z;
        }

        System.out.println("min = " + min+", max = "+max);
    }
}
