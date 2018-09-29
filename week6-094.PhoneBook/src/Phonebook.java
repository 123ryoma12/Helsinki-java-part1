/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author paulonunag
 */
public class Phonebook {
    private ArrayList<Person> persons;
    
    public Phonebook() {
        this.persons = new ArrayList<Person>();
    }
    
    public void add(String name, String phone_no) {
        this.persons.add(new Person(name, phone_no));
    }
    
    public void printAll() {
        for(Person person : persons)
            System.out.println(person.getName() + " number: " + person.getNumber());
    }
    
    public String searchNumber(String name) {
        for(Person person : persons) {
            if(name.equals(person.getName()))
                return person.getNumber();
        }
        
        return "number not known";
    }
}
