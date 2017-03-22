import java.util.Scanner;

public class Ques8 {

    public static void main(String[] args) {

         }

    public String reverseAndRemove(String str) {

        StringBuffer sb=new StringBuffer(str);
        String rev=sb.reverse().delete(4,9).toString();
        return rev;
    }
}