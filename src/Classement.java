import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * classe Classement
 * @author Hugo Mercier
 * @version 1.0
 */
public class Classement
{
    /**
     * place du coureur
     */
    private int place;
    /**
     * gain du coureur
     */
    private float gain;
    /**
     * Objet Coureur
     */
    private Coureur coureur;
    /**
     * id unique pour le hash et equals
     */
    private int id_hash;
    /**
     * constructeur par défaut
     */

    public Classement() {
    }
    /**
     * constructeur paramétré
     * @param place numero de la place
     * @param gain nombre du gain du coureur
        /**
     * constructeur paramétré
     */
    public Classement(int place, float gain) {
        this.place = place;
        this.gain = gain;
    }
    /**
     * getter place
     * @return le numero de la place
     */
    public int getPlace() {
        return place;
    }
    /**
     * setter place
     * @param place numero de la place
     */
    public void setPlace(int place) {
        this.place = place;
    }
    /**
     * getter gain
     * @return le gain
     */
    public float getGain() {
        return gain;
    }
    /**
     * setter gain
     * @param gain du coureur
     */
    public void setGain(float gain) {
        this.gain = gain;
    }
    /**
     * getter coureur
     * @return le coureur
     */
    public Coureur getCoureur() {
        return coureur;
    }
    /**
     * setter coureur
     * @param coureur
     */
    public void setCoureur(Coureur coureur) {
        this.coureur = coureur;
    }
    /**
     * méthode toString
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "Classement{" +
                "place=" + place +
                ", gain=" + gain +
                ", coureur=" + coureur +
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
        Classement that = (Classement) o;
        return id_hash == that.id_hash;
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
