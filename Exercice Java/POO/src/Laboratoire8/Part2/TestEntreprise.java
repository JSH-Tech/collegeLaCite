package Laboratoire8.Part2;

public class TestEntreprise {
    public static void main(String[] args) {
        // Création des employés
        Employe emp1 = new Employe("Smith","Alice", 2000, 5);
        Employe emp2 = new Employe("Allen","Bob", 2500, 3);
        Employe emp3 = new Employe("Chan","Charlie", 2200, 7);

        // Création de l'entreprise
        Entreprise entreprise = new Entreprise("Ma Belle Entreprise");

        // Ajout des employés à l'entreprise
        entreprise.AjouterEmploye(emp1);
        entreprise.AjouterEmploye(emp2);
        entreprise.AjouterEmploye(emp3);

        // Calcul du nombre d'employés
        System.out.println("Nombre d'employés dans l'entreprise : " + entreprise.nbEmploye());

        // Plus ancien employé
        System.out.println("Plus ancien employé : " + entreprise.plusAncienEmploye());

        // Employé avec le salaire le plus élevé
        System.out.println("Employé avec le salaire le plus élevé : " + entreprise.salairePlusEleve());

        // Affichage de l'entreprise
        System.out.println("Entreprise :");
        entreprise.afficher();

        // Suppression d'un employé
        entreprise.supprimerEmploye(emp2);

        // Affichage de l'entreprise après suppression
        System.out.println("Entreprise après suppression :");
        entreprise.afficher();
    }
}

