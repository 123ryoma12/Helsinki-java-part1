
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int total = 0;
        for(int i = 0; i <= n; i++)
            total += Math.pow(2, i);
        System.out.println("Factorial is " + total);
    }
}
