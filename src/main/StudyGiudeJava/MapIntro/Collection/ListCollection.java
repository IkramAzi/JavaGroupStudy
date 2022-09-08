package main.StudyGiudeJava.MapIntro.Collection;

import java.util.*;

public class ListCollection {


    public static void main(String[] args) {


        //interface

        List<Integer> list1 = new ArrayList<>(); // to get the element faster
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(1));


        List<Integer> list2 = new LinkedList<>();  //faster in deleting and adding the element
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(0));


        List<Integer> list3 = new Vector<>(); //Synchronized
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>(); //Synchronized. has stack class which has LIFO method
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop(); //LIFO.  deleting the last element

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);


    }
}