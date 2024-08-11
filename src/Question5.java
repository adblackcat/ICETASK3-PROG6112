import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList
        System.out.println("ArrayList before update:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Specify the index
        int index = 1;
        String newElement = "Black";

        // Update the element
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newElement);
            System.out.println("\nElement at index " + index + " has been updated to: " + newElement);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }

        // Display new ArrayList
        System.out.println("\nArrayList after update:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
