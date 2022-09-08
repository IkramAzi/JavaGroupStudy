package main.StudyGiudeJava.Java_InterviewQuestion;

public class MaxAndMinElementsInArray {

    public static void main(String[] args) {

        int a[] = {50, 30, 40, 20, 60};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min){
                min = a[i];
            }
        }

        System.out.println("Minimum element in array is: "+min);
    }
}
