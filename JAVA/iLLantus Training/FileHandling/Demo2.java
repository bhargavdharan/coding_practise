import java.io.FileInputStream;
import java.io.FileOutputStream;


class Demo2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fOut = new FileOutputStream("../FileHandling/demo2.txt");
            String s1 = "Java is Independent Programming Language";
            byte b[] = s1.getBytes();
            fOut.write(b);
            fOut.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        
        try{
            FileInputStream fIn = new FileInputStream("../FileHandling/demo2.txt");
            // int res = fIn.read();
            // System.out.println("Data : " + (char) res);
            String s = " ";
            int data = 0;
            while ((data = fIn.read()) != -1) {
                // System.out.print("Data : " + (char) data);
                // System.out.print((char) data + " ");
                s = s + (char)data;
            }
            System.out.println(s);
            fIn.close();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
