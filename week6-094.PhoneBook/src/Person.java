/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulonunag
 */
public class Person {
    private String name;
    private String phone_no;
    
    public Person(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.phone_no;
    }
    
    public void changeNumber(String phone_no) {
        this.phone_no = phone_no;
    }
    
    public String toString() {
        return (this.getName() + " number: " + this.getNumber());
    }
}
