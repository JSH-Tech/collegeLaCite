import java.util.Scanner;

public class note {

    public static void main(String[] args) {

        int note;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Veuillez entrer la note comprise entre 0-20 :");
            note = scanner.nextInt();
        } while (note < 0 || note>20);
    }
}
