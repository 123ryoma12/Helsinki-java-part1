
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Scanner reader = new Scanner(System.in);
        
        System.out.print("name: ");
        String name = reader.nextLine();
        System.out.print("studentnumber: ");
        String id = reader.nextLine();
        
        while(true) {
            list.add(new Student(name, id));
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.isEmpty())
                break;
            System.out.print("studentnumber: ");
            id = reader.nextLine();
        }
        
        System.out.println("");
        
        for(Student student : list)
            System.out.println(student.toString());
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        
        for(Student student : list) {
            if(student.toString().contains(search))
                System.out.println(student.toString());
        }
    }
}