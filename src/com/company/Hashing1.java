package com.company;
// HashMap Implementation
import java.sql.SQLOutput;
import java.util.*;
public class Hashing1 {
    public static void main(String[] args) {
        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);   // updates the value
        System.out.println(map);

        // Searching
        if(map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not  present in the map");
        }

        System.out.println(map.get("China"));  // Key exists
        System.out.println(map.get("Indonesia"));  // Key doesn't exist

        // Iteration (1)
        for(Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " +map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);



        // LinkedHashMap : Similar to HashMap , but keeps order of elements
        LinkedHashMap<String, String> lm = new LinkedHashMap<String, String>();
        lm.put("one", "Red");
        lm.put("two", "Green");
        lm.put("three", "Blue");

        // Print
        System.out.println("LinkedHashMap: " + lm);

        // isEmpty()
        System.out.println("Empty: " + lm.isEmpty());

        // size()
        System.out.println("Size: " + lm.size());

        // get()
        System.out.println("Value for  key: " + lm.get("one"));

        //containsKey()
        System.out.println(lm.containsKey("two"));

        // containsValue()
        System.out.println(lm.containsValue("ree"));

        // remove()
        System.out.println("Delete element: " + lm.remove("one"));
        System.out.println("Updated lm: " + lm);


    }
}
