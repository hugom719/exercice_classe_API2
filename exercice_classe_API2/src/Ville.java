import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * classe Ville
 * @author Hugo Mercier
 * @version 1.0
 */
public class Ville
{
    /**
     * nom de la ville
     */
    private String nom;
    /**
     * pays de la ville
     */
    private String pays;
    /**
     * latitude de la ville
     */
    private double latitude;
    /**
     * longitude de la ville
     */
    private double longitude;
    /**
     * liste des coureur
     */
    private List<Coureur> coureurList = new ArrayList<>();
    /**
     * constructeur par défaut
     */
    public Ville() {
    }
    /**
     * constructeur paramétré
     * @param nom de la ville
     * @param pays dans le quelle la ville est
     * @param latitude de la ville
     * @param longitude de la ville
     * /**
     * constructeur paramétré
     */
    public Ville(String nom, String pays, double latitude, double longitude) {
        this.nom = nom;
        this.pays = pays;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     * getter nom
     * @return le nom de la ville
     */
    public String getNom() {
        return nom;
    }
    /**
     * setter nom
     * @param nom de la ville
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * getter pays
     * @return le pays de la ville
     */
    public String getPays() {
        return pays;
    }
    /**
     * setter pays
     * @param pays de la ville
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
    /**
     * getter latitude
     * @return la latidute de la ville
     */
    public double getLatitude() {
        return latitude;
    }
    /**
     * setter latidute
     * @param latitude de la ville
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    /**
     * getter longitude
     * @return la longitude de la ville
     */
    public double getLongitude() {
        return longitude;
    }
    /**
     * setter longitude
     * @param longitude de la ville
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    /**
     * getter coureurList
     * @return la liste des coureur
     */
    public List<Coureur> getCoureurList() {
        return coureurList;
    }
    /**
     * setter coureurlist
     * @param coureurlist list des coureur
     */
    public void setCoureurList(List<Coureur> coureurList) {
        this.coureurList = coureurList;
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
        Ville ville = (Ville) o;
        return Double.compare(latitude, ville.latitude) == 0 && Double.compare(longitude, ville.longitude) == 0;
    }
    /**
     * calcul du hashcode de la ligne
     * @return hashcode de la ligne
     */
    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
    /**
     * méthode toString
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pays='" + pays + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", coureurList=" + coureurList +
                '}';
    }
}
