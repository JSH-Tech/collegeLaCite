import java.util.ArrayList;

public class Enseignant {
    //Les attribut de la classe enseignant
    private String nom;
    private String prenom;
    private Adresse adresse;
    private double prixDeHeure;
    private ArrayList<String> listeMatieres;

    //Les accesseurs et mutateurs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toLowerCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.toUpperCase();
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public double getPrixDeHeure() {
        return prixDeHeure;
    }

    public void setPrixDeHeure(double prixDeHeure) {
        if (prixDeHeure<=50){
            this.prixDeHeure = 100;
        }
        else {
            this.prixDeHeure=prixDeHeure;
        }
    }


    /*
    * 3- Les propriete d'un constructeur sont les parametre propre ace constructeur
    * c'est leurs valeurs qui est affecté aux propriete de la classe
    * */
//Le premier constructeur  nom et prenom
    public Enseignant(String nom, String prenom) {
        this.setNom(nom);
        this.setPrenom(prenom);
        listeMatieres=new ArrayList<String>();
    }

    //Le seconde constructeur nom et prenom et prix de lheure
    public Enseignant(String nom, String prenom, double prixDeHeure){
        this(nom,prenom);
        this.setPrixDeHeure(prixDeHeure);
    }

    //Le troisieme constructeur nom et prenom et prix de lheure et adresse
    public Enseignant(String nom, String prenom, double prixDeHeure, Adresse adresse) {
        this(nom, prenom,prixDeHeure);
        this.setAdresse(adresse);
    }

    //Methode ajouter une matiere
    public void ajouterMatiere(String matiere){
        this.listeMatieres.add(matiere);
    }

    //Methode pour supprimer une matiere
    public void supprimerMatiere(String matiere){
        this.listeMatieres.remove(matiere);
    }
/*
* 9- Logiquement non par ce que un enseignant peut se specialiser dans d'autre matiere avec le temps donc
* la taille de la liste des matieres ne devrait pas etre fixe au cas ou on veut ajouter une autre matiere
* */

    //Le nombre total de matiere de l'enseignant
    public int nbMatiere(){
        return listeMatieres.size();
    }

    //Methode nombreHeure
    public int nombreHeure(){
        return nbMatiere()*42;
    }

    //Methode Contrat
    public double contrat(){
        return this.getPrixDeHeure()*nombreHeure();
    }

    //Methode type de contrat
    public String typeContrat(){
        if (nombreHeure()<=84){
            return "Temps partiel";
        } else if (nombreHeure()>84 && nombreHeure()<=168) {
            return "Charge partielle";
        }else {
            return "Indeterminé";
        }
    }

    @Override
    public String toString() {
        return
                this.getPrenom() + "\n" +
                this.getNom() + "\n" +
                this.adresse+"\n"+
                "Matieres : "+listeMatieres+ "\n"+
                "Prix Heure : " + prixDeHeure +" $CAD"+"\n"+
                "Nombre heure : "+nombreHeure()+"\n"+
                "Montant : "+contrat()+"\n"+
                "Type Contrat : "+typeContrat()+"\n"+
                "***********************************"
                ;
    }
}
