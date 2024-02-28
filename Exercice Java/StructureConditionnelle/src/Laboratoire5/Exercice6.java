package Laboratoire5;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {

        //Declaration des variables
        int jj,mm,aaaa,nbjour;

        Scanner scanner=new Scanner(System.in);

        //Demande et recuperation du jour, mois et annee
        System.out.print("Veuillez entrer le jour : ");
        jj=scanner.nextInt();

        System.out.print("Veuillez entrer le mois : ");
        mm=scanner.nextInt();

        System.out.print("Veuillez entrer l'annee' : ");
        aaaa=scanner.nextInt();
        if (mm==2){
            nbjour=28;
        }

        switch (mm){
            case (1), (5), (10), (8), (3), (7):
                nbjour=31;
                if (jj+1>nbjour){
                    mm=mm+1;
                    jj=1;
                    System.out.println(jj+"/"+mm+"/"+aaaa);
                }else {
                    System.out.println((jj+1)+"/"+mm+"/"+aaaa);
                }
                if (mm+1>12){
                    aaaa=aaaa+1;
                    jj=1;
                    mm=1;
                }
                break;
            case (2):
                nbjour=28;
                if (jj+1>nbjour){
                    mm=mm+1;
                    jj=1;
                    System.out.println(jj+"/"+mmkkm+"/"+aaaa);
                }else {
                    System.out.println((jj+1)+"/"+mm+"/"+aaaa);
                }
                if (mm+1>12){
                    aaaa=aaaa+1;
                    jj=1;
                    mm=1;
                }
                break;
            case (4), (9), (6), (11):
                nbjour=30;
                if (jj+1>nbjour){
                    mm=mm+1;
                    jj=1;
                    System.out.println(jj+"/"+mm+"/"+aaaa);
                }else {
                    System.out.println((jj+1)+"/"+mm+"/"+aaaa);
                }
                if (mm+1>12){
                    aaaa=aaaa+1;
                    jj=1;
                    mm=1;
                }
                break;
            case(12):
                nbjour=31;
                if (jj+1>nbjour){
                    mm=1;
                    jj=1;
                    aaaa=aaaa+1;
                    System.out.println(jj+"/"+mm+"/"+aaaa);
                }else {
                    System.out.println((jj)+"/"+mm+"/"+aaaa);
                }
                if (mm+1>12){
                    aaaa=aaaa+1;
                    jj=1;
                    mm=1;
                }
                break;
            default:
                System.out.println("Le mois saisie est incorret");

        }



    }
}
