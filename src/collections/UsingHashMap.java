package collections;

import java.util.HashMap;

/*
 * Store data in key:value pairs
 * Keys are unique
 * No Zero-based index positioning
 * */

public class UsingHashMap {
    public static void main(String[] args) {

        // declaration
        HashMap<Integer, String> students = new HashMap<>(); // specific data type - wrapper class

        // add item to map
        students.put(101, "Mark");
        students.put(102, "Lisa");
        students.put(103, "Bob");
        students.put(103, "Carl"); // this will replace the existing entry with the same key

        // print map
        System.out.println("Print map: " + students);

        // map size
        System.out.println("HasMap size is: " + students.size());

        // remove map pair
        students.remove(102);
        System.out.println("Print map after removing pair: " + students);

        // get value of a key
        System.out.println("Value of key 101 is: " + students.get(101));

        // get all map keys
        System.out.println("Print all keys: " + students.keySet());

        // get all map values
        System.out.println("Print all values: " + students.values());

        // get all map key/values
        System.out.println("Print all key/values: " + students.entrySet());

        // loop through map
        for (int key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }
    }
}
