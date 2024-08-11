import java.util.ArrayList;

public class Question17 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // ArrayList before emptying
        System.out.println("ArrayList before emptying:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Empty ArrayList
        colors.clear();

        // ArrayList after emptying
        System.out.println("\nArrayList after emptying:");
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is now empty.");
        } else {
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }
}
