package main.StudyGiudeJava;

public class Task12_Exceptions_FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }


//        try {
//            try {
//                int result = 1 / 0;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Something caught");
//            } finally {
//                System.out.println("Not quite finally");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught");
//        } finally {
//            System.out.println("Finally");
//        }
    }
}


