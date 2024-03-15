import java.time.LocalDate;
import java.util.*;
/**
 * classe Coureur
 * @author Hugo Mercier
 * @version 1.0
 */
public class Coureur
{
    /**
     * id unique
     */
    private String matricule;
    /**
     * nom du coureur
     */
    private String nom;
    /**
     * prenom du coureur
     */
    private String prenom;
    /**
     * nationalité du coureur
     */
    private String Nationalité;
    /**
     * date de naissance du coureur
     */
    private LocalDate dateNaiss;
    /**
     * ville de résidence du coureur
     */
    private Ville ville;
    /**
     * constructeur par défaut
     */
    public Coureur() {

    }
    /**
     * constructeur paramétré
     * @param matricule id numérique unique du coureur
     * @param nom nom du coureur
     * @param prenom prenom du coureur
     * @param Nationalité nationalité du coureur
     * @param dateNaiss date de naissance du coureur/**
     * constructeur paramétré
     */
    public Coureur(String matricule, String nom, String prenom, String Nationalité, LocalDate dateNaiss) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.Nationalité = Nationalité;
        this.dateNaiss = dateNaiss;
    }
    /**
     * getter matricule
     * @return matricule du coureur
     */
    public String getMatricule() {
        return matricule;
    }
    /**
     * setter matricule
     * @param matricule id unique du coureur
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    /**
     * getter nom
     * @return le nom du coureur
     */
    public String getNom() {
        return nom;
    }
    /**
     * setter nom
     * @param nom nom du coureur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * getter prenom
     * @return le prenom du coureur
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * setter prenom
     * @param prenom du coureur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
     * getter nationalité
     * @return la nationalité du coureur
     */
    public String getNationalité() {
        return Nationalité;
    }
    /**
     * setter nationalité
     * @param nationalité du coureur
     */
    public void setNationalité(String nationalité) {
        Nationalité = nationalité;
    }
    /**
     * getter dateNaiss
     * @return la date de naissance du coureur
     */
    public LocalDate getDateNaiss() {
        return dateNaiss;
    }
    /**
     * setter dateNaiss
     * @param dateNaiss du coureur
     */
    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    /**
     * getter ville
     * @return la ville du coureur
     */
    public Ville getVille() {
        return ville;
    }
    /**
     * setter ville
     * @param ville du coureur
     */
    public void setVille(Ville ville) {
        this.ville = ville;
    }
    /**
     * méthode toString
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "Coureur{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", Nationalité='" + Nationalité + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", ville=" + ville +
                '}';
    }
    /**
     * méthode de vérification d'égalité" de deux lignes
     * @param o autre ligne
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coureur coureur = (Coureur) o;
        return Objects.equals(matricule, coureur.matricule);
    }
    /**
     * calcul du hashcode de la ligne
     * @return hashcode de la ligne
     */
    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }
}
