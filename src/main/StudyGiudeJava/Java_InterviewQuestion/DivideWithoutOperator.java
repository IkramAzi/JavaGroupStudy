package main.StudyGiudeJava.Java_InterviewQuestion;

import java.util.Scanner;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a , b , c;
        int result=0;

        System.out.println("enter first number");
        a= input.nextInt();

        System.out.println("enter second number");
        b=input.nextInt();

        c=a+b;
        while (c>b){
            c=c-b;
            result++;
        }
        System.out.println("Number equal to "+result);

    }
}
