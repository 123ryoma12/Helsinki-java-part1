
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lo = Integer.parseInt(reader.nextLine());
        int hi = Integer.parseInt(reader.nextLine());

        for(int i = lo; i <= hi; i++)
            System.out.println(i);

        // write your code here

    }
}
