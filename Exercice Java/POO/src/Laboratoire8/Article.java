package Laboratoire8;
import java.lang.String;
public class Article {
    private String reference;
    private String designation;
    private double prix_Ht=0;
    private double taxe=0;

    public Article() {
    }

    public Article(String reference, String designation, double prix_Ht, double taxe) {
        this.reference = reference;
        this.designation = designation;
        this.prix_Ht = prix_Ht;
        this.taxe = taxe;
    }

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix_Ht() {
        return prix_Ht;
    }

    public double getTaxe() {
        return taxe;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix_Ht(double prix_Ht) {
        this.prix_Ht = prix_Ht;
    }

    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }

    public void afficher(){
        System.out.println("Reference: "+this.getReference()+
                            "\n"+"Designation: "+this.getDesignation()+
                            "\n"+"Prix Ht: "+this.getPrix_Ht()+
                            "\n"+"Taxe: "+this.getTaxe()

        );
    }

    public void calculerTTC(double prixAvecRemise){
        double prix_ttc=prixAvecRemise+(prixAvecRemise*(taxe/100));
        System.out.println("Le prix ttc est :"+prix_ttc);

    }

    public double remise(   int tauxDeReduction){
        double prixAvecRemise=prix_Ht*(1-(tauxDeReduction/100));
        System.out.println("Prix Ht avec remise est : "+prixAvecRemise);
        return prixAvecRemise;
    }
}
