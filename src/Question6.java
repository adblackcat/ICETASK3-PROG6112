import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList
        System.out.println("ArrayList before removal:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Specify the index of the element
        int indexToRemove = 2;

        // Remove the element
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            colors.remove(indexToRemove);
            System.out.println("\nElement at index " + indexToRemove + " has been removed.");
        } else {
            System.out.println("Index " + indexToRemove + " is out of bounds.");
        }

        // Print the updated ArrayList
        System.out.println("\nArrayList after removal:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
