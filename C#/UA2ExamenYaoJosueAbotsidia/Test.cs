using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Lifetime;
using System.Text;
using System.Threading.Tasks;

namespace UA2ExamenYaoJosueAbotsidia
{
    internal class Test
    {
        static void Main(string[] args)
        {
            Telephone tel1 = new Telephone(100, "Itel");
            Telephone tel2 = new Telephone(120, "samsung", "S32");
            Telephone tel3 = new Telephone(140, "Itel", "P60", 65, true);

            Console.WriteLine(tel1.Egalite(tel2));
            Console.WriteLine(tel1.ToString());
            Console.WriteLine(tel3.ToString());

            double prixttctel3=tel3.PrixTTC();

            Console.WriteLine("le prix toutes taxes comprises du telephone 3 est "+prixttctel3 );
        }
    }
}
