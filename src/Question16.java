import java.util.ArrayList;

public class Question16 {
    public static void main(String[] args) {
        // Create the original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Blue");
        originalList.add("Green");
        originalList.add("Yellow");
        originalList.add("Purple");

        //original ArrayList
        System.out.println("Original ArrayList:");
        for (String color : originalList) {
            System.out.println(color);
        }

        // Clone the original ArrayList
        ArrayList<String> clonedList = new ArrayList<>(originalList);

        // cloned ArrayList
        System.out.println("\nCloned ArrayList:");
        for (String color : clonedList) {
            System.out.println(color);
        }
    }
}
