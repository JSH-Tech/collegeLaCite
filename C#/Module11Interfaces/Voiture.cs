using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Module11Interfaces
{
    internal class Voiture : IVehicule
    {
        public string Marque { get; set; }

        public void Arreter()
        {
            Console.WriteLine("La voiture s'arrete");
        }

        public void Demarrer()
        {
            Console.WriteLine("La voiture demarre");
        }
    }
}
