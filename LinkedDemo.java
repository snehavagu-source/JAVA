// linked list with different methods
import java.util.*; 
public class LinkedDemo {
    public static void main(String[] args) {
        // LinkedList is a doubly linked list implementation of the List and Deque interfaces
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.addFirst("Welcome");
        list.addLast("Programming");

        // Retrieving an element by index
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());


        // Checking if an element exists
        System.out.println("Contains 'Java': " + list.contains("Java"));

        // Removing an element by index
        list.remove(0);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing element at index 0: " + list);
        System.out.println("After removing first element: " + list);
        System.out.println("After removing last element: " + list);

        // Iterating over the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}