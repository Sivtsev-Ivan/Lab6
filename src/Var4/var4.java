package Var4;
import java.io.*;

public class var4 {
    public static void main(String[] args) throws IOException {
        BufferedReader inFile = null;
        BufferedWriter outFile = null;
        try {
            inFile = new BufferedReader(new FileReader("C:\\Games\\Lab6_1.txt"),1024);
            outFile = new BufferedWriter(new FileWriter("C:\\Games\\lab6_2.txt"));

            String line;
            while ((line = inFile.readLine()) != null) {
                String[] words = line.split(" ");

                int wordsCount = 0;
                if (words.length != 0) {
                    int firstWordLength = words[0].length();
                    for (String word : words) {
                        if (word.length() < firstWordLength) {
                            outFile.write(" " + word);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        finally {
            inFile.close();
            outFile.flush();
            outFile.close();
        }
    }
}
