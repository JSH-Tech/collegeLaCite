using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace LaboratoireCinq
{
    internal class Test
    {
        static void Main(string[] args)
        {
            // Creation du premier point avec le premier constructeur
            Point p1 = new Point();
            Console.WriteLine("Le premier point est :");
            Console.WriteLine(p1.ToString()); ;
            Console.WriteLine("**************************");

            // Creation du second point avec le second constructeur
            Point p2 = new Point(2);
            Console.WriteLine("Le second point est :");
            Console.WriteLine(p2.ToString()); ;
            Console.WriteLine("*****************************");

            //Crestion du troisieme et quatrieme point avec le troisieme constructeur

            Point p3 = new Point(3, 4);
            Point p4 = new Point(5, 6);
            Console.WriteLine("Le troisieme point est :");
            Console.WriteLine(p3.ToString());
            Console.WriteLine("Le quatrieme point est :");
            Console.WriteLine(p4.ToString()); ;
            Console.WriteLine("*****************************");

            //Translation du point p1 au vecteur V(vx = 2, vy = 3)
            p1.Translater(2, 3);
            Console.WriteLine("Le premier point apres translation est :");
            Console.WriteLine(p1.ToString()); ;

            //Calcul et affichage de la distance entre p1 et p3
            double distancep1p3=p1.Distance(p3);
            Console.WriteLine("Distance entre p1 et p3 est :");
            Console.WriteLine(distancep1p3);
            Console.WriteLine("***********************************");

            //Calculer et afficher la distance entre p1 et le point de coordonnés
            //abscisse = 6 et ordonné = 4.
            Point newpoint = new Point(6,4);
            double distancep1newpoint=p1.Distance(newpoint);
            Console.WriteLine("Distance entre p1 et le nouveau point abscisse = 6 et ordonné = 4 est :");
            Console.WriteLine(distancep1newpoint);
            Console.WriteLine("***************************************");

            //Créer un rectangle nommé r1 en fournissant deux points représentants les deux
            //sommets opposés(par exemple: P1(-3, 6) et P2(4, 2)).
            Rectangle r1 = new Rectangle(p1, p2);

            //Calculer et afficher le périmètre du rectangle r1.
            double perimetrer1=r1.Perimetre();
            Console.WriteLine("Le perimetre du premier rectangle est :");
            Console.WriteLine(perimetrer1);
            Console.WriteLine("******************************************");

            // Calculer et afficher la surface du rectangle r1.
            double surfacer1 = r1.Surface();
            Console.WriteLine("La surface du premier rectangle est :");
            Console.WriteLine(surfacer1);
            Console.WriteLine("**************************************");
            //14- Afficher le rectangle r1.
            Console.WriteLine("Les coordonnés du premier rectangles sont :");
            Console.WriteLine(r1.ToString()); ;

        }
    }
}
