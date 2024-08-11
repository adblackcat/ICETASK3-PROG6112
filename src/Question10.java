import java.util.ArrayList;
import java.util.Collections;

public class Question10 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // ArrayList before shuffling
        System.out.println("ArrayList before shuffling:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Shuffle
        Collections.shuffle(colors);

        // ArrayList after shuffling
        System.out.println("\nArrayList after shuffling:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
