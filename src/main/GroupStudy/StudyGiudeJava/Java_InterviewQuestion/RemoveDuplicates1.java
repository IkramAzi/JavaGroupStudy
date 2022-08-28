package StudyGiudeJava.Java_InterviewQuestion;

public class RemoveDuplicates1 {

    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: represents all the index numbers of str (starting from 0)
            String ch = ""+str.charAt(i); // represents each of the Character

            if (!result.contains(ch)){// if the character is no contained in the result

                result += ch; // the character will be added to the result
            }



        }

        System.out.println(result);
    }
}
