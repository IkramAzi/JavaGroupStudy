package main.StudyGiudeJava;

public class Task15_Break_Continue {

    public static void main(String[] args) {



        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println("I am implementing break statement");
                break;
            }

        }
        for (int j = 1; j < 10; j++) {

            if (j%2!=0){

                continue;
            }
            System.out.print(j+ " ");
        }
    }
}
