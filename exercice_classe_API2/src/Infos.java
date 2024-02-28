import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Objects;

/**
 * classe Infos
 * @author Hugo Mercier
 * @version 1.0
 */
public class Infos
{
    /**
     *  date de depart de la course
     */
    private LocalDate dateDepart;
    /**
     *  ville de la course
     */
    private Ville ville;
    /**
     * id unique pour le hash et equals
     */
    private int id_hash;
    /**
     * constructeur par défaut
     */
    public Infos() {
    }
    /**
     * constructeur paramétré
     * @param dateDepart date de depart de la course
     /**
     * constructeur paramétré
     */
    public Infos(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }
    /**
     * getter dateDepart
     * @return date de depart de la course
     */
    public LocalDate getDateDepart() {
        return dateDepart;
    }
    /**
     * setter DateDepart
     * @param DateDepart de la course
     */
    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }
    /**
     * getter ville
     * @return la ville ou se deroule la course
     */

    public Ville getVille() {
        return ville;
    }
    /**
     * setter ville
     * @param ville de la course
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
        return "Infos{" +
                "dateDepart=" + dateDepart +
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
        Infos infos = (Infos) o;
        return id_hash == infos.id_hash;
    }
    /**
     * calcul du hashcode de la ligne
     * @return hashcode de la ligne
     */
    @Override
    public int hashCode() {
        return Objects.hash(id_hash);
    }
}