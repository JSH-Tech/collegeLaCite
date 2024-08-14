using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UA1_C__Examen1
{
    internal class exo3
    {
        static void Main(string[] args)
        {
            List<int> list = new List<int>();
            int valsaisie;

            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Liste des caracteres :");
                while (!int.TryParse(Console.ReadLine(), out valsaisie) || valsaisie < 0 || valsaisie > 9)
                {
                    Console.WriteLine("Entrée invalide. Veuillez entrer un chiffre entre 0 et 9 :");
                }
                list.Add(valsaisie);
            }

            List<int> sortedList = ConvertirListeCaractereChiffreTrie(list);

            Console.WriteLine("Liste des chiffres triée :");
            foreach (int val in sortedList)
            {
                Console.WriteLine(val);
            }
        }

        public List<int> ConvertirListeCaractereChiffreTrie(List<int> list)
        {
            list.Sort(); 
            return list; 
        }
    }

}
    

