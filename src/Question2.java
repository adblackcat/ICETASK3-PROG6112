import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // for-each loop
        System.out.println("Iterating through the ArrayList using a for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // regular for loop with index
        System.out.println("\nIterating through the ArrayList using a regular for loop:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // Iterate through the elements
        System.out.println("\nIterating through the ArrayList using an iterator:");
        java.util.Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
