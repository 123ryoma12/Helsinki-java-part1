import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       System.out.println("Type numbers:");
       int x = Integer.parseInt(reader.nextLine());
       NumberStatistics stat = new NumberStatistics();
       NumberStatistics stat_even = new NumberStatistics();
       NumberStatistics stat_odd = new NumberStatistics();
  
       while(x != -1)
       {
           if(x % 2 == 0)
               stat_even.addNumber(x);
           else
               stat_odd.addNumber(x);
           stat.addNumber(x);
           x = Integer.parseInt(reader.nextLine());
       }
       
        System.out.println("sum: " + stat.sum());
        System.out.println("sum of even: " + stat_even.sum());
        System.out.println("sum of odd: " + stat_odd.sum());

    }
}