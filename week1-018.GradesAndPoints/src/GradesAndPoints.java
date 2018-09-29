
import java.util.Scanner;

public class GradesAndPoints {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int x = Integer.parseInt(reader.nextLine());
     
        if(x >= 50)
            System.out.println("Grade: 5");
        else if (x >= 45)
            System.out.println("Grade: 4");
        else if (x >= 40)
            System.out.println("Grade: 3");
        else if (x >= 35)
            System.out.println("Grade: 2");
        else if (x >= 30)
            System.out.println("Grade: 1");
        else
            System.out.println("Grade: failed");
        // Type your program here:
    }
}
