package main.StudyGiudeJava.Java_InterviewQuestion;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {



        int [] a = {1,2,3};
        int [] b = {4,5,6,7};

        int [] c = new int [ a.length + b.length];

        int add = 0;
        for (int i = 0; i < a.length; i++) {
            c[add]=a[i];

            add++;
        }
        for (int j = 0; j < b.length; j++) {
            c[add]=b[j];
            add++;
        }

        System.out.println(Arrays.toString(c));
    }


}
