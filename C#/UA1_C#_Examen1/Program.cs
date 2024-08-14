using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UA1_C__Examen1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String chaineSaisie;
            do
            {
                Console.WriteLine("Veuillez entrer une chaine de caracteres: ");
                chaineSaisie = Console.ReadLine();

                if (!chaineSaisie.Contains("@") && !chaineSaisie.Contains("#") && !chaineSaisie.Contains("%") && !chaineSaisie.Contains("&") && !chaineSaisie.Contains("*") && !chaineSaisie.Contains("!"))
                    {
                        Console.WriteLine("Erreur la chaine ne contient aucun des caractères speciaux spécifiés.");
                    }
            } while (!chaineSaisie.Contains("@") && !chaineSaisie.Contains("#") && !chaineSaisie.Contains("%") && !chaineSaisie.Contains("&") && !chaineSaisie.Contains("*") && !chaineSaisie.Contains("!"));

            int arobase=0;
            int dieze = 0;
            int pourcentage = 0;
            int etcommercial = 0;
            int asterisc = 0;
            int exclamation = 0;
            int dollars = 0;
            foreach (var item in chaineSaisie)
            {

                if (item=='@')
                {
                    arobase++;
                }
                else if (item=='#')
                {
                    dieze++;
                }
                else if (item=='%')
                {
                    pourcentage++;
                }
                else if(item=='&')
                {
                    etcommercial++;
                }
                else if (item=='*')
                {
                    asterisc++;
                }
                else if (item=='!')
                {
                    exclamation++;
                }
                else if(item=='$')
                {
                    dollars++;
                }
            }

            foreach (var item in chaineSaisie)
            {

                if (item == '@')
                {
                    Console.WriteLine($"Le caractere {item} apparait {arobase} fois dans la chaine.");
                }
                else if (item == '#')
                {
                    Console.WriteLine($"Le caractere {item} apparait {dieze} fois dans la chaine.");
                }
                else if (item == '%')
                {
                    Console.WriteLine($"Le caractere {item} apparait {pourcentage} fois dans la chaine.");
                }
                else if (item == '&')
                {
                    Console.WriteLine($"Le caractere {item} apparait {etcommercial} fois dans la chaine.");
                }
                else if (item == '*')
                {
                    Console.WriteLine($"Le caractere {item} apparait {asterisc} fois dans la chaine.");
                }
                else if (item == '!')
                {
                    Console.WriteLine($"Le caractere {item} apparait {exclamation} fois dans la chaine.");
                }
                else if (item == '$')
                {
                    Console.WriteLine($"Le caractere {item} apparait {dollars} fois dans la chaine.");
                }
            }


        }

        internal List<int> ConvertirListeCaractereChiffreTrie(List<int> list)
        {
            throw new NotImplementedException();
        }
    }
}
