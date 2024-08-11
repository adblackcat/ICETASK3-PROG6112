import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Print the ArrayList before insertion
        System.out.println("ArrayList before insertion:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Insert an element (index 0)
        colors.add(0, "Red");

        // Print the ArrayList
        System.out.println("\nArrayList after insertion at the first position:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
