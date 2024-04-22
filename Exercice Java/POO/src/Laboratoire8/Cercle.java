package Laboratoire8;

public class Cercle {
    private double rayon;

    public Cercle() {
    }
    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void surface(){
        double surf=Math.PI*Math.pow(this.getRayon(),2);
        System.out.println("Surface est: "+surf);
    }
    public void perimetre(){
        double perim=2*Math.PI*this.getRayon();
        System.out.println("Le perimetre est: "+perim);
    }

    public void afficher(){

        System.out.println("Rayon: "+rayon);
    }

}
