
String? valeur_Entree;

int valeur_convertie = 0;
bool resultat_De_Conversion = false;
int Nbc = new Random().Next(0, 100);
int i =10;
int somme = 0;

    do
    {
        i--;
        somme++;
        Console.Write("Donner un entier :");
        valeur_Entree = Console.ReadLine();

        if (string.IsNullOrEmpty(valeur_Entree))
        {
            Console.WriteLine("La valeur ne doit pas etre nulle!");
        }
        else
        {
            resultat_De_Conversion = int.TryParse(valeur_Entree, out valeur_convertie);
        }

        if (resultat_De_Conversion == true)
        {
            if (valeur_convertie < Nbc)
            {
                Console.WriteLine($"{valeur_convertie} est inferieur au nombre caché");
            }
            else if (valeur_convertie > Nbc)
            {
                Console.WriteLine($"{valeur_convertie} est superieur au nombre caché");
            }
            else
            {
                Console.WriteLine("Bravo");
            }
        }

        if (i == 0)
        {
            Console.WriteLine("Tu as epuisé tes tentatives.");
            break;
        }

} while (valeur_convertie != Nbc);
    Console.WriteLine("Le nombre de tentative = "+somme);