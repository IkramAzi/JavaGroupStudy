package main.StudyGiudeJava.Java_InterviewQuestion;

public class ReversString {

//   public static void main(String[] args) {
//
//        String name = "Welcome";
//
//        for (int i = name.length() - 1; i >=0 ; i--) {
//            System.out.print(name.charAt(i));
//        }
//
//       System.out.println();
//
//        String str = "hello";
//
//
//        StringBuffer buffer = new StringBuffer(str);
//       System.out.println(buffer.reverse());
//    }


    public static void main(String[] args) {


        String words = "Ikra";
        String result = "";

        for (int i = words.length()-1; i >= 0 ; i--) {
            //System.out.print(words.charAt(i));
            result+=words.charAt(i);
        }


        System.out.println(result);


    }













}