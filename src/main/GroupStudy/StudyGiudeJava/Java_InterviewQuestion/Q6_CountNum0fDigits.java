package StudyGiudeJava.Java_InterviewQuestion;

public class Q6_CountNum0fDigits {

    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of Digits: " + count);
    }
}
