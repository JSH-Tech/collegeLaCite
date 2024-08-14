using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Yao_Josue_Abotsidia_2719507
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Ouvrier ouvrier = new Ouvrier(001, "Kempachi", "Zaraki", new DateTime(1991, 05, 12), new DateTime(2002, 06, 20));

            Cadre cadre=new Cadre(002,"Ichigo","Kurosaki",new DateTime(1998,04,09),2);

            Patron patron = new Patron(003, "Kuchiki", "Biyakuya", new DateTime(1988, 06, 04), 100000, 10);

            Console.WriteLine("                     Information de l'ouvrier");
            Console.WriteLine(ouvrier);
            Console.WriteLine("                     *****************************");
            Console.WriteLine("                     Information du cadre");
            Console.WriteLine(cadre);
            Console.WriteLine("                     *****************************");
            Console.WriteLine("                     Information du patron");
            Console.WriteLine(patron);

            /** Les infos entree par le user**/
            Console.WriteLine("Entree le matricule d'un cadre");
            var matriculeCadre=Console.ReadLine();

            Console.WriteLine("Entreer le nom d'un cadre");
            var nomCadre=Console.ReadLine();

            Console.WriteLine("Entreer le prenom d'un cadre");
            var prenomCadre = Console.ReadLine();

            Console.WriteLine("Entree la date de naissance d'un cadre");
            var DateNaissCadre = Console.ReadLine();

            Console.WriteLine("Entree lindice d'un cadre");
            var indiceCadre = Console.ReadLine();


            try 
            {
                Console.WriteLine("                     *****************************");
                Cadre cadre1 = new Cadre(int.Parse(matriculeCadre), nomCadre, prenomCadre, DateTime.Parse(DateNaissCadre), int.Parse(indiceCadre));
                Console.WriteLine("                     *****************************");
                Console.WriteLine("                     Information du cadre");
                Console.WriteLine(cadre);
            }
            catch{ 
                Console.WriteLine("Aucune des valeur saisie de doit etre null"); 
            }
        }
    }
}
