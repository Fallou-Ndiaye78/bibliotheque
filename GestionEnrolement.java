package GestionDesEnrolements;
import java.util.ArrayList;
import java.util.List;

public class GestionEnrolement {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        List<Filiere> filieres = new ArrayList<>();

        // Création des filières
        Filiere informatique = new Filiere(1, "Informatique", 3);
        Filiere telecommunication = new Filiere(2, "Télécommunication", 2);
        filieres.add(informatique);
        filieres.add(telecommunication);

        // Création d'étudiants
        Etudiant et1 = new Etudiant(1, "Fallou", "Ndiaye", "nfallou43@gmail.com", "778735463");
        Etudiant et2 = new Etudiant(2, "El Hadji Mamadou ", "Sow", "SowELe@gmail.com", "777654321");
        Etudiant et3 = new Etudiant(3, "Hady", "Villane", "Hadyv@gmail.com", "775098123");

        etudiants.add(et1);
        etudiants.add(et2);
        etudiants.add(et3);

        // Gestion des inscriptions
        Inscription ins1 = new Inscription(et1, informatique);
        ins1.validerInscription();
        System.out.println(ins1);

        Inscription ins2 = new Inscription(et2, telecommunication);
        ins2.validerInscription();
        System.out.println(ins2);

        Inscription ins3 = new Inscription(et3, informatique);
        ins3.validerInscription();
        System.out.println(ins3);

        // Vérification des places restantes
        System.out.println("Places restantes dans Informatique: " + informatique.getNbPlaces());
        System.out.println("Places restantes dans Télécommunication: " + telecommunication.getNbPlaces());
    }
}
