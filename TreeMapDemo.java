import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Retrieving a value using a key
        System.out.println("Value for 'Two': " + treeMap.get("Two"));

        // Checking if a key exists
        System.out.println("Contains key 'Three': " + treeMap.containsKey("Three"));

        // Removing a key-value pair
        treeMap.remove("One");
        System.out.println("Contains key 'One' after removal: " + treeMap.containsKey("One"));

        // Iterating over the TreeMap
        System.out.println("Iterating over TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
