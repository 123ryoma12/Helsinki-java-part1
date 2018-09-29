import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        
        if(str.length() >= 3)
        {
            for(int i = 0; i < 3; i++)
                System.out.println((1 + i) + ". character: " + str.charAt(i));
        }
    }
}
