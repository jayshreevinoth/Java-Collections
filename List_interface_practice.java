import java.util.ArrayList;
import java.util.List;

class List_interface_practice {
    public static void main(String args[]) {

        // Adding the elements using add() method
        List<Number> l1 = new ArrayList<Number>();
        List<Number> l2 = new ArrayList<Number>();
        l1.add(5);
        l1.add(10);
        l1.add(15);

        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);
        l2.add(2);
        l2.add(2);

        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l2);

        // updating elements using set() method
        List<String> str1 = new ArrayList<String>();
        str1.add("all");
        str1.add("all");
        str1.add("best");
        System.out.println("Initial value:" + str1);
        str1.set(1, "the");
        System.out.println("After update: " + str1);

        // Searching for elements using indexOf(), lastIndexOf methods
        System.out.println(l1.indexOf(10));
        System.out.println(l2.indexOf(4));
        System.out.println(l2.lastIndexOf(2));
        System.out.println(l1.indexOf(100));

        // Removing elements using remove() method
        l2.remove(5);
        str1.remove(1);
        System.out.println(l2);
        System.out.println(str1);

        // Accessing Elements in List class using get() method
        l1.add(l2.get(2));
        System.out.println(l1);

        // Checking if an element is present in the List class using contains() method
        System.out.println(l1.contains(2) + "  " + str1.contains("all"));

    }
}