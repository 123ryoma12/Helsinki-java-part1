
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String guess = "";
        for(int i = 0;; i++)
        {
            System.out.println("Type the password: ");
            guess = reader.nextLine();
            
            if(guess.equals(password))
            {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            else
                System.out.println("Wrong!");
        }            
        // Write your code here
    }
}
