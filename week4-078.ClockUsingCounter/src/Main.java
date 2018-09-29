
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for (int i = 0; i < 121 ; i++) {
            // like in previous but seconds taken into account
            System.out.print(hours.toString() + ":");
            System.out.print(minutes.toString() + ":");
            System.out.print(seconds.toString());
            System.out.println("");
            
            seconds.next();
            if(seconds.getValue() == 0)
                minutes.next();
            if(seconds.getValue() == 0 && minutes.getValue() == 0)
                hours.next();
            
            
        }

    }
}