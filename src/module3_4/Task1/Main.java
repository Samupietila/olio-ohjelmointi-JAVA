package module3_4.Task1;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {


        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }
        try {
            InputStream inputStream = myUrl.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;
            int counter = 0;
            double sum = 0;

            while (( line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                counter++;
                //System.out.println(counter + ". " + columns[0] + " " + columns[1]);
                if (counter != 1) {
                    String number = columns[1].replace("," , ".");
                    sum += Double.parseDouble(number);
                }

                if(columns[0].equals("01.01.2023 23:50")) {
                    break;}
            }
            System.out.println("Average of all Ulkotalo: " + sum/(counter-1));
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
