package StudyGiudeJava.Java_InterviewQuestion;

import org.junit.jupiter.api.Test;

public class UniqueCharacters {

 /*   public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i); // each character of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index of the character are same, then the character is unique
                result += ch;
            }

        }

        System.out.println("result = " + result);
    }

    }
  */


    public static void main(String[] args) {


        String store = "uuuubiiiii";
        String result = "";

        for (int i = 0; i <= store.length() - 1; i++) {
            char ch = store.charAt(i);

            if (store.indexOf(ch) == store.lastIndexOf(ch)) {
                result += ch;

            }


        }

        System.out.println("result = " + result);
    }


}












