
/**
 *
 * @author abots
 */
public class Adresse {
    //Les attributs
    private int numero;
    private String nomDeRue;
    private String codePostal;
    private String ville;

    //les accesseurs et les mutateurs

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomDeRue() {
        return nomDeRue;
    }

    public void setNomDeRue(String nomDeRue) {
        this.nomDeRue = nomDeRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {

        char indice1=codePostal.charAt(1);
        char indice3=codePostal.charAt(3);
        char indice5=codePostal.charAt(5);

        //On verifie si la logueur est du code postal est de 6 caractere
        //et j'ai utiliser IF par ce que je dois tester la logueur au cas ou ce n'est pas 6
        if (codePostal.length()<6 || codePostal.length()>6) {
            this.codePostal="K1K1K1";

        }
        //Je devais mettre une autre condition pour verifier si la logueur est egal a 6
        // et verifier si la valeur des indice 1,3et5 sont
        //des entiers seulement j'ai oublier la fonction qui permet de verifier le type

    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    //Constructeur sans argument
    public Adresse() {
    }

    //Constructeur initialisant tout les attributs

    public Adresse(int numero, String nomDeRue, String codePostal, String ville) {
        this.setNumero(numero);
        this.setNomDeRue(nomDeRue);
        this.setCodePostal(codePostal);
        this.setVille(ville);
    }

//Methode toString
    public String toString() {
        return this.getNumero()+" "+this.getNomDeRue()+","+this.getCodePostal()+","+this.getVille();
    }

    //Methode egalite
    public boolean egalite(Adresse adresse){
        //Jutilise la condition IF par ce que j'ai deux solutions
        if (this.codePostal.equals(adresse.codePostal)) {
            return true;
        }
        else return false;

    }

    //Surcharge de la methode egalite
    public boolean egalite(){
        Adresse addresse=new Adresse();
        if (this.codePostal.equals(addresse.codePostal)){
            return true;
        }
        return false;
    }

}
