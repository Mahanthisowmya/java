public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&) - returns true only if both conditions are true
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR (||) - returns true if at least one condition is true
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT (!) - reverses the boolean value
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true
    }
}
