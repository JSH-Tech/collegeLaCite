package Laboratoire8.Part2;

public class TestEmploye {

        public static void main(String[] args) {
            // 1- Créer un employé nommé e1 avec le premier constructeur de la classe Employe.
            Employe e1 = new Employe();
            e1.setNomEmploye("Deguerre");
            e1.setPrenomEmploye("Jean-Michel");
            e1.setSalaireEmploye(2000);
            e1.setAnneEmbaucheEmploye(2010);
            e1.setPasswordEmploye("Jean123");
            // 2- Créer un employé nommé e2 avec le second constructeur de la classe Employe.
            Employe e2 = new Employe("Dumoulin", "John");

            // 3- Créer deux employés nommés e3 et e4 avec le troisième constructeur de la classe Employe.
            Employe e3 = new Employe("Smith", "Alice", 3000, 2010);
            Employe e4 = new Employe("Brown", "Marcelin", 2500, 2005, "Password123");

            // 4- Affecter le salaire 5000 à l’employé e1.
            e1.setSalaireEmploye(5000);

            // 5- Afficher les employés e1 et e2.
            System.out.println("Employé 1 :");
            System.out.println(e1);
            System.out.println("Employé 2 :");
            System.out.println(e2);

            // 6- Afficher l’adresse courriel de e3 et le login de e4.
            e3.creerEmail();
            e4.creerLogin();
            System.out.println("Email de e3 : " + e3.getEmailEmploye());
            System.out.println("Login de e4 : " + e4.getLoginEmploye());

            // 7- Calculer et afficher le salaire annuel de e1 et e3.
            e1.salaireAnn();
            e3.salaireAnn();
            System.out.println("Salaire annuel de e1 : " + e1.getSalaireEmploye());
            System.out.println("Salaire annuel de e3 : " + e3.getSalaireEmploye());

            // 8- Calculer et afficher l’ancienneté de e1 et e4.
            System.out.println("Ancienneté de e1 : " + e1.anciennete() + " ans");
            System.out.println("Ancienneté de e4 : " + e4.anciennete() + " ans");

            // 9- Augmenter et afficher le salaire de e2 et de e3 selon leur ancienneté.
            e2.augmentationSalaire(e2.pourcentage());
            e3.augmentationSalaire(e3.pourcentage());
            System.out.println("Nouveau salaire de e2 : " + e2.getSalaireEmploye());
            System.out.println("Nouveau salaire de e3 : " + e3.getSalaireEmploye());

            // 10- Augmenter le salaire de e4 de 35% et afficher la nouvelle valeur.
            e4.augmentationSalaire(1.35);
            System.out.println("Nouveau salaire de e4 : " + e4.getSalaireEmploye());

            // 11- Tester l’égalité de e2 et e3 et afficher le résultat.
            e2.egalite(e3);
        }
    }
