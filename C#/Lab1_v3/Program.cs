String? valeur_entree;

int nBc = new Random().Next(0, 100);

int valeur_Convertie=0 ;

int somme = 0 ;
int i= 10;
int premiereValeurStocke = 0;
int deuxiemeValeurStocke=0 ;

bool resulatat_Conversion=false;
while (i > 0) { 

    do
    {
        i--;
        somme++;

        Console.Write("Veuillez entrer une valeur compris entre 0 et 100: ");
        valeur_entree = Console.ReadLine();

        if ((i==9))
        {
            if (string.IsNullOrEmpty(valeur_entree))
            {
                Console.WriteLine("La valeur a entrée ne doit pas etre vide.");
            }
            else
            {
                resulatat_Conversion = int.TryParse(valeur_entree, out valeur_Convertie);
            }
            premiereValeurStocke = valeur_Convertie;
            if (premiereValeurStocke < nBc)
            {
                Console.WriteLine($"{premiereValeurStocke} est inferieur au nombre caché");
                Console.WriteLine($"Veuillez entrer un nombre compris entre {premiereValeurStocke} et 100");
            }
            else if (premiereValeurStocke > nBc)
            {
                Console.WriteLine($"{premiereValeurStocke} est superieur au nombre caché");
                Console.WriteLine($"Veuillez entrer un nombre compris entre{premiereValeurStocke} et 100");
            }
            else
            {
                Console.WriteLine("Bravo");
            }
        }
        else if(i == 8 || i<8)
        {
            if (string.IsNullOrEmpty(valeur_entree))
            {
                Console.WriteLine("La valeur a entrée ne doit pas etre vide.");
            }
            else
            {
                resulatat_Conversion = int.TryParse(valeur_entree, out valeur_Convertie);
            }
            
            deuxiemeValeurStocke = valeur_Convertie;

            if (deuxiemeValeurStocke < nBc)
            {
                Console.WriteLine($"{deuxiemeValeurStocke} est inferieur au nombre caché");
                Console.WriteLine($"Veuillez entrer un nombre compris entre {premiereValeurStocke} et {deuxiemeValeurStocke}");
            }
            else if (deuxiemeValeurStocke > nBc)
            {
                Console.WriteLine($"{deuxiemeValeurStocke} est superieur au nombre caché");
                Console.WriteLine($"Veuillez entrer un nombre compris entre {premiereValeurStocke} et {deuxiemeValeurStocke}");
            }
            else
            {
                Console.WriteLine("Bravo");
            }
        }
        else
        {
            if (string.IsNullOrEmpty(valeur_entree)) {
            Console.WriteLine("La valeur a entrée ne doit pas etre vide.");
            }
            else
            {
                resulatat_Conversion = int.TryParse(valeur_entree, out valeur_Convertie);
            }

            if (valeur_Convertie<nBc)
            {
                Console.WriteLine($"{valeur_Convertie} est inferieur au nombre caché");
            }else if (valeur_Convertie>nBc)
            {
                Console.WriteLine($"{valeur_Convertie} est superieur au nombre caché");
            }
            else
            {
                Console.WriteLine("Bravo");
            }
        }
     
        if (i==0)
        {
        Console.WriteLine("Tu as épuisé le nombre de tentative.");
        break;
        }

    } while (valeur_Convertie != nBc);
    
}

Console.WriteLine($"Le nombre de tentative = {somme}");