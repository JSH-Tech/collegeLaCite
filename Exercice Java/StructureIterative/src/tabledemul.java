import java.util.Scanner;

public class tabledemul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.print("Donner un entier entre 1 et 9 :");
           nombre= scanner.nextInt();
        }while (nombre<1 || nombre>9);

        for (int i = 1; i < 10; i++) {

            System.out.println(i+"*"+nombre+"="+nombre*i);
        }
    }
}
