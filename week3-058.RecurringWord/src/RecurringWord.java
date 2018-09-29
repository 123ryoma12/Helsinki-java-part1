
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String str = reader.nextLine();
        
        while(!words.contains(str))
        {
            words.add(str);
            str = reader.nextLine();
        }
        
        System.out.println("You gave the word " + str + " twice");
        
    }
}