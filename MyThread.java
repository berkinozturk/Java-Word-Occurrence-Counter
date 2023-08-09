import java.io.*;
import java.util.Scanner;

public class MyThread extends Thread {
    File file;
    String fileName;
    public MyThread(File file,String fileName) {
        this.file=file;
        this.fileName=fileName;
    }
    public void run() {
        int count = -1;
        try {
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader (fr);
            String line = br.readLine();
            while (line != null) {
                String []parts = line.split("Java");
                for( String w : parts)
                {
                    count++;
                }
                line = br.readLine();
            }
            System.out.println(" Java word is found "+count+" times in the " + fileName+"." + " file");
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}