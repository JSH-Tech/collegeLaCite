using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Module11Interfaces
{
    internal interface IVehicule
    {
        string Marque { get; set; }
        void Demarrer();
        void Arreter();
    }
}
