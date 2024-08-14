using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LaboratoireCinq
{
    internal class Rectangle
    {
        private Point p1;
        private Point p2;
        private Point p3;
        private Point p4;

        internal Point P1 { get => p1; set => p1 = value; }
        internal Point P2 { get => p2; set => p2 = value; }
        internal Point P3 { get => p3; set => p3 = value; }
        internal Point P4 { get => p4; set => p4 = value; }

        public Rectangle(Point p1, Point p2, Point p3, Point p4)
        {
            this.P1 = p1;
            this.P2 = p2;
            this.P3 = p3;
            this.P4 = p4;
        }

        public Rectangle(Point sommet1, Point sommet2)
        {
            this.P1 = sommet1;
            this.P3 = sommet2;
            this.P2= new Point(sommet2.Abscisse, sommet1.Ordonne);
            this.P4 = new Point(sommet1.Abscisse, sommet2.Ordonne);
        }

        public double Perimetre() {
            double dist1 = P1.Distance(P2);
            double dist2 = P2.Distance(P3);
            double dist3 = P3.Distance(P4);
            double dist4 = P4.Distance(P1);

            double perimetre=dist1 + dist2 + dist3 + dist4;
            return perimetre;
        }

        public double Surface()
        {
            double dist1 = P1.Distance(P2);
            double dist2 = P2.Distance(P3);

            double surface = dist1 * dist2;
            return surface;
        }

        public override String ToString()
        {
            return ($@"Rectangle: [Abscisse = {P1.Abscisse} , Ordonné = {P1.Ordonne}], 
           [Abscisse = {P2.Abscisse} , Ordonné = {P2.Ordonne}], 
           [Abscisse = {P3.Abscisse} , Ordonné = {P3.Ordonne}], 
           [Abscisse = {P4.Abscisse} , Ordonné = {P4.Ordonne}] 
                    ");
        }

        public bool Appartenir(Point p)
        {
            double totalDist = P1.Distance(p) + P2.Distance(p) + P3.Distance(p) + P4.Distance(p);
            return totalDist == Perimetre();
        }
        public bool Appartenir(Rectangle r)
        {
            return Appartenir(r.P1) && Appartenir(r.P2) && Appartenir(r.P3) && Appartenir(r.P4);
        }
    }
}
