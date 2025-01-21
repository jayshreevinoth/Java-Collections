import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

class ArrayListPractice {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("Z");
        str.add("A");
        str.add("P");
        str.add("P");

        // Sorting the array
        Collections.sort(str);

        /*
         * Remove dupicates using iterator by creating another list by storing first
         * appearance of each element
         */
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < str.size(); i++) {
            if (!temp.contains(str.get(i))) {
                temp.add(str.get(i));
            }
        }

        /* Remove duplicates using LinkedHashSet */
        LinkedHashSet<String> hashtemp = new LinkedHashSet<String>();
        hashtemp.addAll(str);

        /* Removes duplicates using streams distinct */
        List<String> tempStream = str.stream().distinct().collect(Collectors.toList());

        // Convert array list to array
        String[] a = str.toArray(new String[str.size()]);

        // Convert array to arraylist
        List<String> l = new ArrayList<String>();
        l = Arrays.asList(a);
    }
}