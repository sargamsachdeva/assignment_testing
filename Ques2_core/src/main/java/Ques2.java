import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ques2 {
    public static void main(String[] args) {


    }

    public String findDuplicateWords(String str) {

        String[] words = str.split("");

        Map<String,String> wordMap = new HashMap<String,String>();

        for(int i=0;i<words.length;i++) {
            String word = words[i];

            if (wordMap.get(word) != null) {
                return word;

            }
            else {
                wordMap.put(word, word);

            }
        }

        return "";
    }

}