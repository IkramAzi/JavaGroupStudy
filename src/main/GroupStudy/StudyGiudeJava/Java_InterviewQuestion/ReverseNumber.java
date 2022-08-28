package StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class ReverseNumber {

//    public static void main(String[] args) {
//
//        //input number 123
//
//        // first I will declare a scanner for the number input
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number");
//
//        // second I will declare the given int
//        int number, remainder;
//
//        number = input.nextInt();
//
//        // I will use the while loop to reverse the number
//        while(number>0){ // while loop execute if the number is  > or else it will not return any value
//         remainder =   number%10; // we will have to take out the remainder number by dividing into 10.
//            // we divide by 10 to get the last digit of the input number
//            number = number /10; // while loop will execute until the conditions becomes false.
//            System.out.print(remainder);
//
//        }
//}

    public static void main(String[] args) {

        int number = 678;

        int remainder = 0;

        while(number>0){
            remainder =number%10;

            number = number/10;

            System.out.println(remainder);
        }
    }



    }

