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

public class GradeManager {
    private ArrayList<Integer> grades;
    
    public GradeManager() {
        this.grades = new ArrayList<Integer>();
    }
    
    public void addScore(int score) {
        if(50 <= score && score <= 60)
            this.grades.add(5);
        else if(45 <= score && score <= 49)
            this.grades.add(4);
        else if(40 <= score && score <= 44)
            this.grades.add(3);
        else if(35 <= score && score <= 39)
            this.grades.add(2);
        else if(30 <= score && score <= 34)
            this.grades.add(1);
        else if(0 <= score && score <= 29)
            this.grades.add(0);
    }
    
    public int gradeCount(int grade) {
        int count = 0;
        
        for(int g : this.grades)
            if(g == grade)
                count++;
        return count;
                
    }
    
    public void printChart() {
        for(int i = 5; i >= 0; i --) {
            System.out.print(i + ": ");
            for(int j = 0; j < this.gradeCount(i); j++)
                System.out.print("*");
            System.out.println("");
        }
    }
    
    public double acceptancePercentage() {
        return 1 - (double)this.gradeCount(0)/(double)this.grades.size();
    }
}
