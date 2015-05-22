/**
 * Created by Tinmar on 21/05/15.
 */
public class Match {

    public Match(Joueur j1, Joueur j2, String joueur1, String joueur2) {
        j1.SetJoueur(joueur1);
        j2.SetJoueur(joueur2);
    }

    public void AjouterPoint(Joueur joueur) {
        joueur.SetPoint();
    }

    public String GetScore(Joueur j1, Joueur j2) {
        if (Avantage(j1, j2))
            return ("Avantage: " + PlusGrosScore(j1, j2));
        else if (Gagne(j1, j2))
            return ("Le joueur " + PlusGrosScore(j1, j2) + " gagne !");
        else if (Egalite(j1, j2)) {
            return ("Egalité");
        }
        else
            return (j1.GetJoueur() + ": " + ConvertPoint(j1) + " - " + j2.GetJoueur() + ": " + ConvertPoint(j2));
    }

    public int ConvertPoint(Joueur joueur) {
        if (joueur.GetPoint() == 1) {
            return 15;
        }
        else if (joueur.GetPoint() == 2) {
            return 30;
        }
        else if (joueur.GetPoint() == 3) {
            return 40;
        }
        return 0;
    }

    private boolean Gagne(Joueur j1, Joueur j2) {
        if (j1.GetPoint() >= 4 && j1.GetPoint() >= j2.GetPoint() + 2) {
            return true;
        }
        else if (j2.GetPoint() >= 4 && j2.GetPoint() >= j1.GetPoint() + 2) {
            return true;
        }
        return false;
    }

    private boolean Egalite(Joueur j1, Joueur j2) {
        if (j1.GetPoint() >= 3 && j2.GetPoint() == j1.GetPoint()) {
            return true;
        }
        return false;
    }

    private boolean Avantage(Joueur j1, Joueur j2) {
        if (j1.GetPoint() >= 4 && j1.GetPoint() == j2.GetPoint() + 1) {
            return true;
        }
        else if (j2.GetPoint() >= 4 && j2.GetPoint() == j1.GetPoint() + 1) {
            return true;
        }
        return false;
    }

    private String PlusGrosScore(Joueur j1, Joueur j2) {
        if (j1.GetPoint() > j2.GetPoint()) {
            return j1.GetJoueur();
        }
        else {
            return j2.GetJoueur();
        }
    }

    public void Afficher(Joueur j1, Joueur j2) {
        System.out.println(GetScore(j1, j2));
    }
}
