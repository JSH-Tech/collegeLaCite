package Laboratoire8.Part2;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
    private String nomEntreprise;

    private List <Employe> listEmp=new ArrayList<Employe>();

    public Entreprise() {
    }

    public Entreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public Entreprise(String nomEntreprise, List<Employe> listEmp) {
        this.nomEntreprise = nomEntreprise;
        this.listEmp = listEmp;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public List<Employe> getListEmp() {
        return listEmp;
    }

    public void setListEmp(List<Employe> listEmp) {
        this.listEmp = listEmp;
    }

    public void AjouterEmploye(Employe employe){
        listEmp.add(employe);
    }

    public void AjouterEmploye(String nomEmploye, String prenomEmploye, double salaireEmploye, int anneEmbaucheEmploye,String passwordEmploye){
        Employe employe=new Employe(nomEmploye,prenomEmploye,salaireEmploye,anneEmbaucheEmploye,passwordEmploye);
        getListEmp().add(employe);
    }

    public int rechercheEmploye(Employe employeRecherche){

        for (Employe employe:getListEmp()){
            if (employe.equals(employeRecherche)){
                return getListEmp().indexOf(employe);
            }
        }
        return -1;
    }

    public void supprimerEmploye(Employe employeRecherche){
        boolean employeTrouve=false;
        for (int i = 0; i < getListEmp().size(); i++) {
            if (getListEmp().get(i).equals(employeRecherche)){
                employeTrouve=true;
                getListEmp().remove(i);
                System.out.println("Employe supprime.");
            }
        }
        if (!employeTrouve){
            System.out.println("Employe n'existe pas.");
        }
    }

    public int nbEmploye(){
        int somme=0;
        somme=getListEmp().size();
        return somme;
    }

    public double calculerChargeMensuelle(){
        double chargeTotal=0;
        for (Employe employe:listEmp)
            chargeTotal=chargeTotal+employe.getSalaireEmploye();
        return chargeTotal;
    }

    public Employe salairePlusEleve(){
        double temp=0;
        Employe employe=null;
        for (Employe emp:getListEmp()) {
            if (emp.getSalaireEmploye()>temp){
                temp=emp.getSalaireEmploye();
                employe=emp;
            }
        }
        return employe;
    }

    public Employe plusAncienEmploye(){
        Employe emptemp = getListEmp().getFirst();
        for (int i = 1; i < getListEmp().size(); i++) {
            Employe employe=getListEmp().get(i);
            if (emptemp.anciennete()<employe.anciennete()){
                emptemp=employe;
            }
        }
        return emptemp;
    }

    public void appartenir(Employe employe){
        if (getListEmp().contains(employe)){
            System.out.println("L'employe appartient a l'entreprise");
        }else {
            System.out.println("L'employe n'appartient pas a l'entreprise");
        }
    }

    public void afficher(){
        System.out.println("Affichage de la liste des employés d'une liste: ");
        System.out.println("******************************");
        for (Employe employe:getListEmp()){
            System.out.println(employe);
            System.out.println("******************************");
        }
    }
}
