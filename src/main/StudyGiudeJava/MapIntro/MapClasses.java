package main.StudyGiudeJava.MapIntro;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //    key     value
        Map<Integer, String> hashMap = new HashMap<>(); // random order. key, value can be null
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

        System.out.println("hashMap = " + hashMap);


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // insertion order. allows null.
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>(); // Sorts. does not allow null key. allow null value
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        // treeMap.put(null, "Hulya");

        System.out.println("treeMap = " + treeMap);


        // prints in random order. Synchronized. does not allow null as key or value
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //  hashtable.put(null, "Hulya");

        System.out.println("hashtable = " + hashtable);





    }

}

/*
browser   chrome
url
username   cydeo
password  cydeo123
 */