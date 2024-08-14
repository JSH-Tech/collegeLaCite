using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Module11Interfaces
{
    internal class Moto:IVehicule
    {
        public string Marque { get; set; }

        public void Demarrer()
        {
            Console.WriteLine("La moto demarre.");
        }


        public void Arreter()
        {
            Console.WriteLine("La moto s'arrete.");
        }
    }
}
