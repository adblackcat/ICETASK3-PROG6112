import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the element
        String searchElement = "Green";

        // Search for the element in the ArrayList
        if (colors.contains(searchElement)) {
            System.out.println("The element \"" + searchElement + "\" is found in the ArrayList at index: " + colors.indexOf(searchElement));
        } else {
            System.out.println("The element \"" + searchElement + "\" is not found in the ArrayList.");
        }
    }
}
