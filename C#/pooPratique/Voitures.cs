using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPratique
{
    internal class Voitures
    {
        Voiture [] tableauDeVoiture;

        public Voitures(int tailletabVoiture) {
            tableauDeVoiture=new Voiture[tailletabVoiture];
        }

        public Voiture this[int index] {
            get { return tableauDeVoiture[index];}
            set { tableauDeVoiture[index] = value;}
        }
    }
}
