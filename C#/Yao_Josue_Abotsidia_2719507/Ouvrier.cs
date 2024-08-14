using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Yao_Josue_Abotsidia_2719507
{
    internal class Ouvrier:Employe
    {
        /* Propriete date entree dans la societe*/
        private DateTime dateEntree;

        /*Get et set de la propriete date entree*/
        public DateTime DateEntree { get => dateEntree; set => dateEntree = value; }

        /*Constructeur de la classe ouvrier*/
        public Ouvrier(int numMatricule, string nomEmploye, string prenomEmploye, DateTime dateDeNaissance, DateTime dateEntree) 
        : base(numMatricule, nomEmploye, prenomEmploye, dateDeNaissance)
        {
            this.dateEntree = dateEntree;
        }

        /*Implementation de la methode GetSalaire*/
        public override double GetSalaire()
        {
            double smig = 2500;
            double salaire = smig + (2024 - DateEntree.Year) * 100;
            if (salaire>(smig*2))
            {
                return (smig * 2);
            }
            else
            {
                return salaire;
            }
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
                      Date entré dans la societe: {DateEntree}
                      Salaire: {GetSalaire()}
            ";
        }
    }
}
