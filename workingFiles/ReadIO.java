package workingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadIO {
    public static void main(String[] args) {
        
    
    try {
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while((line = reader.readLine()) != null ) {
            // This one way to check if you are at
            // the end of file.
            System.out.println(line);
            }
        reader.close();
        // Here we're also try/catching the error.
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}

