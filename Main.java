import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Berkin Öztürk - 20180602025

public class Main {
    public static void main(String[] args) {

            File myObj1 = new File("C:\\Users\\C605\\Desktop\\file1.txt");
            File myObj2 = new File("C:\\Users\\C605\\Desktop\\file2.txt");
            File myObj3 = new File("C:\\Users\\C605\\Desktop\\file3.txt");
            MyThread t1 = new MyThread(myObj1,"1");
            MyThread t2 = new MyThread(myObj2,"2");
            MyThread t3 =new MyThread(myObj3,"3");

            t1.start();
            t2.start();
            t3.start();

            try {
            t1.join();
            t2.join();
            t3.join();
            }
            catch (InterruptedException e) {
                    e.printStackTrace();
            }


    }
}

