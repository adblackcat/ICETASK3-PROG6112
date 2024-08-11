import java.util.ArrayList;
import java.util.Collections;

public class Question9 {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Blue");
        originalList.add("Green");
        originalList.add("Yellow");
        originalList.add("Purple");

        // Create the second ArrayList with the same size as the originalList
        ArrayList<String> copiedList = new ArrayList<>(originalList.size());

        // Add null elements to the copiedList to ensure it has the same size
        for (int i = 0; i < originalList.size(); i++) {
            copiedList.add(null);
        }

        // Copy the elements from originalList to copiedList
        Collections.copy(copiedList, originalList);

        // Print the original ArrayList
        System.out.println("Original ArrayList:");
        for (String color : originalList) {
            System.out.println(color);
        }

        // Print the copied ArrayList
        System.out.println("\nCopied ArrayList:");
        for (String color : copiedList) {
            System.out.println(color);
        }
    }
}
