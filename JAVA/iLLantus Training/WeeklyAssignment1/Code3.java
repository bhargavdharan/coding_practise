import java.util.*;
import java.io.*;

class RenameFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter oldName of your file : ");
        String str1 = scan.nextLine();
        File file1 = new File(str1);
        System.out.println("Enter newName for the file : ");
        String str2 = scan.nextLine();
        File file2 = new File(str2);
        try{
            boolean check = file1.renameTo(file2);
            if (check == true) {
                System.out.println("File Successfully Renamed");
            } else {
                System.out.println("Unable to change");
            }
        } catch (Exception e) {
            System.out.println("Error Found : " +e);
        }
    }
}