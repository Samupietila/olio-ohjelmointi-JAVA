package module3_4.Task2;

import java.io.*;
import java.math.BigInteger;

public class Main {
    private final static String FILENAME = "file.csv";
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("file.csv");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("This is Fibonacci sequence of 100 numbers.");
            bufferedWriter.newLine();
            BigInteger x = BigInteger.ONE;
            BigInteger y = BigInteger.ZERO;
            bufferedWriter.write(String.valueOf(y));
            bufferedWriter.newLine();
            bufferedWriter.write(String.valueOf(x));
            bufferedWriter.newLine();
            for (int i = 1; i < 99; i++) {
                BigInteger sum = x.add(y);
                y = x;
                x = sum;
                bufferedWriter.write(String.valueOf(sum));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader file = new FileReader(FILENAME);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            System.err.println(e);
        }
    }
}