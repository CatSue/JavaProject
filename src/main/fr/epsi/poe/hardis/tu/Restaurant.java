   package fr.epsi.poe.hardis.tu;

/**
 * Restaurant : classe utilisée pour faire des TU
 * Restaurant = nom, codePostal, telephone
 *
 * @version : 1.0
 * @author : Marie PÉTROD
 */

public class Restaurant {
    //Nom du restaurant
    private String nom;

    //Adresse du restaurant
    private String adresse;

    //Code postal du restaurant
    private String codePostal;

    //N° de téléphone du restaurant
    private String telephone;

    //Conflit
    private String conflit;

    //Ouverture ou fermeture du restaurant
    private boolean ouverture = true;

    //*****CONSTRUCTEURS*****//
    public Restaurant(boolean ouverture) {
        ouverture = true;
    }

    public Restaurant() {
    }

    //*****GETTEURS*****//
    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public boolean isOuverture() {
        return ouverture;
    }

    public String getConflit(){
        return conflit;
    }

    //*****SETTEURS*****//
    public void setNom(String nom) {
        //provisoire
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setConflit(String pConflit) {
        conflit = pConflit;
    }

    public void setTelephone(String pTelephone) {
        //vérifier si le téléphone n'est pas nul, n'est pas vide et commence bien par +33
        if (pTelephone != null && !"".equals(pTelephone) && pTelephone.startsWith("+33")){
            telephone = pTelephone;
        }
    }

    public void setOuverture(boolean ouverture) {
        this.ouverture = ouverture;
    }
}
