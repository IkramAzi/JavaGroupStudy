package Java_Day5_10;

import java.util.Scanner;

public class CrewAndPassangers {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();


        if (number <= 0 && number <= 100){
           // System.out.println("20 crew, 30 passengers");
        }if (number >= 75){
            System.out.println("25 crew, 50 passengers");
        }else{
            System.out.println("30 crew, 70 passengers");
        }

    }


}
/*
Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50  ====> 20 crew, 30 passengers
Total: 75  ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */