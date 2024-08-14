using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace UA2ExamenYaoJosueAbotsidia
{
    internal class Telephone
    {

        private double prix;
        private string marque;
        private string modele;
        private int capaciteMemoire;
        private bool etat=true;


        public double Prix { 
            get => prix; 

            set {
                if (value>0)
                {
                    prix = value; 
                }
                else
                {
                    prix = 100.99;
                }
            } 
        }
        public string Marque { 
            get => marque; 

            set {
                if ( string.IsNullOrEmpty(value) ||value.Length<2 )
                {
                    marque ="samsung".ToUpper();
                }
                else
                {
                    marque = value.ToUpper();
                }
            }
        }
        public string Modele { 
            get => modele; 
             set
            {
                if (string.IsNullOrEmpty(value) || value.Length < 2)
                {
 ;
                    modele ="S10".ToUpper() ;
                }
                else
                {
                    modele = value.ToUpper();
                }
            }
        }
        public int CapaciteMemoire { 
            get => capaciteMemoire; 
            set{
                if (value<64)
                {
                    this.capaciteMemoire = 64;
                }
                else
                {
                    capaciteMemoire = value;
                }
            }  
        }
        public bool Etat { 
            get => etat; set => etat = value; }

        public Telephone(double prix, string marque)
        {
            this.Prix = prix;
            this.Marque = marque;
            this.Modele = "s10";
            this.CapaciteMemoire = 64;
        }

        public Telephone(double prix, string marque, string modele) : this(prix, marque)
        {

            this.Modele = modele;
        }

        public Telephone(double prix, string marque, string modele, int capaciteMemoire, bool etat) : this(prix, marque, modele)
        {
            this.CapaciteMemoire = capaciteMemoire;
            this.Etat = etat;
        }

        public double PrixTTC()
        {
            double taxe = 1.13;
            return this.Prix*taxe;
        }

        public double PrixTTC(int taux)
        {
            return (this.Prix + this.Prix * (taux / 100));
        }

        public String Egalite(Telephone telephone)
        {
            try
            {
                if (this.Marque.Equals(telephone.Marque) && this.Modele.Equals(telephone.Modele))
                {
                    return "Les telephones sont egaux";
                }
                else
                {
                    return "Les deux telephones ne sont pas les memes";
                }
            }catch(Exception ex)
            {
               return ex.Message;
            }
        }

        public override String ToString()
        {
        return $@"Configuration du Téléphone neuf
            ** Marque : {this.Marque}
            ** Modele : {this.Modele}
            ** Memoire : {this.CapaciteMemoire}
            Le prix est de : {this.PrixTTC()}
            ";
        }
    }
}
