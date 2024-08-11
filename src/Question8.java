import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // before sorting
        System.out.println("ArrayList before sorting:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Sort the ArrayList
        Collections.sort(colors);

        // Print the ArrayList after sorting
        System.out.println("\nArrayList after sorting:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
