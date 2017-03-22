import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {


    }

    public int countOccurrences(String str,String character) {

        int count=str.length()-str.replaceAll(character,"").length();
        return count;
    }
}