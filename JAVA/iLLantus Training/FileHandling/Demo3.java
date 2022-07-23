// import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide source file name : ");
        String sFile = scan.nextLine();
        System.out.print("Provide destination file name : ");
        String dFile = scan.nextLine();
        // copying data into another file(Read & Write mode)
        try {
            // FileReader fR = new FileReader("../FileHandling/demo2.txt");
            // FileWriter fW = new FileWriter("../FileHandling/newFile2.txt");
            FileReader fR = new FileReader(sFile);
            FileWriter fW = new FileWriter(dFile,true);
            int data;
            // String str = " ";
            while ((data = fR.read()) != -1) {
                // str = str + (char) data;
                fW.write(data);
            }
            System.out.println("Successfully copied data !");

            fR.close();
            fW.close();

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}