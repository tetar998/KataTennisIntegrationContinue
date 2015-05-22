/**
 * Created by Tinmar on 21/05/15.
 */
public class MatchTest {
    Joueur Martin = new Joueur();
    Joueur Clement = new Joueur();

    Match match = new Match(Martin, Clement, "Martin", "Clement");


    public void testQuinzeTrente() {
        Martin.SetPointTest(1);
        Clement.SetPointTest(2);

        match.Afficher(Martin, Clement);
    }

    public void testQuarenteTrente() {
        Martin.SetPointTest(3);
        Clement.SetPointTest(2);

        match.Afficher(Martin, Clement);
    }

    public void testEgalite() {
        Martin.SetPointTest(3);
        Clement.SetPointTest(3);

        match.Afficher(Martin, Clement);
    }

    public void testAvantage()
    {
        Martin.SetPointTest(4);
        Clement.SetPointTest(3);

        match.Afficher(Martin, Clement);
    }

    public void testGagne(){
        Martin.SetPointTest(2);
        Clement.SetPointTest(4);

        match.Afficher(Martin, Clement);
    }

    public void testGagneApresAvantage() {
        Martin.SetPointTest(5);
        Clement.SetPointTest(3);

        match.Afficher(Martin, Clement);
    }

    public void testRetourEgaliteApresAvantage() {
        Martin.SetPointTest(5);
        Clement.SetPointTest(5);

        match.Afficher(Martin, Clement);
    }
}