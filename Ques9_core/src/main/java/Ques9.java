import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques9 {


    public String printContentOfFile(BufferedReader reader) throws IOException{

        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
              while((line = reader.readLine()) != null) {

                  if (stringBuilder.length() > 0) {
                      stringBuilder.append("\n");
                  }
                  stringBuilder.append(line);

              }

            return stringBuilder.toString();

        } finally {
            reader.close();
        }

    }

}