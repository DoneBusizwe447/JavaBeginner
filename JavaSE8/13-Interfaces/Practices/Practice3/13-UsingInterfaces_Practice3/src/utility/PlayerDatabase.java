/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utility;

import java.util.*;
import soccer.Player;



/**
 *
 * @author Administrator
 */
public class PlayerDatabase {
    
    private ArrayList <Player> players;
    
    public PlayerDatabase(){
        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        players = new ArrayList();
        while (authorTokens.hasMoreTokens()){
            players.add(new Player(authorTokens.nextToken()));
        }
    }
    
    public Player[] getTeam(int numberOfPlayers){
        Player[] teamPlayers = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++){
            int playerIndex = (int) (Math.random() * players.size());
            teamPlayers[i] = players.get(playerIndex);
            players.remove(playerIndex);
        }
        return teamPlayers;
        
    }
    
    
        
String authorList = 
"Ricardo Quaresma," + 
"Alan Patton," +
"Alexander Pato," +
"Arthur Melo," +
"Anthony," +
"Batista," +          
"Brendan Rogers," +      
"Brian Molefe," +
"Boris Johnnson," +
"Charles Dickens," +    
"Charlotte Malibu," +
"Dorothy Parker," +
"Emile Heskey" +
"Frank Lampard," +        
"Geoffrey Chaucer," +
"George Eliot," +
"G. K. Chesterton," +
"Graham Green," +
"Henry James," +
"James Joyce," +        
"J. M. Synge," + 
"J. R. Tolkien," +
"Steve Austin," +
"Leo Tolstoy," +
"Liam O'Flaherty," +
"Marcelo," +
"Mark Twain," +
"Don Busizwe," +
"O. Henry," +
"Samuel Eto'o," +
"Sean O'Casey," +
"William Shakespeare," +        
"William Makepeace Thackeray," +
"W. B. Yeats," +
"Wilkie Collins";
    
}
