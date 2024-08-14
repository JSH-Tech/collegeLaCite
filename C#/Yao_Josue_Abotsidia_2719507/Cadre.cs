using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Yao_Josue_Abotsidia_2719507
{
    internal class Cadre:Employe
    {
        /*Propriete indice*/
        private int indice;

        /*Get et Set de indice*/
        public int Indice { get => indice; set => indice = value; }

        /*Constructeur de la classe cadre*/
        public Cadre(int numMatricule, string nomEmploye, string prenomEmploye, DateTime dateDeNaissance, int indice) 
        : base(numMatricule, nomEmploye, prenomEmploye, dateDeNaissance)
        {
            this.indice = indice;
        }

        /*Implementation de la methode GetSalaire
         */

        public override double GetSalaire()
        {
            double salaire=0;
            switch (Indice)
            {

                case 1:
                    salaire = 13000;
                    break;
                case 2:
                    salaire = 15000;
                    break;
                case 3:
                    salaire = 17000;
                    break;
                default:
                    salaire = 20000;
                break;
            }
            return salaire;
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
                      Indice: {Indice}
                      Salaire: {GetSalaire()}
            ";
        }
    }
}
