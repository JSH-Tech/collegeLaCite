using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ua2
{
    internal class Rationel
    {
        private int numerateur;
        private int denominateur;

        public int Numerateur 
        { 
            get => numerateur; 
            
            set => numerateur = value; 
        }
        public int Denominateur 
        { 
            get => denominateur; 
            set {
                if (value==0)
                {
                    value = 1;
                    denominateur = value;
                }else
                {
                    denominateur=value;
                }
                

            }  
        }

        public Rationel(int numerateur, int denominateur)
        {
            this.Numerateur = numerateur;
            this.Denominateur = denominateur;
        }

        public Rationel(int numerateur)
        {
            this.Numerateur = numerateur;
        }

        public static Rationel operator -(Rationel r1,Rationel r2) {

            int numRes=(r1.Numerateur * r2.Denominateur) - (r2.Numerateur*r1.Denominateur);
            int denRes = r1.Denominateur * r2.Denominateur;
            Rationel res = new Rationel(numRes, denRes);
            return res;
        }

        public static Rationel operator *(Rationel r1, Rationel r2) {

            int numRes = r1.Numerateur * r2.Numerateur;
            int denRes= r1.Denominateur*r2.Denominateur;
            Rationel res= new Rationel(numRes,denRes);
            return res ;
        }  

        public static Rationel operator /(Rationel r1, Rationel r2) {
            int numRes = r1.Numerateur * r2.Denominateur;
            int denRes = r1.Denominateur * r2.Numerateur;
            Rationel res = new Rationel(numRes, denRes);
            return res;
        }
    }
}
