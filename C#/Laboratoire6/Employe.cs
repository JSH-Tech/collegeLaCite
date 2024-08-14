using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laboratoire6
{
    internal class Employe
    {
        private static int codeincre = 0;
        private int code;
        private string nom;
        private string prenom;
        private double salaire;
        private int anneeEmbauche;
        private string courriel;
        private string login;
        private string password;

       


        //Les getters et les setters
        public string Nom { 
            get => nom; 

            set {
                nom = value.ToUpper();
            }  
        }
        public string Prenom { 
            get => prenom; 

            set{
                prenom = value.ToLower();
            }
        }
        public double Salaire { 
            get => salaire;
            set {
                if (value<1000)
                {
                    value = 1000;
                    salaire=value;
                }
                else
                {
                    salaire = value;
                }
            } 
        }
        public int AnneeEmbauche { 
            get => anneeEmbauche; 
            set {
                if (value<1970)
                {
                    value = 1970;
                    anneeEmbauche = value;
                }

                anneeEmbauche = value;
            } 
        }
        public string Courriel { 
            get => courriel; 
        }
        public string Login { 
            get => login; 
        }
        public string Password { 
            get => password;


            set {
                if (value.Length<6)
                {
                    value = "ABC963ABC";
                }
                password = value; 
            }
        }

        public int Code { get => code; set => code = value; }

        public Employe(string nom, string prenom)
        {
            this.Nom = nom;
            this.Prenom = prenom;
            CreerLogin();
            CreerEmail();
            Code=++codeincre;
        }

        public Employe(string nom, string prenom, double salaire, int anneeEmbauche) : this(nom, prenom)
        {
            this.Salaire = salaire;
            this.AnneeEmbauche = anneeEmbauche;
        }

        public Employe(string nom, string prenom, double salaire, int anneeEmbauche, string password) : this(nom, prenom, salaire, anneeEmbauche)
        {
            this.Password = password;
        }

        public void CreerLogin()
        {
            string deuxcaract = this.Nom.Substring(0, 2);
            string quatrepremiercaract = this.Prenom.Substring(0, 4);
            string loginCacat = $"{deuxcaract}+.+{quatrepremiercaract}";

            this.login= loginCacat;
        }

        public void CreerEmail() {
            string premierCarc = nom.Substring(0, 1);
            string lePrenom = prenom;
            string nomDeDomaine = "@proIT.ca";
            string mailComplet = $"{lePrenom}.{premierCarc}{nomDeDomaine}";

            this.courriel = mailComplet;
        }

        public double SalaireAnn()
        {
            return (this.Salaire*12);
        }

        public int Anciennete()
        {
            return (2021 - this.AnneeEmbauche);
        }

        public void AugmentationSalaire()
        {
            int nombAnciennete=this.Anciennete();
            if (nombAnciennete<3)
            {
               this.Salaire=this.salaire+this.salaire* 0.05;
            }
            else if (nombAnciennete>=3 && nombAnciennete<7)
            {
                this.Salaire = this.salaire + this.salaire* 0.10;
            }
            else if (nombAnciennete>=7 && nombAnciennete<15)
            {
                this.Salaire = this.salaire + this.salaire * 0.15;
            }
            else
            {
                this.Salaire = this.salaire + this.salaire * 0.20;
            }
        }

        public void AugmentationSalaire(double taux)
        {
            this.Salaire =this.salaire+ this.salaire*(taux/100);
        }
        public override string ToString() {
            return $@"
                Code: {this.Code}
                Nom: {this.Nom} {this.Prenom}
                Année embauche : {this.AnneeEmbauche}
                Courriel: {this.Courriel}
                Login :{this.Login}";

        }

        public bool Egalite( Employe p)
        {
            if (this.Code==p.Code && this.Nom.Equals(p.Nom))
            {
                return true;
            }
           return false;
        }
    }
}
