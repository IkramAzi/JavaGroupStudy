package main.StudyGiudeJava.Java_InterviewQuestion;

public class ArrayInAscendingOrder {

    public static void main(String[] args) {

        int arr[] =  {8, 6, 10, 14 ,12};
        int array = 0; // declare an integer array to be use for looping

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "); // first I will print original array

        }
        System.out.println(); // for separating the line

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { // nested loop
                if (arr[i]< arr[j]){ // for comparing both loops < to print in ascending order > will print descending order
                    array=arr[i]; // loop around, and as it's looping it will place the order in the ascending order and
                    // if change the > it will word in the descending order
                    arr[i] = arr[j];
                    arr[j]=array;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " "); // print array after looping

        }

    }
}


