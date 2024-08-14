using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pooPratique
{
    internal class Voiture
    {
        private string marque;
        private string modele;
        private int anneeFabrication;
        private int kilometrage;

        private static int nombreVoiture = 0;



        public string Marque { 
            get => marque;
            set => marque = value; 
        }
        public string Modele { 
            get => modele; 
            set => modele = value; 
        }
        public int AnneeFabrication { 
            get => anneeFabrication; 
            set => anneeFabrication = value;
        }
        public int Kilometrage { 
            get => kilometrage; 
            set => kilometrage = value; 
        }

        public Voiture()
        {
            marque= "Inconnue";
            modele= "inconnue";
            anneeFabrication= DateTime.Now.Year;
            kilometrage = 0;
            nombreVoiture++;
        }
        public Voiture(string marque, string modele, int anneeFabrication, int kilometrage)
        {
            this.marque = marque;
            this.modele = modele;
            this.anneeFabrication = anneeFabrication;
            this.kilometrage = kilometrage;
            nombreVoiture++;
        }

        public void Afficher()
        {
            Console.WriteLine(" Marque = " + this.Marque + "\n" +
                                " Modele = " + this.Modele + "\n" +
                                " Annee de Fabrication = " + this.AnneeFabrication + "\n" +
                                " Kilometrage = " + this.Kilometrage+ "\n" +
                                "*****************************************"
                ) ;
        }

        public static void nombretotalvoiture()
        {
            Console.WriteLine(" Nombre de voiture crée = " + nombreVoiture + "\n");
        }
    }
}
