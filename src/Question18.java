import java.util.ArrayList;

public class Question18 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Test whether the ArrayList is empty or not
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Remove all elements
        colors.clear();

        // Test again
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is now empty.");
        } else {
            System.out.println("The ArrayList is still not empty.");
        }
    }
}
