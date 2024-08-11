import java.util.ArrayList;

public class Question20 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // ArrayList and its size before adding more elements
        System.out.println("ArrayList before increasing size:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("Size before increasing: " + colors.size());

        // increase the size of the ArrayList
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        //ArrayList and its size after adding more elements
        System.out.println("\nArrayList after increasing size:");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("Size after increasing: " + colors.size());
    }
}
