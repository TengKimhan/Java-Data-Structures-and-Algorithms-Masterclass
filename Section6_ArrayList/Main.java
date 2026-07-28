import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creation
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Kimhan", "Doe"));

        // Insertion
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1, 3);

        // Accessing
        System.out.println(arrayList.get(0));

        // Traversal
        for(int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for(int item:arrayList) {
            System.out.println(item);
        }

        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Searching
        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.indexOf(2));
        for(int item : arrayList) {
            if (item == 2) {
                System.out.println("Element number 2 is index: " + arrayList.indexOf(2));
                break;
            }
        }

        // Removing
        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println(names);
        System.out.println(arrayList);
    }
}
