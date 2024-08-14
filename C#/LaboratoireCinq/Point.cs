using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LaboratoireCinq
{
    internal class Point
    {
        //Class attributes
        private int abscisse;
        private int ordonne;


        //Get and Set of the class attributes
        public int Abscisse { 
            get => abscisse; 
            set {
                if(value<-10 || value>10){
                    value = 0;
                    abscisse=value;
                }
                else{
                    abscisse=value;
                }
            } 
        }

        public int Ordonne { 
            get => ordonne; 
            set {
                if (value < -10 || value > 10) {
                    value = 0;
                    ordonne = value;
                }
                else{
                    ordonne = value;
                }
            }  
        }
        //Class Contructors

        public Point()
        {
            Abscisse = 1;
            Ordonne = 1;
        }

        public Point(int abscisse)
        {
            Abscisse = abscisse;
            Ordonne = 1;
        }

        public Point (int abscisse,int ordonne)
        {
            Abscisse=abscisse;
            Ordonne=ordonne;
        }

        //Methode ToString()
        public override String ToString()
        {
            return $"[Abscisse = {this.Abscisse} , Ordonné = {this.Ordonne}]";
        }

        //Methode Translater

        public void Translater(int vx, int vy)
        {
            Abscisse=Abscisse+vx;
            Ordonne=Ordonne+vy;
        }

        public double Distance(Point p) {

            int valeurAbscisse=Abscisse-p.Abscisse;
            int valeurOrdonne=Ordonne-p.Ordonne;

            double valAbscisseAuCarre = Math.Pow(valeurAbscisse, 2);
            double valOrdonneAuCarre = Math.Pow(valeurOrdonne, 2);

            double distance = Math.Sqrt(valAbscisseAuCarre + valOrdonneAuCarre);
            return distance;
        }

        public double Distance(int x, int y)
        {
            int valeurAbscisse = Abscisse - x;
            int valeurOrdonne = Ordonne - y;

            double valAbscisseAuCarre = Math.Pow(valeurAbscisse, 2);
            double valOrdonneAuCarre = Math.Pow(valeurOrdonne, 2);

            double distance = Math.Sqrt(valAbscisseAuCarre + valOrdonneAuCarre);
            return distance;
        }

        public String Egalite(Point p)
        {
            if (this.Abscisse==p.Abscisse && this.Ordonne==p.Ordonne)
            {
                return "Les deux points sont egaux";
            }
            else
            {
                return "Les deux points ne sont pas egaux";
            }
        }
    }
}
