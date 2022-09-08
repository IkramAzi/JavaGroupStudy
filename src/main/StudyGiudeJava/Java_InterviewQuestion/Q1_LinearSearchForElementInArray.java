package main.StudyGiudeJava.Java_InterviewQuestion;

public class Q1_LinearSearchForElementInArray {


    public static void main(String[] args) {

        int a[] = {10, 20, 40, 50, 30, 40};
        int search_ele = 40;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {

            // System.out.println(a[i]):
            if (search_ele == a[i]) {
                System.out.println("Element Found at: " + 1);
                flag = true;
                break; // if element is not found it will exit the loop
            }
        }
        if (flag == false)
            System.out.println("Element not found! ");
    }
}
