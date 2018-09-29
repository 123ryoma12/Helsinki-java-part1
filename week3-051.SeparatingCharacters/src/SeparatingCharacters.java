
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        
        for(int i = 0; i < str.length(); i++)
            System.out.println((1 + i) + ". character: " + str.charAt(i));
    }
}
