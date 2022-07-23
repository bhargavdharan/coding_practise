import java.util.*;
import java.io.*;

class Code1 {
    public static void copyData(File file1,File file2) throws Exception {
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        try{
            int data;
            while((data=inputStream.read()) != -1){
                outputStream.write(data);
            }
        }
        catch (IOException e) {
            System.out.println("Error : " + e);
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }

            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println("Successfully copied data....");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter source file : ");
        String file1 = scan.nextLine();
        File a = new File("../Files/" + file1);

        System.out.print("Enter destination file ");
        String file2 = scan.nextLine();
        File b = new File("../Files/" + file2);
        // copyData(a,b);
        // copyData(file1, file2);
    }
}
