using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ua2versionchat
{
    internal class Test
    {
        static void Main(string[] args)
        {
          
                // Création des téléphones tel1, tel2 et tel3 avec les différents constructeurs
                Telephone tel1 = new Telephone(100, "Itel");
                Telephone tel2 = new Telephone(120, "Samsung", "S32");
                Telephone tel3 = new Telephone(140, "Itel", "P60", 65, true);

            Console.WriteLine(tel2.ToString());
            // Test et affichage de l'égalité de tel1 et tel2
            bool egalite = tel1.Egalite(tel2);
                Console.WriteLine("Égalité entre tel1 et tel2 : " + (egalite ? "Les téléphones sont égaux" : "Les téléphones ne sont pas égaux"));

                // Affichage de tel3
                Console.WriteLine("Informations de tel3 :");
                Console.WriteLine(tel3.ToString());

                // Calcul et affichage du prix toutes taxes comprises de tel3
                double prixttctel3 = tel3.PrixTTC();
                Console.WriteLine("Le prix toutes taxes comprises du téléphone 3 est : " + prixttctel3);
            }
        }
    }
