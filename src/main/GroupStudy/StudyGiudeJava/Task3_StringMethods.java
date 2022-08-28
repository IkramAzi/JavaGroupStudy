package StudyGiudeJava;



public class Task3_StringMethods {
    public static void main(String[] args) {

        String word1 = "Cydeo";
        String word = "   Cydeo     ";
        System.out.println("word = " + word);

        String trim = word.trim();
        System.out.println("trim = " + trim);

        int length = word1.length();
        System.out.println("length = " + length);

        char char1 = word1.charAt(0);
        System.out.println("char1 = " + char1);

        String substring = word1.substring(1,4+1);
        System.out.println("substring = " + substring);

        int index = word1.indexOf("d");
        System.out.println("index = " + index);

        int lastIndex = word1.lastIndexOf("e");
        System.out.println("lastIndex = " + lastIndex);

        String lowerCase1 = word1.toLowerCase();
        System.out.println("lowerCase = " + lowerCase1);

        String upperCase1 = word1.toUpperCase();
        System.out.println("UpperCase1 = " + upperCase1);

        boolean isTrue = word1.isEmpty();
        System.out.println("isTrue = " + isTrue);

        boolean contains1  = word1.contains("Cy");
        System.out.println("contains1 = " + contains1);

        String replaceC = word1.replace("C","c");
        System.out.println("replaceC = " + replaceC);

    }
}
