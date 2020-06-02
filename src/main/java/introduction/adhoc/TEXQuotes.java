package introduction.adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEXQuotes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        while (true) {
           String line = reader.readLine();
           if (line == null) {
               break;
           }
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '"') {
                    System.out.print("''");
                } else {
                    System.out.print(line.charAt(i));
                }
            }
        };
    }
}
