package com.company;
// HashSet Implementation
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // Size
        System.out.println("size of set is : " + set.size());

        // Search
        if (set.contains(1)) {
            System.out.println("Present");
        }
        if (!set.contains(6)) {
            System.out.println("Absent");
        }

        // Delete

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Absent");
        }

        // Print all elements
        System.out.println(set);

        // Iteration - HashSet does not have an order
        set.add(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", ");
        }
        System.out.println();

        // isEmpty
        if (!set.isEmpty()) {
            System.out.println("set is not empty");
        }

        // LinkedHashSet : Similar to LinkedHashMap, but maintains only keys, not pair . It doesn't entertain duplicate values.

        // Creation
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("One");
        ls.add("Two");
        Iterator<String> i = ls.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Ignoring duplicate elements

        ls.add("Palak");
        ls.add("Megha");
        ls.add("Palak");
        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Remove()
        System.out.println("The HashSet is: " + ls);
        System.out.println(ls.remove("One"));
        System.out.println("Updated HashSet is: " + ls);

    }
}
