import java.util.ArrayList;

public class Question19 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // size and capacity of the ArrayList before trimming
        System.out.println("ArrayList size before trimming: " + colors.size());
        System.out.println("ArrayList capacity before trimming: " + getArrayListCapacity(colors));

        // Trim the capacity of the ArrayList to match its size
        trimToSize(colors);

        // size and capacity of the ArrayList after trimming
        System.out.println("ArrayList size after trimming: " + colors.size());
        System.out.println("ArrayList capacity after trimming: " + getArrayListCapacity(colors));
    }

    // trim the capacity of an ArrayList to its size
    public static void trimToSize(ArrayList<?> list) {
        list.trimToSize();
    }

    // Helper method to get the capacity of an ArrayList
    private static int getArrayListCapacity(ArrayList<?> list) {
        return list.size();
    }
}
