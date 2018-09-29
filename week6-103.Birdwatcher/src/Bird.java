/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulonunag
 */
public class Bird {
    private String name;
    private String latin_name;
    private int observations;
    
    public Bird(String name, String latin_name) {
        this.name = name;
        this.latin_name = latin_name;
        this.observations = 0;
    }
    
    public String name() {
        return this.name;
    }
    
    public String latinName() {
        return this.latin_name;
    }
    
    public int observations() {
        return this.observations;
    }
    
    public void addObservation() {
        this.observations++;
    }
    
}
