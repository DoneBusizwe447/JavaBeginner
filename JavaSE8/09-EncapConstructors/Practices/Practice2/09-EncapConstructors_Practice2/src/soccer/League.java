/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;



/**
 *
 * @author Administrator
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        for (Game currGame: theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        
    }
    public Team[] createTeams() {

        Player player1 = new Player("Don Busizwe");
        //player1.setPlayerName("Don Busizwe");
        Player player2 = new Player();
        player2.setPlayerName("Neymar jr");
        Player player3 = new Player();
        player3.setPlayerName("Raul Gonzalez");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team("The Rangers", thePlayers);
        team1.setTeamName("Glasgow Rangers");
        team1.setPlayerArray(thePlayers);

        // Create team2
        Team team2 = new Team("SANBS");
        
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Jabu Pule");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Lionel Messi");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Thomas Rosicky");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        theGame.setHomeTeam(theTeams[0]);
        theGame.setAwayTeam(theTeams[1]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }

}
