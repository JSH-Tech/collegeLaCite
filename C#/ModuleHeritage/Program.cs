using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModuleHeritage
{
    public class vehicule
    {
        private string marque;
        private string modele;
        private int annee;

        public string Marque { get => marque; set => marque = value; }
        public string Modele { get => modele; set => modele = value; }
        public int Annee { get => annee; set => annee = value; }

        public vehicule(string marque, string modele, int annee)
        {
            this.Marque = marque;
            this.Modele = modele;
            this.Annee = annee;
        }

        public virtual void Afficher()
        {
            Console.WriteLine($@"Marque: {Marque}, Modele: {Modele}, Annee: {Annee}");
        }

        public override string ToString()
        {
            return $"Marque: {Marque}, Modele: {Modele}, Annee: {Annee}";
        }

        public void GetVehiculeType()
        {
            Console.WriteLine($"Type de vehicule: {GetType().Name}");
        }

        public override bool Equals(object obj)
         {
            if (obj == null || GetType()!=obj.GetType()) 
                return false;
            vehicule other= obj as vehicule;
            return Marque == other.Marque && Modele==other.Modele && Annee==other.Annee ;
        }
    }
    public class Moto : vehicule
    {
        private bool estsportive;

        public Moto(string marque, string modele, int annee, bool estSportive) : base(marque, modele, annee)
        {
            Estsportive=estsportive;
        }

        public Moto(string marque, string modele, bool estSportive) : this(marque, modele, 2020,true)
        {
            this.Estsportive = estsportive;
        }

        public bool Estsportive { get => estsportive; set => estsportive = value; }

        public override void Afficher()
        {
            base.Afficher();
            Console.WriteLine($@"Marque: {Marque}, Modele: {Modele}, Annee: {Annee}, est sportive {Estsportive}");
        }
    }

    public class Voiture:vehicule
    {
        private int nombrePorte;

        public Voiture(string marque, string modele, int annee, int nombrePorte) : base(marque, modele, annee)
        {
            NombrePorte = nombrePorte;
        }

        public int NombrePorte { get => nombrePorte; set => nombrePorte = value; }

        public override void Afficher()
        {
            base.Afficher();
            Console.WriteLine($@"Marque: {Marque}, Modele: {Modele}, Annee: {Annee}, nombre de porte: {NombrePorte}");
        }
    }

    public class Camion : vehicule
    {
        private int capaciteDeCharge;

        public int CapaciteDeCharge { get => capaciteDeCharge; set => capaciteDeCharge = value; }

        public Camion(string marque, string modele, int annee, int capaciteDeCharge) : base(marque, modele, annee)
        {
            CapaciteDeCharge = capaciteDeCharge;
        }

        public Camion(string marque, string modele, int capaciteDeCharge) : this(marque, modele, 2020, 1000)
        {
            this.CapaciteDeCharge = capaciteDeCharge;
        }

        public override void Afficher()
        {
            base.Afficher();
            Console.WriteLine($@"Marque: {Marque}, Modele: {Modele}, Annee: {Annee}, capacite de charge: {capaciteDeCharge}");
        }
    }


    internal class Program
    {
        static void Main(string[] args)
        {
            Voiture voiture = new Voiture("Toyota", "Corola", 2020, 4);
            Moto moto=new Moto("Honda", "CBR500R",2019,true);
            Camion camion = new Camion("Ford", "F150", 2018, 5000);

            Console.WriteLine("Detail de la voiture :");
            voiture.Afficher();
            Console.WriteLine();
            
            Console.WriteLine("Detail de la moto :");
            moto.Afficher();
            Console.WriteLine();
            
            Console.WriteLine("Detail du camion :");
            camion.Afficher();
            Console.WriteLine();

            vehicule vehicule = voiture;

            Console.WriteLine("Detail de la voiture :");
            vehicule.Afficher();
            Console.WriteLine();
        }
    }
}
