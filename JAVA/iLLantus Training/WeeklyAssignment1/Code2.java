import java.util.*;
import java.io.*;

class FileDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your file name : ");
        String str = scan.nextLine();
        File file = new File(str);
        System.out.println("Path of the file : "+file.getPath());
        System.out.println("Size of the file : "+file.length());
    }
}
