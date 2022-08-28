package StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class PalindromeInputWord {
    public static void main(String[] args) {

        // to get input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word");

        // First I will reverse the given string
        String str = input.next();
        String result = "";


        for (int i = str.length()-1 ; i >= 0 ; i--) {
            result+=str.charAt(i);

        }

        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);


    }
}
