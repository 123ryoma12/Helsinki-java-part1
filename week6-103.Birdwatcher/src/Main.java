import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("? ");
        String command = scanner.nextLine();
        
        while(!command.equals("Quit")) {
            
            if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latin_name = scanner.nextLine();
                
                birds.add(new Bird(name, latin_name));
                
            }
            
            else if(command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observed = scanner.nextLine();
                boolean bird_found = false;
                
                for(Bird bird : birds) {
                    if(observed.equals(bird.name())) {
                        bird.addObservation();
                        bird_found = true;
                        break;
                    }
                }
                
                if(!bird_found)
                    System.out.println("Is not a bird!");
            }
            
            else if(command.equals("Statistics")) {
                for(Bird bird : birds)
                    System.out.println(bird.name() + " (" + bird.latinName() 
                            + ") : " + bird.observations() + " observations");
            }
            
            else if(command.equals("Show")) {
                System.out.print("What? ");
                String bird_search = scanner.nextLine();
                
                for(Bird bird: birds) {
                    if(bird_search.equals(bird.name())) {
                        System.out.println(bird.name() + " (" + bird.latinName() 
                            + ") : " + bird.observations() + " observations");
                        
                        break;
                    }
                    
                }
            }
            
            command = scanner.nextLine();
        }
    }
    

}
