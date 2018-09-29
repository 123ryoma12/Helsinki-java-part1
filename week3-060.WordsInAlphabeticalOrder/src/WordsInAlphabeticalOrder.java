
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String str = reader.nextLine();
        
        while(!str.isEmpty())
        {
            words.add(str);
            str = reader.nextLine();
        }
        
        Collections.sort(words);
        
        System.out.println("You types the following words:");
        
        for(String word : words)
            System.out.println(word);
    }
}
