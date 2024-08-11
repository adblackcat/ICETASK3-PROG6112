import java.util.ArrayList;

public class Question15 {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");

        // ArrayLists before joining
        System.out.println("First ArrayList:");
        for (String color : list1) {
            System.out.println(color);
        }

        System.out.println("\nSecond ArrayList:");
        for (String color : list2) {
            System.out.println(color);
        }

        // Join  two ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Print the joined ArrayList
        System.out.println("\nJoined ArrayList:");
        for (String color : joinedList) {
            System.out.println(color);
        }
    }
}
