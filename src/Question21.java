import java.util.ArrayList;

public class Question21 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Print the ArrayList before replacing
        System.out.println("ArrayList before replacing the second element:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Specify the new element to replace the second element
        String newElement = "Purple";

        // Check if the ArrayList has at least two elements
        if (colors.size() >= 2) {
            // Replace the second element (index 1) with the specified element
            colors.set(1, newElement);

            // Print the ArrayList after replacing
            System.out.println("\nArrayList after replacing the second element:");
            for (String color : colors) {
                System.out.println(color);
            }
        } else {
            System.out.println("The ArrayList does not have a second element to replace.");
        }
    }
}
