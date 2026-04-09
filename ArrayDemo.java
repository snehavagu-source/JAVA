
// Array list in java
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        // ArrayList is a resizable array implementation of the List interface
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Retrieving an element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Checking if an element exists
        System.out.println("Contains 'Java': " + list.contains("Java"));

        // Removing an element by index
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);

        // Iterating over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
