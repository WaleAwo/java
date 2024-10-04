package day20;

import day10.Employee;

import java.util.ArrayList;

/*
 * ArrayList
 * Store same and different data types
 * Zero-based index positioning
 * Duplication allowed
 * Multiple 'nulls' allowed
 * */

public class UsingArrayList {
    public static void main(String[] args) {

        // declaration
        ArrayList arrayList = new ArrayList(); // store any data type
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); // specific data type - wrapper class
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>(); // specific object data type

        // add item to list
        intArrayList.add(12);
        intArrayList.add(12);
        intArrayList.add(24);
        intArrayList.add(200);
        intArrayList.add(1000);
        intArrayList.add(null);
        intArrayList.add(null);

        // list size
        System.out.println("ArrayList size is: " + intArrayList.size());

        // print list
        System.out.println("Print list: " + intArrayList);

        // remove item
        intArrayList.remove(1);
        System.out.println("Print list after removing item: " + intArrayList);

        // insert into list
        intArrayList.add(0, 100);
        System.out.println("Print list after inserting item: " + intArrayList);

        // modify item
        intArrayList.set(1, 300);
        System.out.println("Print list after modifying item: " + intArrayList);

        // get item
        System.out.println("Get item: " + intArrayList.get(1));

        // loop through items
        for (Integer number : intArrayList) {
            System.out.println(number);
        }

        // check list is empty or not
        System.out.println("Is the list empty: " + intArrayList.isEmpty());

        // remove items from list
        ArrayList<Integer> removeListItems = new ArrayList<Integer>();
        removeListItems.add(200);
        removeListItems.add(1000);
        intArrayList.removeAll(removeListItems);
        System.out.println("Print list after removing items: " + intArrayList);

        // remove all items
        intArrayList.clear();
        System.out.println("Is the list empty: " + intArrayList.isEmpty());
    }
}
