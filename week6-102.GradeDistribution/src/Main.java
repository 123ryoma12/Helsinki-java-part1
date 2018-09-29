import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        GradeManager grade_manager = new GradeManager();
        System.out.println("Type exam scores, -1 completes:");
        int x = Integer.parseInt(scanner.nextLine());
        while(x != -1) {
            grade_manager.addScore(x);
            x = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Grade distribution:");
        grade_manager.printChart();
        
        System.out.println("Acceptance percentage: " + 100 * grade_manager.acceptancePercentage());
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
