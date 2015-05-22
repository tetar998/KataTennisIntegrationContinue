public class Main {

    public static void main(String[] args) {

        /* Debut d'une utilisation classique de Match */


        /*Joueur Martin = new Joueur();
        Joueur Clement = new Joueur();
        Match match = new Match(Martin, Clement, "Martin", "Clement");

        match.AjouterPoint(Martin);
        match.AjouterPoint(Martin);

        match.AjouterPoint(Clement);
        match.AjouterPoint(Clement);

        match.AjouterPoint(Martin);
        match.AjouterPoint(Clement);

        match.Afficher(Martin, Clement);*/


        /* Fin */



        /* Debut des tests */

        MatchTest matchtest = new MatchTest();
        matchtest.testAvantage();
        matchtest.testEgalite();
        matchtest.testGagne();
        matchtest.testGagneApresAvantage();
        matchtest.testQuarenteTrente();
        matchtest.testQuinzeTrente();
        matchtest.testRetourEgaliteApresAvantage();

        /* Fin des tests */
    }
}