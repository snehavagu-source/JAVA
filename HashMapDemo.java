
import java.util.*;
class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieving a value using a key
        System.out.println("Value for 'Two': " + map.get("Two"));

        // Checking if a key exists
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));

        // Removing a key-value pair
        map.remove("One");
        System.out.println("Contains key 'One' after removal: " + map.containsKey("One"));

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}