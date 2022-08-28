package StudyGiudeJava.Java_InterviewQuestion;

public class PalindromeNumber {


    public static void main(String[] args) {

        System.out.println(isPalindrome(545));

    }
public static boolean isPalindrome(int num){

        int original = num;

        int reverseNum = 0;
        int remainder = 0;

        while (num>0){

            remainder = num % 10;

            reverseNum = (reverseNum *10) + remainder;

            num = num / 10;

        }

        return reverseNum == original;
}




}
