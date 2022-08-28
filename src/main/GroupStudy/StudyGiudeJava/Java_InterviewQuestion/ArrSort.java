package StudyGiudeJava.Java_InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrSort {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList(Arrays.asList(6, 8, 12, 10, 4));
        System.out.println("ArrAscending = " + ArrAscending(array));
        System.out.println("ArrDescending = " + ArrDescending(array));

    }
    public static ArrayList<Integer> ArrAscending(ArrayList<Integer> list){

        int value=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(i)<list.get(j)){
                    value=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,value);

                }
            }
        }
        return list;
    }
    public static ArrayList<Integer> ArrDescending(ArrayList<Integer> list){

        int value1=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    value1=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,value1);

                }
            }
        }
        return list;
    }
}