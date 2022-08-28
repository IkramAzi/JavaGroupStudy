package StudyGiudeJava.Java_InterviewQuestion;

public class Q8_Sum0fDigitsInNum {

    public static void main(String[] args) {
        int num = 1235;
        int sum = 0;
        while (num>0) {

            sum = sum + num % 10; // 4 + 3
            num = num /10; // 123 12
    }
System.out.println("Sum of digits in a number: "+ sum);
}
}
