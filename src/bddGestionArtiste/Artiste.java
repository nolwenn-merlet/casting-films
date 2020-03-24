package bddGestionArtiste;

public class Artiste {
    private String nom ;
    private String prenom ;
    private char sexe ;
    private Date dateNaissance ;
    private float exigenceRemuneration ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public float getExigenceRemuneration() {
        return exigenceRemuneration;
    }

    public void setExigenceRemuneration(float exigenceRemuneration) {
        this.exigenceRemuneration = exigenceRemuneration;
    }

    public Artiste (String nom, String prenom, char sexe, Date dateNaissance, float exigenceRemuneration) {
        this.nom = nom ;
        this.prenom = prenom ;
        this.sexe = sexe ;
        this.dateNaissance = dateNaissance ;
        this.exigenceRemuneration = exigenceRemuneration ;
    }

}
