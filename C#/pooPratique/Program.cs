using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPratique
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Voiture v1 = new Voiture("BMW","X3",2012,30);
            Voiture v2 = new Voiture("BMW","X5",2020,50);
            Voiture v3 = new Voiture();
            v1.Afficher();
            v2.Afficher();
            v3.Afficher();
            Voiture.nombretotalvoiture();
        }
    }
}
