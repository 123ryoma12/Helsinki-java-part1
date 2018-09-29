
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    
    public static int[] copy(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            result[i] = arr[i];
        return result;
    }
    
    public static int[] reverseCopy(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            result[i] = arr[arr.length-1-i];
        return result;
    }
    
}
