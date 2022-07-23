import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Compare {
    static boolean compareTextFiles(String file1, String file2) throws FileNotFoundException, IOException {
        BufferedReader r1 = new BufferedReader(new FileReader(file1));
        BufferedReader r2 = new BufferedReader(new FileReader(file2));
        int c1 = 0, c2 = 0;
        while (true) {
            c1 = r1.read();
            c2 = r2.read();
            if (c1 == -1 && c2 == -1)
                return true;
            else if (c1 == -1 || c2 == -1 || c1 != c2) {
                return false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your file1 : ");
        String file1 = scan.nextLine();
        System.out.print("Enter your file2 : ");
        String file2 = scan.nextLine();
        try{
            if (compareTextFiles(file1, file2)) {
                System.out.println("Files are same");
            } else {
                System.out.println("Files are different");
            }
        } catch (Exception e) {
            System.out.println("Error Found : "+e);
        }
        
    }
}