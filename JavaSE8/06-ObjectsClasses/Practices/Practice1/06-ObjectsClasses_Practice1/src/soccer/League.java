/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccer;

/**
 *
 * @author magni
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerName = "Neymar";
        
        Player player2 = new Player();
        player2.playerName = "Don Busizwe";
        
        Player player3 = new Player();
        player3.playerName = "Don Kilo";
        
       Player[] thePlayers = {player1, player2, player3};
       
       Team team1 = new Team();
       team1.teamName = "The Celtics";
       
       team1.playerArray = thePlayers;
       
      // player1.playerName = "Robert Rameek";
      Team team2 = new Team();
      team2.teamName = "Manchester United";
      team2.playerArray = new Player[3];
      
      team2.playerArray[0] = new Player();
      team2.playerArray[0] .playerName = "Robert Rameek";
      
      team2.playerArray[1] = new Player();
      team2.playerArray[1] .playerName = "Cristiano Ronaldo";
      
      team2.playerArray[2] = new Player();
      team2.playerArray[2] .playerName = "Raul Gonzalez"; 
      
     
       for (Player thePlayer: team1.playerArray) {
           System.out.println(thePlayer.playerName);
           
       }
       for (Player thePlayer: team2.playerArray) {
           System.out.println(thePlayer.playerName);
           
       }
       } 
      
    }
    

