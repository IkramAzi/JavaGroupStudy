package StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number% 2==0){
            System.out.println(number+ " is an even Number");
        }else {
            System.out.println(number+ " is an odd number");
        }


    }
}
