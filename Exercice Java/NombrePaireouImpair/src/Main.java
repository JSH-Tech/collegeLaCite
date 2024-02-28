import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int nb=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Entrer le nombre : ");
        nb=scanner.nextInt();

        if((nb%2)==0){

            System.out.println("Le nombre est pair");

        }else {

            System.out.println("Le nombre est impair");
        }
//        if ((nb%2)!=0){
//
//        }


    }
}