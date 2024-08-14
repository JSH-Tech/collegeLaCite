using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModulePoo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Voiture v1 = new Voiture();
            Voiture v2 = new Voiture("Dodge");
            Voiture v3 = new Voiture("BMW", "Gris");
        }
    }
}
