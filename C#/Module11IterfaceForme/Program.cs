using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Module11IterfaceForme
{
    public interface ISurface
    {
        void CalculerSurface();
    }

    public class Forme : ISurface
    {
        public virtual void Dessiner()
        {
            Console.WriteLine("Je me prepare pour dessiner");
        }

        public void CalculerSurface() { }

    }

public class Carre : Forme, ISurface

    {

        public override void Dessiner()

        {

            base.Dessiner();

            Console.WriteLine("Je dessine un carre\n");

        }

        public void CalculerSurface()
        {

            Console.WriteLine("C'est la surface d'un carre\n");

        }

    }

public class Cercle : Forme, ISurface

    {

        public override void Dessiner()

        {

            base.Dessiner();

            Console.WriteLine("Je dessine un cercle\n");

        }

        public void CalculerSurface()

        {

            Console.WriteLine("C'est la surface d'un cercle\n");

        }

    }

    public class Triangle : Forme, ISurface

    {

        public override void Dessiner()

        {

            base.Dessiner();

            Console.WriteLine("Je dessine un triangle\n");

        }

        public void CalculerSurface()

        {

            Console.WriteLine("C'est la surface d'un triangle\n");

        }

    }


    internal class Program
    {
        static void Main(string[] args)
        {
            List<Forme> listFormes = new List<Forme>();

            listFormes.Add(new Carre());
            listFormes.Add(new Cercle());
            listFormes.Add(new Triangle());
            listFormes.Add(new Triangle());
            listFormes.Add(new Carre());
            listFormes.Add(new Cercle());

            Console.WriteLine("Affichage de la liste ListeFormes"); // Affichage de la liste ListeFormes

            foreach (Forme f in listFormes)
            {
                f.Dessiner();
                f.CalculerSurface();
                Console.WriteLine("--------------------");
            }

        }
    }
}
