import java.util.HashMap;
import java.util.Map;

public class StudentMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Student ID as the key and Student Name as the value
        HashMap<String, String> studentMap = new HashMap<>();
        
        // Insert at least 10 key-value mappings
        studentMap.put("S001", "Alice");
        studentMap.put("S002", "Bob");
        studentMap.put("S003", "Charlie");
        studentMap.put("S004", "David");
        studentMap.put("S005", "Eva");
        studentMap.put("S006", "Frank");
        studentMap.put("S007", "Grace");
        studentMap.put("S008", "Hannah");
        studentMap.put("S009", "Isaac");
        studentMap.put("S010", "Jack");

        // Insert a new key-value pair into the map
        studentMap.put("S011", "Kara");

        // Fetch the value of a specific key
        String studentName = studentMap.get("S005");
        System.out.println("The student with ID S005 is: " + studentName);

        // Create a clone/copy of the HashMap
        HashMap<String, String> clonedMap = (HashMap<String, String>) studentMap.clone();

        // Check if a specific key is present in the map
        boolean hasKey = studentMap.containsKey("S008");
        System.out.println("Does the map contain key S008? " + hasKey);

        // Check if a specific value is present in the map
        boolean hasValue = studentMap.containsValue("Grace");
        System.out.println("Does the map contain value 'Grace'? " + hasValue);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Print the size of the map
        System.out.println("Size of the map: " + studentMap.size());

        // Print all keys of the map
        System.out.println("All student IDs (Keys):");
        for (String key : studentMap.keySet()) {
            System.out.println(key);
        }

        // Print all values of the map
        System.out.println("All student names (Values):");
        for (String value : studentMap.values()) {
            System.out.println(value);
        }

        // Remove a specific key-value pair
        studentMap.remove("S003");
        System.out.println("After removing S003, map contains: " + studentMap);

        // Copy all elements of the map to another map
        HashMap<String, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Another map after copying elements: " + anotherMap);
    }
}
