import java.util.Scanner;

public class Ques4 {
    public static int uppercase=0;
    private static int lowercase=0;
    private static int digit=0;
    private static int special=0;

    public static void main(String[] args) {


    }

    public int[] countLetters(String str) {

        int length=str.length();
        for ( int i = 0; i < length ; i++ )
        {
            if (Character.isUpperCase(str.charAt(i)))
            {
                uppercase++;
            }

            else if (Character.isLowerCase(str.charAt(i)))
            {
                lowercase++;
            }

            else if (Character.isDigit(str.charAt(i)))
            {
                digit++;
            }
            else
                special++;
        }
        int a[]={uppercase,lowercase,digit,special};

        return a;
    }

}