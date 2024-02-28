import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int x;
         x=scanner.nextInt();
         String v=Integer.toString(x);

        System.out.println("Les milliers : "+v.charAt(0));
        System.out.println("Les centaines : "+v.charAt(1));
        System.out.println("Les dizaines : "+v.charAt(2));
        System.out.println("Les unite : "+v.charAt(3));

        System.out.println("Inverse du nombre: "+v.charAt(3)+v.charAt(2)+v.charAt(1)+v.charAt(0));
    }
}