using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Yao_Josue_Abotsidia_2719507
{
    internal class Patron:Employe
    {
        /**
         * o	Un patron est un employé qui se caractérise par un chiffre d’affaire et un pourcentage.
        •	Le chiffre d’affaire est commun entre les patrons.
        •	Le patron a un salaire annuel qui est égal à x% du chiffre d'affaire :
         Salaire = CA*pourcentage/100

        * */
        private double chiffreAffaire;
        private double pourcentage;


        public double ChiffreAffaire { get => chiffreAffaire; set => chiffreAffaire = value; }
        public double Pourcentage { get => pourcentage; set => pourcentage = value; }
        public Patron(int numMatricule, string nomEmploye, string prenomEmploye, DateTime dateDeNaissance,double chiffreAffaire, double pourcentage) 
            : base(numMatricule, nomEmploye, prenomEmploye, dateDeNaissance)
        {
            this.chiffreAffaire = chiffreAffaire;
            this.pourcentage = pourcentage;
        }

        public override double GetSalaire()
        {
            double salaire;
            return salaire = ChiffreAffaire * (Pourcentage / 100);
        }

        /*Override methode toString*/

        public override string ToString()
        {
            base.ToString();
            return $@"
                      Numero matricule: {NumMatricule}
                      Nom employé : {NomEmploye}
                      Prenom employé: {PrenomEmploye}
                      Date de naissance: {DateDeNaissance}
                      Chiffre d'affaire: {ChiffreAffaire}
                      Pourcentage: {Pourcentage}
                      Salaire: {GetSalaire()}
            ";
        }
    }
}
