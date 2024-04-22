public class TestEnseignant {
    public static void main(String[] args) {
        Enseignant e1=new Enseignant("CHARL","JEAN");

        Enseignant e2=new Enseignant("MARC","DES CHAMPS",100);

        Adresse ade3=new Adresse(12,"Promenade de l'aviation","K8H1V9","Ottawa");

        Enseignant e3=new Enseignant("Bouhlel","Mohamed",100,ade3);

        e3.ajouterMatiere("JAVA");
        e3.ajouterMatiere("STATISTIQUE");
        e3.ajouterMatiere("BD");
        e3.ajouterMatiere("Anglais");
        e3.supprimerMatiere("Anglais");
        e3.setPrixDeHeure(120);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
