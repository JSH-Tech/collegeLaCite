using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ua2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Nombre n1 = new Nombre(10);
            Nombre n2 = new Nombre(5);
            Nombre n3=n1+ n2;
            Console.WriteLine($"Addition : {n3.Valeur}");

            //Nombre n4 = n1 - n2;
            Console.WriteLine($"Soustraction : {(n1-n2).Valeur}");

            
            Console.WriteLine($"Multiplication : {(n1*n2).Valeur}");
            Console.WriteLine($"Division : {(n1/n2).Valeur}");

            Console.WriteLine($"n1==n2 :{n1==n2}");
            Console.WriteLine($"n1!=n2 :{n1!=n2}");

            Console.WriteLine($"Incrementation de n1 : {(++n1).Valeur}");
            Console.WriteLine($"Decrementation de n2 : {(++n2).Valeur}");
        }
    }
}
