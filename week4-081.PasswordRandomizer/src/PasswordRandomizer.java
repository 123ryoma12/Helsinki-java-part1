import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String str = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < this.length; i++)
            str += alphabet.charAt(random.nextInt(26));
        return str;
    }
}
