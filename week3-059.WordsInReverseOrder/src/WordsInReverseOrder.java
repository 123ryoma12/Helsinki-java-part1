import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String str = reader.nextLine();
        
        while(!str.isEmpty())
        {
            words.add(str);
            str = reader.nextLine();
        }
        
        System.out.println("You types the following words:");
        
        for(int i = words.size() - 1; i > -1; i--)
            System.out.println(words.get(i));
    }
}
