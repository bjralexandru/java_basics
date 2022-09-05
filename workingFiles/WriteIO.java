package workingFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIO {
    public static void main(String[] args) {
        // The try-catch surronding the statements
        // can be auto-generated with quick-fix.

        // Although I should remember to do it
        // myself. 

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                writer.write("Writing to file.");
                writer.write("\nHere is another line.");
                /* Remember that every time you run this
                 script it will override the last 
                 output.txt so everything else written
                 before will be lost. */
                

                // But most of the times we will
                // read-write from a variable.

                String[] names = {"John", "Carl", "Harry"};

                for (String name : names) {
                    writer.write("\n" + name);
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
