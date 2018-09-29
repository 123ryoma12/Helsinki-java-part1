/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulonunag
 */
import java.util.ArrayList;


public class Team {
    private String name;
    private ArrayList<Player> players;
    private int max_size;
    
    public Team(String name) {
        this.name = name;
        this.max_size = 16;
        this.players = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if(players.size() < this.max_size)
            players.add(player);
    }
    
    public void printPlayers() {
        for(Player player : players) {
            System.out.println(player.toString());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.max_size = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int total = 0;
        for(Player player : players)
            total += player.goals();
        return total;
    }
}
