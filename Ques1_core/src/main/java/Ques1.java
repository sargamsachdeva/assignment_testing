import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class Ques1 {



    public static void main(String[] args) throws FileNotFoundException
    {

    }

    public String replaceSubstring(String str , String substr , String strReplace) {

        boolean b=str.indexOf(substr)>=0;
        if(b) {
            String result=str.replaceAll(substr, strReplace);
            return result;
        }
        else {

            throw new StringIndexOutOfBoundsException();
            //System.out.println("String doesn't contain the required substring");
        }
      //  return "";
    }

}
