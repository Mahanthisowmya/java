import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet with at least 10 elements of type String
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grape");
        set.add("Honeydew");
        set.add("Kiwi");
        set.add("Lemon");

        // Displaying the elements of the HashSet
        System.out.println("HashSet Elements: " + set);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Checking if a specific element exists in the HashSet
        System.out.println("Does the set contain 'Apple'? " + set.contains("Apple"));
        System.out.println("Does the set contain 'Mango'? " + set.contains("Mango"));

        // Removing an element from the HashSet
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Attempting to remove an element that is not in the set
        boolean isRemoved = set.remove("Mango");
        System.out.println("Was 'Mango' removed? " + isRemoved);

        // Checking if the set is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());

        // Iterating over the elements in the HashSet using for-each loop
        System.out.println("Iterating over the elements of HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        set.clear();
        System.out.println("After clearing the set, is it empty ?" + set.isEmpty());
    }
}
