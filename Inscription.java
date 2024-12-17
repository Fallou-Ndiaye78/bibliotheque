package GestionDesEnrolements;

public class Inscription {
    private Etudiant etudiant;
    private Filiere filiere;
    private String statut; // En attente, Validée, Refusée

    // Constructeur
    public Inscription(Etudiant etudiant, Filiere filiere) {
        this.etudiant = etudiant;
        this.filiere = filiere;
        this.statut = "En attente";
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    @Override
    public String toString() {
        return "Inscription{" +
                "etudiant=" + etudiant +
                ", filiere=" + filiere +
                ", statut='" + statut + '\'' +
                '}';
    }

    public  void validerInscription() {
    }
}
