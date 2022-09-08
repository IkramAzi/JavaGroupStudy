package main.StudyGiudeJava.Java_InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphanumericString {

        public static void main(String[] args) {
            String a = "DC501GCCCA098911";
            String b = translate(a);
            System.out.println(b);

        }

        public static String  translate(String a) {
            ArrayList<String> list1 = new ArrayList<>();
            String result = "";
            String result1 = "";
            for (int i = 0; i < a.length() - 1; i++) {
                //getting only letter part and adding to result String
                if (Character.isLetter(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)) || Character.isDigit(a.charAt(i + 1)))) {
                    result += a.charAt(i) + "";
                }
                //special character adding to string to use in the next steps for splitting
                if (Character.isLetter(a.charAt(i)) && (Character.isDigit(a.charAt(i + 1)))) {
                    result += "@";
                }
                //getting only digits part and adding to result String
                if ((Character.isDigit(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)) || Character.isDigit(a.charAt(i + 1))))) {
                    result += a.charAt(i) + "";
                }
                //special character adding to string to use in the next steps for splitting
                if (Character.isDigit(a.charAt(i)) && (Character.isLetter(a.charAt(i + 1)))) {
                    result += "@";
                }

            }
            result += a.charAt(a.length() - 1);
            String arr[]=result.split("@");
            for (String each : arr) {
                char[] chars = each.toCharArray();
                Arrays.sort(chars);
                for(char eachChar: chars){
                    result1 +=""+eachChar;
                }
            }
            return result1;
        }

    }

