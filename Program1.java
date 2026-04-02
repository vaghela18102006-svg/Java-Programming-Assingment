/*
 * Problem Statement: Implement Array and String operations (Reverse, Sort, 
 * Search, Average, Maximum) using class and objects.
 */
import java.util.Arrays;

// Class to handle all the logical operations
class Operations {
    
    // --- Array Operations ---

    // 1. Calculate Average
    public double calculateAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        return sum / arr.length; 
    }

    // 2. Find Maximum
    public int findMaximum(int[] arr) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }

    // 3. Sort Array
    public void sortArray(int[] arr) {
        Arrays.sort(arr); 
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // 4. Search Array
    public void searchArray(int[] arr, int target) {
        int index = Arrays.binarySearch(arr, target);
        if (index >= 0) {
            System.out.println("Search: Element " + target + " found at index " + index);
        } else {
            System.out.println("Search: Element " + target + " not found.");
        }
    }

    // --- String Operations ---

    // 5. Reverse String
    public String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
}

// Main class to run the program
public class Program1 {
    public static void main(String[] args) {
        // Create an object of the Operations class
        Operations ops = new Operations();

        // Sample Input
        int[] numbers = {50, 20, 40, 10, 30};
        String word = "Programming";

        System.out.println("--- Array Operations ---");
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // Calling Average method
        double avg = ops.calculateAverage(numbers);
        System.out.println("Average: " + avg);
        
        // Calling Maximum method
        int max = ops.findMaximum(numbers);
        System.out.println("Maximum: " + max);
        
        // Calling Sort method (Modifies the array permanently)
        ops.sortArray(numbers); 
        
        // Calling Search method (Searching for the number 40)
        ops.searchArray(numbers, 40); 

        System.out.println("\n--- String Operations ---");
        System.out.println("Original String: " + word);
        
        // Calling Reverse method
        String reversedWord = ops.reverseString(word);
        System.out.println("Reversed String: " + reversedWord);
    }
}