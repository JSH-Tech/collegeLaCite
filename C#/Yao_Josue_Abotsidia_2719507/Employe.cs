using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Yao_Josue_Abotsidia_2719507
{
    internal abstract class Employe
    {
        /*Les propriete de la classe employe*/

        private int numMatricule;
        private string nomEmploye;
        private string prenomEmploye;
        private DateTime dateDeNaissance;

        /*Constructeur de la classe employe*/
        protected Employe(int numMatricule, string nomEmploye, string prenomEmploye, DateTime dateDeNaissance)
        {
            this.NumMatricule = numMatricule;
            this.NomEmploye = nomEmploye;
            this.PrenomEmploye = prenomEmploye;
            this.DateDeNaissance = dateDeNaissance;
        }

        /*Les get et set de tous les propriétés de la classe employe*/
        public int NumMatricule { get => numMatricule; set => numMatricule = value; }
        public string NomEmploye { get => nomEmploye; set => nomEmploye = value; }
        public string PrenomEmploye { get => prenomEmploye; set => prenomEmploye = value; }
        public DateTime DateDeNaissance { get => dateDeNaissance; set => dateDeNaissance = value; }

        /*Implementation de la methode ToString*/
        public string Tostring()
        {
            return $@"Numero matricule: {NumMatricule}
                      Nom employé : {NomEmploye}
                      Prenom employé: {PrenomEmploye}
                      Date de naissance: {DateDeNaissance}
            ";
        }

        /*Nethode abstraite GetSalaire*/
        public abstract double GetSalaire();
    }
}
