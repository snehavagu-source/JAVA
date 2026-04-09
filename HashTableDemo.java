import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        // HashTable is a legacy class and is synchronized
        // It does not allow null keys or values
        Hashtable<String, Integer> table = new Hashtable<>();

        // Adding key-value pairs to the HashTable
        table.put("One", 1);
        table.put("Two", 2);
        table.put("Three", 3);

        // Retrieving a value using a key
        System.out.println("Value for 'Two': " + table.get("Two"));

        // Checking if a key exists
        System.out.println("Contains key 'Three': " + table.containsKey("Three"));

        // Removing a key-value pair
        table.remove("One");
        System.out.println("Contains key 'One' after removal: " + table.containsKey("One"));

        // Iterating over the HashTable
        System.out.println("Iterating over HashTable:");
        for (String key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
        }
    }
}
