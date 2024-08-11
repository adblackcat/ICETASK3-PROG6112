import java.util.ArrayList;

public class Question14 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // ArrayList before swapping
        System.out.println("ArrayList before swapping:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Specify the indices
        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap

        // Swap the elements
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            // Temporary variable to assist with swapping
            String temp = colors.get(index1);
            colors.set(index1, colors.get(index2));
            colors.set(index2, temp);

            System.out.println("\nArrayList after swapping elements at indices " + index1 + " and " + index2 + ":");
        } else {
            System.out.println("Invalid indices for swapping.");
        }

        // Display the ArrayList after swapping
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
