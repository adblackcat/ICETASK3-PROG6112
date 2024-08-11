import java.util.ArrayList;

public class Question13 {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Blue");
        list2.add("Green");

        // Create a third ArrayList with different elements
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Red");
        list3.add("Yellow");
        list3.add("Green");

        // Compare list1 and list2
        if (list1.equals(list2)) {
            System.out.println("list1 and list2 are equal.");
        } else {
            System.out.println("list1 and list2 are not equal.");
        }

        // Compare list1 and list3
        if (list1.equals(list3)) {
            System.out.println("list1 and list3 are equal.");
        } else {
            System.out.println("list1 and list3 are not equal.");
        }
    }
}
