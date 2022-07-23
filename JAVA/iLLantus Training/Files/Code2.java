import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

class Code2 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter source file : ");
        String file1 = scan.nextLine();
        System.out.print("Enter destination file : ");
        String file2 = scan.nextLine();

        File source = new File(file1);
        File dest = new File(file2);

        try {
            FileInputStream fIn = new FileInputStream(source);

            FileOutputStream fOut = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int data;

            while ((data = fIn.read(buffer)) > 0) {

                fOut.write(buffer, 0, data);
            }

            fIn.close();
            fOut.close();
            System.out.println("Successfully copied !!!");
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
    }
}