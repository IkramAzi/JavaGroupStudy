package StudyGiudeJava.Java_InterviewQuestion;

public class FrequencyOfCharacters2 {

    public static void main(String[] args) {

        String frequency = "AAABBCDD";
         char [] arr = frequency.toCharArray();
         int count = frequency.length();


        for (int j = 0; j < count -1; j++) {
            for (int i = count +1; j <count; i++) {
                if (arr[i] == arr[j]){
                    count++;

            }
                System.out.println(count);
        }

        }
    }
}


/*
String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);



 */