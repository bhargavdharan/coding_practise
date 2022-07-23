import java.util.*;
import java.io.*;

class Code3 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the source file : ");
        String file = scan.nextLine();

        File sFile = new File(file);
        try {
            FileInputStream fIn = new FileInputStream(sFile);

            String str = " ";
            int data;
            while ((data = fIn.read()) > 0) {

                str = str + (char) data;
            }
            System.out.println(str);
            int vowelCount = 0;
            String wordCount[] = str.split("\\s");


            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            
            if (str == null || str.isEmpty()) {
                System.out.println(0);
            } else {
                 System.out.println("No of words : " + wordCount.length);
            }

            System.out.println("No of vowels : " + vowelCount);
            fIn.read();
            fIn.close();
            System.out.println("Successfully Verified!!");

        } catch (IOException e) {
            System.out.println("Error is : "+e);
        }
    }
}