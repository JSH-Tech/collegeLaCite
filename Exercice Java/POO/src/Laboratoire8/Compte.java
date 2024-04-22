package Laboratoire8;

public class Compte {
    private double solde;
    private Client titulaire;
    private int code=0;

    private int newCode;

    public Compte() {
        code++;
        this.newCode=this.code;
    }
    //Est ce qu'on peut faire this.code++
    public Compte(double solde, Client titulaire) {
        this.solde = solde;
        this.titulaire = titulaire;
        code++;
        this.newCode=code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNewCode() {
        return newCode;
    }

    public void setNewCode(int newCode) {
        this.newCode = newCode;
    }

    public void credit(double montant){
        double soldeCredit=this.getSolde()+montant;

    }

    public void credit(Compte compte,double montant){
        this.setSolde(this.getSolde() + montant);
        compte.setSolde(compte.getSolde()-montant);

    }

    public void debit(double montant){
        double soldeDebit=this.getSolde()-montant;
    }
    public void debit(Compte compte,double montant){
        this.setSolde(this.getSolde() - montant);
        compte.setSolde(compte.getSolde() + montant);

    }

    public void afficher(){
        System.out.println("Les informations du compte"+"\n"+
                            "Titulaire: "+this.getTitulaire().getNom()+" "+this.getTitulaire().getPrenom()+"\n"+
                            "Solde: "+this.getSolde()+"\n"+
                            "Code de compte: "+this.getNewCode()
        );
    }


}
