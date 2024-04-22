package Laboratoire8;

public class Rectagle {
    private float longueur;
    private float largeur;

    public Rectagle() {
    }

    public Rectagle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void surface(){
        double surf=this.getLargeur()*this.getLongueur();
        System.out.println("La surface est: "+surf);
    }
    public void perimetre(){
        double perim=(this.getLongueur()+this.getLargeur())*2;
        System.out.println("Le perimetre est: "+perim);
    }
    public void afficher(){
        System.out.println(
                            "Les cordonnées du resctangles sont :"+"\n"+
                            "Longeur: "+this.getLongueur()+"\n"+
                            "Largeur: "+this.getLargeur()
                           );
    }
}
