package StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        for (int i = 1 ; i <=number ; i++) {
            if (number%i==0){
                count++;
            }
        }

        if (count==2)
            System.out.println("prime number");
        else{
            System.out.println("not a prime number");
        }

    }
}
