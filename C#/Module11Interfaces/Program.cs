using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Module11Interfaces
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Voiture voiture = new Voiture { Marque = "Toyota" };
            Moto moto = new Moto { Marque = "Honda" };

            voiture.Demarrer();
            voiture.Arreter();

            moto.Demarrer();
            moto.Arreter();

            Console.ReadKey();

        }
    }
}
