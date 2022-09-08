package main.StudyGiudeJava.Java_InterviewQuestion;

public class ArmstrongNumber {

    public static void main(String[] args) {



//        System.out.println("Enter any number");
//        Scanner input = new Scanner(System.in);
//
//        int number = input.nextInt();
//        int number = 153;
//        int remainder = 0;
//        int ArmstrongNumber = 0;
//        int temp= number;
//
//        while(number>0){
//            remainder =number%10;
//         ArmstrongNumber = (remainder*remainder*remainder) + ArmstrongNumber;
//         number= number / 10;
//
//        }
//        if (temp==ArmstrongNumber){
//            System.out.println("Armstrong Number");
//
//        }else{
//            System.out.println("Not an Armstrong Number");
//        }


        int number = 157;
        int remainder = 0;
        int ArmstrongNumber = 0;
        int temp = number;


        while(number>0){

            remainder = number%10;

            ArmstrongNumber = (remainder*remainder*remainder) + ArmstrongNumber;
            number = number/10;

        }


        if (temp == ArmstrongNumber){
            System.out.println("Armstrong number");
        }else
            System.out.println("not an Armstrong number");
        }

    }




