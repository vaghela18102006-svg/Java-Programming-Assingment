
/*
 * Problem Statement: Write a program demonstrating Wrapper classes and 
 * String vs StringBuffer.
 */

public class Program3 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Wrapper Classes Demonstration ===");
        
        // Autoboxing: Automatically converting a primitive type into a Wrapper object
        int primitiveNumber = 50;
        Integer wrapperNumber = primitiveNumber; 
        System.out.println("Autoboxing (int to Integer): " + wrapperNumber);
        
        // Unboxing: Automatically converting a Wrapper object back to a primitive type
        Double wrapperPrice = 99.99;
        double primitivePrice = wrapperPrice;
        System.out.println("Unboxing (Double to double): " + primitivePrice);
        
        // Using a Wrapper class utility method to convert a String into a number
        String textNumber = "250";
        int parsedNumber = Integer.parseInt(textNumber);
        System.out.println("Parsed String into an int: " + parsedNumber);
        
        
        System.out.println("\n=== 2. String vs StringBuffer Demonstration ===");
        
        // --- String Demonstration (Immutable / Cannot be changed) ---
        String normalString = "Hello";
        System.out.println("Original String: " + normalString);
        
        // Attempting to modify the string directly (This will NOT work)
        normalString.concat(" World"); 
        System.out.println("String after concat() (Remains unchanged): " + normalString);
        
        // To actually modify it, we have to create a completely new string and save it
        normalString = normalString.concat(" World");
        System.out.println("String after reassignment: " + normalString);
        
        
        // --- StringBuffer Demonstration (Mutable / Can be changed) ---
        StringBuffer bufferString = new StringBuffer("Java");
        System.out.println("\nOriginal StringBuffer: " + bufferString);
        
        // Modifying the StringBuffer directly (This WILL work)
        bufferString.append(" Programming");
        System.out.println("StringBuffer after append() (Successfully modified): " + bufferString);
        
        // Demonstrating another built-in modification method
        bufferString.reverse();
        System.out.println("StringBuffer after reverse(): " + bufferString);
    }
}