package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class WriteTestFile {    

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            Random r = new Random();
            for(int i = 0; i < 100; i++)
            {
                pw.println(r.nextInt());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
