/**
 * Created by Tinmar on 21/05/15.
 */
public class Joueur {

    private String nom;
    private int point;

    public Joueur() {
        nom = "Guest";
    }

    public Joueur(Joueur joueur) {
        nom = joueur.GetJoueur();
    }

    public Joueur(String _nom) {
        this.nom = _nom;
    }

    public String GetJoueur() {
        return nom;
    }

    public void SetJoueur(String _nom) {
        nom = _nom;
    }

    public int GetPoint() {
        return point;
    }

    public void SetPoint() {
        point++;
    }

    public void SetPointTest(int _point){
        point = _point;
    }
}
