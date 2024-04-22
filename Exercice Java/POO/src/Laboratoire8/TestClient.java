package Laboratoire8;

public class TestClient {
    public static void main(String[] args) {
        //Infos Client
        //Client client1=new Client();
        Client client1=new Client()
        client1.setNom("De La Porte");
        client1.setPrenom("Jean");
        client1.setTelephone(1418659896);
        client1.setNAS(986968652214l);
        client1.afficher();
    }
}
