package main.StudyGiudeJava.MapIntro;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name And score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        students.put("Andriy", 96);
        students.put("Andriy", 78);
        students.put("Andriy", 98);


        System.out.println(students);
        System.out.println(students.size());


        //display the score of Alex:
        System.out.println(students.get("Alex"));

        // replace method value of specific key

        students.replace("Ali", 85);
        System.out.println(students);

        //remove method
        students.remove("Aygun");
        System.out.println(students);
        System.out.println(students.size());

//       containsKey() method
        boolean r1 = students.containsKey("Muhtar");
        System.out.println(r1);

        boolean r2 = students.containsKey("Alex");
        System.out.println(r2);

        // containsValue()
        boolean r3 = students.containsValue("97");
        System.out.println(r3);


        System.out.println(students.isEmpty());


        // equals()

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1);
        System.out.println(map2);

        System.out.println(map1.equals(map2));
// clear()
        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);

    }
}
