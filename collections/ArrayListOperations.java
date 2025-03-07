import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Creating an ArrayList of type String with 10 elements
        ArrayList<String> list = new ArrayList<String>();
        
        // Adding 10 elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Ivy");
        list.add("Jackfruit");

        // 1. Add an element to the ArrayList
        list.add("Kiwi");
        
        // 2. Iterate through the ArrayList using an Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("ArrayList using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Add an element at a specific index
        list.add(3, "Lemon"); // Adding "Lemon" at index 3
        System.out.println("\nArrayList after adding 'Lemon' at index 3:");
        System.out.println(list);

        // 4. Remove an element from the ArrayList by value
        list.remove("Fig");
        System.out.println("\nArrayList after removing 'Fig':");
        System.out.println(list);

        // 5. Remove an element at a specific index
        list.remove(2); // Removing element at index 2
        System.out.println("\nArrayList after removing element at index 2:");
        System.out.println(list);

        // 6. Update the element at a specific index
        list.set(1, "Blueberry"); // Replacing the element at index 1 with "Blueberry"
        System.out.println("\nArrayList after updating element at index 1:");
        System.out.println(list);

        // 7. Check if the element is present at a particular index
        int index = 4;
        if (index < list.size()) {
            System.out.println("\nElement at index " + index + ": " + list.get(index));
        } else {
            System.out.println("\nNo element at index " + index);
        }

        // 8. Get an element at a particular index
        String elementAtIndex5 = list.get(5); // Getting element at index 5
        System.out.println("\nElement at index 5: " + elementAtIndex5);

        // 9. Find out the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + list.size());

        // 10. Check if a specific element is present in the ArrayList
        String elementToFind = "Blueberry";
        if (list.contains(elementToFind)) {
            System.out.println("\n" + elementToFind + " is present in the ArrayList.");
        } else {
            System.out.println("\n" + elementToFind + " is not present in the ArrayList.");
        }

        // 11. Remove all elements of the ArrayList
        list.clear();
        System.out.println("\nArrayList after clearing all elements:");
        System.out.println(list);
    }
}