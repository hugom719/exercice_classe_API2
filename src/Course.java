import java.time.LocalDate;
import java.util.*;
/**
 * classe Course
 * @author Hugo Mercier
 * @version 1.0
 */
public class Course
{
    /**
     *  nom de la course
     */
    private String nom;
    /**
     *  price money de la course
     */
    private float priceMoney;
    /**
     *  nombre de km de la course
     */
    private int km;
    /**
     *  list des classement
     */
   private List<Classement> classementList = new ArrayList<>();
    /**
     *  list des info
     */
   private List<Infos> infosList = new ArrayList<>();
    /**
     * constructeur par défaut
     */
    public Course() {

    }
    /**
     * constructeur paramétré
     * @param nom nom de la course
     * @param priceMoney price money de la course
     * @param km nombre de km de la course
    /**
     * constructeur paramétré
     */
    public Course(String nom, float priceMoney, int km) {
        this.nom = nom;
        this.priceMoney = priceMoney;
        this.km = km;
    }
    /**
     * getter nom
     * @return nom de la ville
     */
    public String getNom() {
        return nom;
    }
    /**
     * setter nom
     * @param nom de la course
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * getter pricemoney
     * @return du price money de la course
     */
    public float getPriceMoney() {
        return priceMoney;
    }
    /**
     * setter pricemoney
     * @param priceMoney de la course
     */
    public void setPriceMoney(float priceMoney) {
        this.priceMoney = priceMoney;
    }
    /**
     * getter km
     * @return nombre de km de la course
     */
    public int getKm() {
        return km;
    }
    /**
     * setter km
     * @param km de la course
     */
    public void setKm(int km) {
        this.km = km;
    }
    /**
     * getter classementlist
     * @return liste des classements
     */
    public List<Classement> getClassementList() {
        return classementList;
    }
    /**
     * setter ClassementList
     * @param ClassementList liste classement
     */
    public void setClassementList(List<Classement> classementList) {
        this.classementList = classementList;
    }
    /**
     * getter infolist
     * @return liste des infos
     */
    public List<Infos> getInfosList() {
        return infosList;
    }
    /**
     * setter InfosList
     * @param InfosList liste info
     */
    public void setInfosList(List<Infos> infosList) {
        this.infosList = infosList;
    }
    /**
     * liste des coureurs avec place est gain
     * @return   la liste des classement
     */
    public ArrayList<Classement> listeCoureursPlaceGain(){
        return new ArrayList<>(classementList);
    }
    /**
     * gain total
     * @return la somme des gain
     */
    public float gainTotal(){
        float somme=0;
        for (Classement objet : classementList) {
            somme = somme+objet.getGain();
        }
        return somme;
    }
    /**
     * vainqueur course
     * @return le coureur vainqueur
     */
    public Coureur vainqueur(){
        for (Classement objet : classementList) {
            if(objet.getPlace()==1){
                return objet.getCoureur();
            }
        }
        return null;
    }
    /**
     * ajout d'une coureur
     * @param coureur Coureur
     */
    public void addCoureur(Coureur coureur){
    Classement objet = new Classement(0,0);
    objet.setCoureur(coureur);
    classementList.add(objet);
    }
    /**
     * supresion coureur
     * @param coureur Coureur
     */
    public void supCoureur(Coureur coureur){
        for (Classement objet : classementList) {
            if (objet.getCoureur().equals(coureur)) {
                classementList.remove(objet);
                break;
            }
        }
    }
    /**
     * resultat d'un coureur
     * @param coureur Coureur, place place du coureur, gain gain du coureur
     */
    public void resultat(Coureur coureur, int place, float gain){
        for (Classement objet : classementList) {
            if (objet.getCoureur().equals(coureur)) {
                objet.setPlace(place);
                objet.setGain(gain);
            }
        }
    }
    /**
     * modification d'un coureur
     * @param coureur Coureur, place place du coureur, gain gain du coureur
     */
    public void modif(Coureur coureur,int place,float gain){
        for (Classement objet : classementList) {
            if (objet.getCoureur().equals(coureur)) {
                objet.setPlace(place);
                objet.setGain(gain);
                break;
            }
        }
    }
    /**
     * ajout d'une ville
     * @param ville de la course
     */
    public void addVille(Ville ville){
        Infos objet = new Infos(null);
        objet.setVille(ville);
        infosList.add(objet);
    }
    /**
     * supresion ville
     * @param ville de la course
     */
    public void supVille(Ville ville){
        for (Infos objet : infosList) {
            if (objet.getVille().equals(ville)) {
                objet.setVille(null);
                break;
            }
        }
    }
    /**
     * modification ville
     * @param ville de la course, date de la course
     */
    public void modifVille(Ville ville, LocalDate date){
        for (Infos objet : infosList) {
            if (objet.getVille().equals(ville)) {
                objet.setDateDepart(date);
                break;
            }
        }
    }
    /**
     * liste ville
     * @return liste des villes
     */
    public ArrayList<Infos> listeVilles(){
        return new ArrayList<>(infosList);
    }
    /**
     * classement complet
     * @return la liste des villes
     */
    public ArrayList<Classement> classementComplet(){
        return new ArrayList<>(classementList);
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
        Course course = (Course) o;
        return Objects.equals(nom, course.nom);
    }
    /**
     * calcul du hashcode de la ligne
     * @return hashcode de la ligne
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
    /**
     * méthode toString
     * @return informations complètes
     */
    @Override
    public String toString() {
        return "Course{" +
                "nom='" + nom + '\'' +
                ", priceMoney=" + priceMoney +
                ", km=" + km +
                ", classementList=" + classementList +
                ", infosList=" + infosList +
                '}';
    }
}
