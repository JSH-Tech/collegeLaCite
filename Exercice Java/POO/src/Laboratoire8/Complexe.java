package Laboratoire8;

public class Complexe {
    private int re;
    private int im;

    public Complexe() {
    }
    public Complexe(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public void somme(){

    }
    public void somme(Complexe complexe1, Complexe complexe2){
       int som=(complexe1.re+complexe2.re)+(complexe1.im+complexe2.im);
       System.out.println("La somme est: "+som);
    }
    public void somme(Complexe complexe1){
        int som=(complexe1.re+this.re)+(complexe1.im+this.im);
        System.out.println("La somme est: "+som);
    }

    public void somme(Complexe complexe1, int re,int im){
        int som=(complexe1.re+re)+(complexe1.im+im);
        System.out.println("La somme est: "+som);
    }

    public void afficher(){
        System.out.println("Nombre reel: "+getRe()+"\n"+
                            "Nombre imaginaire: "+getIm()
        );
    }

}
