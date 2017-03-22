
public class Ques6 {

    public static void main(String args[])
    {


    }

    public int oddOne(int[] arr) {

        int result = 0;
        for(int i=0;i<5;i++)
            result^=arr[i];
        return result;

    }

}