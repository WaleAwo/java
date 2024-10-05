package collections;

import classobjects.Employee;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * Store same and different data types
 * No Zero-based index positioning
 * Duplicate elements & Multiple 'nulls' not allowed
 * */

public class UsingHashSet {
    public static void main(String[] args) {

        // declaration
        HashSet hashSet = new HashSet(); // store any data type
        HashSet<Integer> intHashSet = new HashSet<Integer>(); // store specific data type using wrapper class
        HashSet<Employee> employeeHashSet = new HashSet<Employee>(); // specific object data type

        // add item to set
        intHashSet.add(12);
        intHashSet.add(12); // this will be removed
        intHashSet.add(121);
        intHashSet.add(null);
        intHashSet.add(null); // this will be removed

        // set size
        System.out.println("HashSet size is: " + intHashSet.size());

        // print set
        System.out.println("Print set: " + intHashSet);

        // remove item from set
        intHashSet.remove(12);
        System.out.println("Print set after removing item: " + intHashSet);

        // convert hashset to arraylist
        ArrayList<Integer> arrayListConvert = new ArrayList<Integer>(intHashSet);

        // loop through items
        for (Integer number : intHashSet) {
            System.out.println(number);
        }

        // remove all items
        intHashSet.clear();
        System.out.println("Is the set empty: " + intHashSet.isEmpty());
    }
}
