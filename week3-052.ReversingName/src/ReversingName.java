import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        
        System.out.print("In reverse order: ");
        for(int i = str.length() - 1; i > -1; i--)
            System.out.print(str.charAt(i));
        System.out.println("");
    }
}
