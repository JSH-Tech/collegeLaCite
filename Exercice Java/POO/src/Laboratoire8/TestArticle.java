package Laboratoire8;

public class TestArticle {
    public static void main(String[] args) {

        Article tomate=new Article();

        tomate.setReference("T001");
        tomate.setDesignation("Tomate a sert");
        tomate.setPrix_Ht(12);
        tomate.setTaxe(3);

        tomate.afficher();

        double prixAvecRemise=tomate.remise(5);

        tomate.calculerTTC(prixAvecRemise);
    }
}
