//Treeset in java
import java.util.*;
public class TreeDemo {
    public static void main(String[] args) {
        // TreeSet is a sorted set implementation of the Set interface
        TreeSet<String> set = new TreeSet<>();

        // Adding elements to the TreeSet
        set.add("Hello");
        set.add("World");
        set.add("Java");

        // Iterating over the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}