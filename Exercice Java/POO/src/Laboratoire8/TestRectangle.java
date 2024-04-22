package Laboratoire8;

public class TestRectangle {
    public static void main(String[] args) {
        Rectagle rectagle=new Rectagle();

        rectagle.setLargeur(8);
        rectagle.setLongueur(10);
        rectagle.afficher();
        rectagle.perimetre();
        rectagle.surface();
    }
}
