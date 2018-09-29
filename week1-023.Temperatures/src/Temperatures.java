
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        for(int i = 0; i < 10; i++)
        {
            double number = Double.parseDouble(reader.nextLine());
            if(-30 <= number && number <= 40)
                Graph.addNumber(number);
        }
        
        System.out.println("Done");

        // Remove or comment out these lines above before trying to run the tests.
    }
}
