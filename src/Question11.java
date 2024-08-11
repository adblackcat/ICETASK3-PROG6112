import java.util.ArrayList;
import java.util.Collections;

public class Question11 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // ArrayList before reversing
        System.out.println("ArrayList before reversing:");
        for (String color : colors) {
            System.out.println(color);
        }

        // ArrayList
        Collections.reverse(colors);

        // ArrayList after reversing
        System.out.println("\nArrayList after reversing:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
