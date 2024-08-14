using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ModulePoo
{
    internal class Etudiant
    {
        private string nom;
        private string prenom;
        private string adresse;
        private int numInscription;

        public Etudiant(string nom, string prenom, string adresse, int numInscription)
        {
            this.Nom = nom;
            this.Prenom = prenom;
            this.Adresse = adresse;
            this.NumInscription = numInscription;
        }

        public string Nom { get => nom; set => nom = value; }
        public string Prenom { get => prenom; set => prenom = value; }
        public string Adresse { get => adresse; set => adresse = value; }
        public int NumInscription { get => numInscription; set => numInscription = value; }
    }
}
