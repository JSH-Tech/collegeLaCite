using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ua2
{
    internal class Nombre
    {
        private int valeur;


        public int Valeur { get => valeur; set => valeur = value; }

        public Nombre(int valeur)
        {
            this.Valeur = valeur;
        }

        public static Nombre operator +(Nombre n1, Nombre n2) { 
            return new Nombre(n1.Valeur + n2.Valeur);
        }

        public static Nombre operator -(Nombre n1, Nombre n2)
        {
            return new Nombre(n1.Valeur - n2.Valeur);
        }

        public static Nombre operator *(Nombre n1, Nombre n2)
        {
            return new Nombre(n1.valeur * n2.Valeur);
        }
        
        public static Nombre operator /(Nombre n1, Nombre n2)
        {
            if (n2.Valeur==0)
            {
                throw new DivideByZeroException("Division par zero impossible");
            }
            return new Nombre(n1.valeur / n2.Valeur);
        }

        public static bool operator ==(Nombre n1, Nombre n2)
        {
            return n1.Valeur == n2.Valeur;
        }

        public static bool operator !=(Nombre n1, Nombre n2)
        {
            return !(n1.Valeur == n2.Valeur);
        }

        public static Nombre operator ++(Nombre n)
        {
            return new Nombre(n.Valeur+1);
        } 
        public static Nombre operator --(Nombre n)
        {
            return new Nombre(n.Valeur-1);
        }
    }
}
