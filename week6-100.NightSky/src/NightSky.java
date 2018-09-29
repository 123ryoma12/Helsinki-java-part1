/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulonunag
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int prev_count;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.prev_count = 0;
    }
    
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
         Random rand = new Random();
         for(int i = 0; i < this.width; i++)
         {
             if(rand.nextDouble() < this.density) {
                 System.out.print("*");
                 this.prev_count++;
             }
             else
                 System.out.print(" ");             
         }
         System.out.println("");
    }
    
    public void print() {
        this.prev_count = 0;
        for(int i = 0; i < this.height; i++)
            printLine();
    }
    
    public int starsInLastPrint() {
        return this.prev_count;
    }
    
}
