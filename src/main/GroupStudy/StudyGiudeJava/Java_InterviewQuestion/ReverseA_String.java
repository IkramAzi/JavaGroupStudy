package StudyGiudeJava.Java_InterviewQuestion;

public class ReverseA_String {

    public static void main(String[] args) {

        String word = "ABCD";

        int  str = word.length();
        String reverse = "";

        for (int i = str-1; i >=0; i--) {
           //reverse = reverse + word.charAt(i);
            reverse+=""+word.charAt(i);

        }

        System.out.println(reverse);
    }
}
