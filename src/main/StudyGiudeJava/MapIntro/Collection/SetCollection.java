package main.StudyGiudeJava.MapIntro.Collection;

import java.util.*;

public class SetCollection {

    public static void main(String[] args) {



    Set<Integer> hashSet = new HashSet<>(); // best choice , random order. faster
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // does not allow duplicates
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90)); // does not allow duplicates
        hashSet.addAll(Arrays.asList(null, null, null)); // does not allow duplicates

        System.out.println(hashSet);

    Set<Integer> linkedHashSet = new LinkedHashSet<>(); // does not allow duplicate, prints in insertion order.
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println(linkedHashSet);


    Set<Integer> treeSet = new TreeSet<>(); // prints in sort. does not allow "null".
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
    //treeSet.addAll(Arrays.asList(null, null, null));
        System.out.println(treeSet);

}
}
