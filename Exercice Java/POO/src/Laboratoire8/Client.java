package Laboratoire8;

public class Client {

    private String nom;
    private String prenom;
    private long telephone;
    private long NAS;

    public Client() {
    }
    public Client(String nom, String prenom, long telephone, long NAS) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.NAS = NAS;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getNAS() {
        return NAS;
    }

    public void setNAS(long NAS) {
        this.NAS = NAS;
    }

    public void afficher(){
        System.out.println("Les informations du client"+"\n"+
                            "Nom: "+this.getNom()+"\n"+
                            "Prenom: "+this.getPrenom()+"\n"+
                            "Telephone: "+this.getTelephone()+"\n"+
                            "NAS: "+this.getNAS()+"\n"
                );
    }
}
