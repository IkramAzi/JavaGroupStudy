package StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {


        System.out.println("Enter Term");
        Scanner input = new Scanner(System.in);
        int term = input.nextInt();
        int a = 0, b= 1, c;

        for (int i = 0; i < term; i++) {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;

        }



    }
}
