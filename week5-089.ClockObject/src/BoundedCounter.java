/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulonunag
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        this.value++;
        if(this.value > this.upperLimit)
            this.value = 0;
        // write code here
    }

    public String toString() {
        // write code here
        return String.format("%02d", this.value);
    }
    
    public int getValue() {
    // write here code that returns the value
        return this.value;
    }
    
    public void setValue(int value) {
        if(0 <= value && value <= this.upperLimit)
            this.value = value;
    }
    

}