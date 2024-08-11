import java.util.ArrayList;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Specify the start and end indices for the subList
        int startIndex = 1; // inclusive
        int endIndex = 4;   // exclusive

        // Extract a portion of the ArrayList
        List<String> subList = colors.subList(startIndex, endIndex);

        // Print the extracted portion
        System.out.println("\nExtracted portion of the ArrayList:");
        for (String color : subList) {
            System.out.println(color);
        }
    }
}
