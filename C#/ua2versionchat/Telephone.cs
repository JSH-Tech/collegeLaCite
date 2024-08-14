using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ua2versionchat
{

        internal class Telephone
        {
            private double prix;
            private string marque;
            private string modele;
            private int capaciteMemoire;
            private bool etat = true;

            public double Prix
            {
                get => prix;
                set
                {
                    if (value >= 0)
                    {
                        prix = value;
                    }
                    else
                    {
                        prix = 100.99;
                    }
                }
            }

            public string Marque
            {
                get => marque;
                set
                {
                    if (string.IsNullOrEmpty(value) || value.Length < 2)
                    {
                        marque = "SAMSUNG";
                    }
                    else
                    {
                        marque = value.ToUpper();
                    }
                }
            }

            public string Modele
            {
                get => modele;
                set
                {
                    if (string.IsNullOrEmpty(value) || value.Length < 2)
                    {
                        modele = "S10";
                    }
                    else
                    {
                        modele = value.ToUpper();
                    }
                }
            }

            public int CapaciteMemoire
            {
                get => capaciteMemoire;
                set
                {
                    if (value < 64)
                    {
                        capaciteMemoire = 64;
                    }
                    else
                    {
                        capaciteMemoire = value;
                    }
                }
            }

            public bool Etat
            {
                get => etat;
                set => etat = value;
            }

            public Telephone(double prix, string marque)
            {
                this.Prix = prix;
                this.Marque = marque;
            this.Modele = "S10";
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
                return this.Prix * taxe;
            }

            public double PrixTTC(int taux)
            {
                return this.Prix * (1 + taux / 100.0);
            }

            public bool Egalite(Telephone telephone)
            {
                if (telephone == null)
                {
                    throw new ArgumentNullException(nameof(telephone), "Le téléphone ne peut pas être null");
                }
                return this.Marque.Equals(telephone.Marque) && this.Modele.Equals(telephone.Modele);
            }

            public override string ToString()
            {
                return $@"Configuration du Téléphone:
            Marque : {this.Marque}
            Modèle : {this.Modele}
            Mémoire : {this.CapaciteMemoire} GO
            État : {(this.Etat ? "Neuf" : "Usagé")}
            Prix TTC : {this.PrixTTC()}";
            }
        }
    }