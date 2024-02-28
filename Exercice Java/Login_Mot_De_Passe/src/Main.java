import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String nom,prenom,login,password;

        System.out.print("Entrer votre nom : ");
        nom=scanner.nextLine();

        System.out.print("Entrer votre prenom : ");
        prenom=scanner.nextLine();

        String login1=prenom.substring(prenom.length()-4);
        String login2=nom.substring(0,4);
        login=login1+"_"+login2;
        System.out.println(login);

        password=prenom+"000"+nom.substring(0,4);
        System.out.println(password);

        String MP;
        //String MP1=prenom.substring(prenom.length()-4);

    }
}