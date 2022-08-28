package StudyGiudeJava;




import java.util.ArrayList;
import java.util.Arrays;

public class Task11_GarbageCollection {

    public static void main(String[] args) {
        /*
        //  int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );
         */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        String str1 = "java"; // eligible for garbage collection
        str1 = "Python";

        System.out.println(str1);











    }

}