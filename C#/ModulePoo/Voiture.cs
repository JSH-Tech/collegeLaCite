using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModulePoo
{
    internal class Voiture
    {
        private string marque;
        private string couleur;
        private string matricule;

        

        public Voiture()
        {

        }
        
        
        public Voiture(string marque, string couleur, string matricule)
        {
            this.Marque = marque;
            this.Couleur = couleur;
            this.Matricule = matricule;
        }

        public Voiture(string marque)
        {
            this.marque = marque;
        }

        public Voiture(string marque, string couleur) : this(marque)
        {
            this.couleur = couleur;
        }

        public string Marque
        {
            get => marque;

            set
            {
                marque = value.ToUpper();
            }
        }
        internal string Couleur { 
            get => couleur; 
            set {
                if (value.Equals("Noire") || value.Equals("Rouge") || value.Equals("Vert") || value.Equals("Noir") || value.Equals("Gris") || value.Equals("Orange"))
                {
                    couleur = value;
                }
                else
                    couleur = "Rouge";
            } 
        }
        public string Matricule { 
            get => matricule; 
            set => matricule = value; 
        }

        public void afficher()
        {
            Console.WriteLine("La marque est : "+this.Marque);
            Console.WriteLine("La couleur est : "+this.Couleur);
            Console.WriteLine("La matricule est : "+this.Matricule);
        }


        
    }
}
