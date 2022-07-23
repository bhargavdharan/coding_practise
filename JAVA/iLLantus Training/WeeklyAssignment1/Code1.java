import java.util.*;
import java.io.*;

class ReadFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you source file name : ");
        String str = scan.nextLine();
        File rFile = new File(str);
        try {
            FileInputStream fIn = new FileInputStream(rFile);
            String s = " ";
            int data;
            while ((data = fIn.read()) > 0) {
                s = s + (char) data;
            }
            System.out.println(s);
            fIn.close();
            System.out.println("Successfully retrieved!");

        } catch (IOException e) {
            System.out.println("Error Founded : " +e);
        }
    }
}