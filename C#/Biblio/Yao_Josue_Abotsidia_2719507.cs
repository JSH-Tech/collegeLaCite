using System;

// Définition de la classe Livre
class Livre
{
    // Les propriete 
    private string titre;
    private string auteur;
    private double prix;

    // get et set aux propriete
    public string Titre
    {
        get { return titre; }
        set { titre = value; }
    }

    public string Auteur
    {
        get { return auteur; }
        set { auteur = value; }
    }

    public double Prix
    {
        get { return prix; }
        set { prix = value; }
    }

    // Constructeur permettant de la classe
    public Livre(string titre, string auteur, double prix)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    // Méthode pour afficher un livre
    public void Afficher()
    {
        Console.WriteLine("Titre: " + Titre);
        Console.WriteLine("Auteur: " + Auteur);
        Console.WriteLine("Prix: " + Prix + " $");
    }
}

class Program
{
    static void Main(string[] args)
    {
        // Demande à l'utilisateur de saisir les informations du livre
        Console.WriteLine("Entrez le titre du livre : ");
        string titre = Console.ReadLine();

        Console.WriteLine("Entrez le nom complet de l'auteur : ");
        string auteur = Console.ReadLine();

        double prix;
        while (true)
        {
            Console.WriteLine("Entrez le prix du livre : ");
            var recu = Console.ReadLine();
            if (double.TryParse(recu, out prix))
            {
                break;
            }
            else
            {
                Console.WriteLine("Veuillez entrer un prix valide.");
            }
        }

        // Création d'un objet Livre avec les informations saisies
        Livre livre = new Livre(titre, auteur, prix);

        // Affichage des informations du livre
        Console.WriteLine("Informations du livre :");
        livre.Afficher();

        Console.ReadLine();
    }
}
