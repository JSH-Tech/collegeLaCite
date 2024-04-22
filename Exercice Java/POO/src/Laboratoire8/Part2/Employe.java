package Laboratoire8.Part2;

import java.time.LocalDate;

public class Employe {
    private int codeEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    private double salaireEmploye;
    private int anneEmbaucheEmploye;
    private String emailEmploye;
    private String loginEmploye;
    private String passwordEmploye;

    public Employe() {
        this.codeEmploye =this.codeEmploye+1;
    }

    public Employe(String nomEmploye, String prenomEmploye) {
        this.nomEmploye = nomEmploye.toUpperCase();
        this.prenomEmploye = prenomEmploye.toLowerCase();
    }

    public Employe(String nomEmploye, String prenomEmploye, double salaireEmploye, int anneEmbaucheEmploye) {
        this.nomEmploye = nomEmploye.toUpperCase();
        this.prenomEmploye = prenomEmploye.toLowerCase();
        if (salaireEmploye<1000) {
            salaireEmploye=1000;
            this.salaireEmploye = salaireEmploye;
        }else {
            this.salaireEmploye=salaireEmploye;
        }

        if (anneEmbaucheEmploye<1970){
            anneEmbaucheEmploye=1970;
            this.anneEmbaucheEmploye = anneEmbaucheEmploye;
        }
        else {
            this.anneEmbaucheEmploye=anneEmbaucheEmploye;
        }
    }

    public Employe(String nomEmploye, String prenomEmploye, double salaireEmploye, int anneEmbaucheEmploye, String passwordEmploye) {
        this.nomEmploye = nomEmploye.toUpperCase();
        this.prenomEmploye = prenomEmploye.toLowerCase();
        this.salaireEmploye = salaireEmploye;
        this.anneEmbaucheEmploye = anneEmbaucheEmploye;
        if (passwordEmploye.length()<6){
            passwordEmploye="Eval03G20";
            this.passwordEmploye = passwordEmploye;
        }else{
            this.passwordEmploye=passwordEmploye;
        }
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye.toUpperCase();
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye.toLowerCase();
    }

    public double getSalaireEmploye() {
        return salaireEmploye;
    }

    public void setSalaireEmploye(double salaireEmploye) {

        this.salaireEmploye = salaireEmploye;
    }

    public int getAnneEmbaucheEmploye() {
        return anneEmbaucheEmploye;
    }

    public void setAnneEmbaucheEmploye(int anneEmbaucheEmploye) {
        this.anneEmbaucheEmploye = anneEmbaucheEmploye;
    }

    public String getPasswordEmploye() {
        return passwordEmploye;
    }

    public void setPasswordEmploye(String passwordEmploye) {
        this.passwordEmploye = passwordEmploye;
    }

    public int getCodeEmploye() {
        return codeEmploye;
    }

    public String getEmailEmploye() {
        return emailEmploye;
    }

    public String getLoginEmploye() {
        return loginEmploye;
    }

    //Methode creer login
    public void creerLogin(){
        String login=(getNomEmploye().substring(0,2)+"."+getPrenomEmploye().substring(0,4));
        this.loginEmploye=login;
    
    }

    //Methode creer email
    public  void creerEmail(){

        String nomDeDomaine="@collegeLacite.on.ca";
        String email=(getPrenomEmploye()+"."+getNomEmploye().charAt(0)+nomDeDomaine);
        this.emailEmploye=email;
    }
    //Methode Salire Annuel
    public void salaireAnn(){
        this.setSalaireEmploye(this.getSalaireEmploye()*12);
    }

    //Methode anner d'anciennete
    public int anciennete(){
        return LocalDate.now().getYear()- this.anneEmbaucheEmploye;
    }

    //Methode augmentation salaire a base du nombre d'annee danciennete
    public void augmentationSalaire(){
        int nombreAnne=anciennete();
        if (nombreAnne < 3) {
            double pourcentage=0.05;
            this.setSalaireEmploye(this.getSalaireEmploye()+this.getSalaireEmploye()*0.05);
        } else if (nombreAnne>=3 && nombreAnne<7) {
            this.setSalaireEmploye(this.getSalaireEmploye()+this.getSalaireEmploye()*0.1);
        } else if (nombreAnne>=7 && nombreAnne<15) {
            this.setSalaireEmploye(this.getSalaireEmploye()+this.getSalaireEmploye()*0.15);
        }else {
            this.setSalaireEmploye(this.getSalaireEmploye()+this.getSalaireEmploye()*0.2);
        }
    }

    /**
     * Le terme surcharge peut etre defini comme le fait d'implementer une meme méthode plusieurs fois avec
     *  le meme nom mais avec des signatures differente
     **/
    //Determinons le taux d'une autre maniere
    public double pourcentage(){
        int nombreAnne=anciennete();
        double taux;
        if (nombreAnne < 3) {
            taux=1.05;
        } else if (nombreAnne>=3 && nombreAnne<7) {
            taux=1.1;
        } else if (nombreAnne>=7 && nombreAnne<15) {
            taux=1.15;
        }else {
             taux=1.2;
        }
        return taux;
    }
    //Surcharge du methode augmentationSalaire
    public void augmentationSalaire(double tauxAnciennete){

        this.setSalaireEmploye(this.getSalaireEmploye()*tauxAnciennete);
    }
    public String toString(){

        return              "\n"+"Code : "+this.getCodeEmploye()+"\n"+
                            "Nom : "+this.getNomEmploye()+"\n"+
                            "Prenom : "+this.getPrenomEmploye()+"\n"+
                            "Année embauche : "+this.getAnneEmbaucheEmploye()+"\n"+
                            "Courriel : "+this.getEmailEmploye()+"\n"+
                            "Login : "+this.getLoginEmploye()+"\n"+
                            "Salaire annuel : "+this.getSalaireEmploye();

    }

    public void egalite(Employe employe){
        if (this.codeEmploye==employe.codeEmploye && this.getNomEmploye().equals(employe.getNomEmploye())){
            System.out.println("Les employé sont les mêmes");
        }
    }
}
