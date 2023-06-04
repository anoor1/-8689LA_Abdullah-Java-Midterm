package data_structures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        // The absolute path
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car.txt";
        // The relative path
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "/src/data_structures/data/" + "self-driving-car";
        File txtFile = new File(filePath);

        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line=br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
