import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }
            
        // write code here
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
