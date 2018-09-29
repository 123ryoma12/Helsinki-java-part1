
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lo = Integer.parseInt(reader.nextLine());
        int hi = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for(int i = lo; i <= hi; i++)
            sum += i;
        System.out.println("Sum is " + sum);
    }
}
