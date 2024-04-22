package Laboratoire8;

public class TestCompte {
    public static void main(String[] args) {
        //Information du client
        Client client1=new Client();
        client1.setNom("De La Porte");
        client1.setPrenom("Jean");
        client1.setTelephone(1418659896);
        client1.setNAS(986968652214l);
       // client1.afficher();

        //Information du compte client1 Jean
        Compte compteClient1=new Compte();
        compteClient1.setSolde(2000);
        compteClient1.setTitulaire(client1);
        compteClient1.credit(1000);
        compteClient1.debit(200);
        compteClient1.afficher();
        System.out.println("**************************************");
        //Client 2
        Client client2=new Client();
        client2.setNom("Des Champs");
        client2.setPrenom("Didier");
        client2.setTelephone(1418659896);
        client2.setNAS(986968652214l);
       // client2.afficher();

        //Information du compte client2 Didier
        Compte compteClient2=new Compte();
        compteClient2.setSolde(1000);
        compteClient2.setTitulaire(client2);
        compteClient2.credit(500);
        compteClient2.debit(200);
        compteClient2.afficher();
        System.out.println("**************************************");

        //Transaction
        compteClient1.debit(compteClient2, 500);
        compteClient1.credit(compteClient2,300);

        //Affichage
        compteClient1.afficher();
        System.out.println("**************************************");
        compteClient2.afficher();
    }
}
