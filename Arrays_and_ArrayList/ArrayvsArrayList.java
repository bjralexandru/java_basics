package Arrays_and_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArrayList {
    public static void main(String[] args) {

        // Arrays are fixed in length and it must
        // be specified.
        String[] friendsArray = new String[4];
        // Or be instancieted with its values.
        String[] frArray2 = { "Alex", "Catalin", "Andrei" };

        // Both are fixed and cannot grow or
        // shrink.

        // ArrayLists in comparison dont have
        // fixed length. They can grow and shrink
        // automatically.
        ArrayList<String> frArrayList = new ArrayList<>();
        // <> is called the diamond operator.

        ArrayList<String> frArrayList2 = new ArrayList<>(Arrays.asList("Alex", "Catalin", "Andrei"));
        // By doing so we're populating the array
        // list with values.

        // Arrays.asList accomplished the same thing
        // but in turn it gives us an IMMUTABLE
        // LIST.

        System.out.println(frArray2[1]); // This is how you get the index of an Array.

        System.out.println(frArrayList2.get(1)); // this is how you get the index of an ArrayList.

        System.out.println(frArray2.length); // This is a field.
        System.out.println(frArrayList2.size()); // This is a method.

        frArrayList.add("Mihai"); // this is how you add items to your list.

        frArray2[0] = "Carl"; // Modify arrays index values.

        frArrayList2.set(0, "Carl"); // Modify arrList values at a certain index.

        // CANNOT REMOVE ITEMS FROM ARRAYS.

        frArrayList2.remove("Catalin"); // remove item from arrList.

        // Printing diffs
        System.out.println(frArray2); // Returns the address in memory for the object
        // Instead you'll have to iterate over it
        // with a for loop.
        System.out.println(frArrayList2); // has a toString() method which returns the content of our object.
    }
}
