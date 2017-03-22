import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ques5 {

    public static void main(String[] args) {

    }

    public static Set<Integer> commonElements(Integer[] input1, Integer[] input2) {


        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(input1));

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(input2));
        set1.retainAll(set2);
        return set1;
    }
}