package StudyGiudeJava;

public class Task2_Casting {

    public static void main(String[] args) {

        //Implicit Casting

        int x = 4;
        long x1 = x;

        System.out.println(x1);

        // Explicit Casting

        int y = 4;
        byte y1 = (byte)y;

        System.out.println(y1);

        System.out.println("====================================");

        //WRAPPER CLASSES

        // outboxing

        int z = 5;
        Integer z1 = z; //converted into object

        //unboxing

        Integer z2 = 10;
        int z3 = z2;  //converted object into primitive data time



        String s1 = "Java"; //String literal // object saved in pool memory

        String s3 = s1;

        System.out.println(s3);

        System.out.println(s3==s1);

        String s2 = new String("Java"); // object saved in heap memory


        System.out.println(s1==s2); //

        String s4  = "";
        s4 = s2;

        System.out.println(s2);





    }
}
