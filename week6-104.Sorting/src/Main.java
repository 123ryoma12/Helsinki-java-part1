
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
        
    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        // write the code here
        int smallest = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= array[smallest])
                smallest = i;
        }
        return smallest;    
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = index;
        
        for(int i = index; i < array.length; i++) {
            if(array[i] <= array[smallest])
                smallest = i;
        }
        return smallest;  
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        // code goes here
    }
    
    public static void sort(int[] array) {
        int swaps = 1;
        while(swaps != 0) {
            swaps = 0;
            
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[indexOfTheSmallestStartingFrom(array, i + 1)])
                    swap(array, i, indexOfTheSmallestStartingFrom(array, i + 1));
            }
        }
    }
  
}
