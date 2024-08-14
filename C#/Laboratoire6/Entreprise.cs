using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laboratoire6
{
    internal class Entreprise
    {
        private string nom;
        private List<Employe> listemployes;

        public string Nom { 
            get => nom; 
            set => nom = value; 
        }

        internal List<Employe> Listemployes { 
            get => listemployes; 
            set => listemployes = value; 
        }
        
        public Entreprise(string nom)
        {
            this.nom = nom;
        }

        public void AddEmploye(Employe employe)
        {
            this.listemployes.Add(employe);
        }

        public void AddEmploye(string nom, string prenom)
        {
            Employe employe=new Employe(nom, prenom);
            this.listemployes.Add(employe);
        }

        public void AddEmploye(string nom, string prenomn, double salaire, int annee)
        {
            Employe employe = new Employe(nom, prenomn, salaire, annee);
            this.listemployes.Add(employe);
        }

       /* Surcharger la méthode AddEmploye pour ajouter un employé à l’entreprise en donnant son
        nom, son prénom, son salaire, son année d’embauche et son mot de passe*/
        
        public void AddEmploye(string nom, string prenom, double salaire, int annee, string password)
        {
            Employe employe = new Employe(nom,prenom, salaire,annee, password);
            this.listemployes.Add(employe);
        }

        public Employe FindEmploye(int id)
        {
            foreach (Employe item in Listemployes)
            {
                if (item.Code==id)
                {
                    return item;
                }
            }
            return null;
        }

        public Employe FindEmploye(string nom, string prenom)
        {
            foreach (Employe item in Listemployes)
            {
                if (item.Nom.Equals(nom) && item.Prenom.Equals(prenom))
                {
                    return item;
                   
                }
                break;
            }
            return null;
        }

        public bool DelEmploye(int  employeID)
        {
            foreach (Employe item in Listemployes)
            {
                if (employeID==item.Code)
                {
                    listemployes.Remove(item);
                    return true;
                }
                break ;
            }
            return false;
        }

        public double SalaireMensuel()
        {
            double total = 0;
            foreach (Employe item in Listemployes)
            {
                total = total + item.Salaire;
            }
            return total;
        }

        public void AugmentationSalaire(int taux)
        {
            foreach (Employe item in Listemployes)
            {
               item.AugmentationSalaire(taux);
            }
        }

        public double ChargeTotale()
        {
            return SalaireMensuel()*12;
        }

        public override string ToString()
        {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.AppendLine($"Entreprise : {Nom}");
            stringBuilder.AppendLine("Liste des employés : ");
            foreach (Employe item in Listemployes)
            {
                stringBuilder.AppendLine(item.ToString());
            }

            return stringBuilder.ToString();
        }
    }
}
