import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("One");
        set.add("Two");
        set.add("Three");

        // Checking if an element exists
        System.out.println("Contains 'Two': " + set.contains("Two"));

        // Removing an element
        set.remove("One");
        System.out.println("Contains 'One' after removal: " + set.contains("One"));

        // Iterating over the HashSet
        System.out.println("Iterating over HashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
