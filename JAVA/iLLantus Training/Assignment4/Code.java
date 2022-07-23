
import java.util.*;
import java.util.Scanner;

// 1.    2. Create a program to derive the square root of the given equation. 
// ax2+by+c=0,where a=10,b=25,and c=10. The formula of deriving root is:[-b{sqrt(b2-4 ac)}]/2 a

class Program1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 10;
        double det = b * b - 4 * a * c;
        double root = (-b * (Math.sqrt(det)) / 2 * a);
        System.out.println(root);
    }
}

// output
// -1875.0

// 2. Create a program to ask the year of birth and tell if it is a leap year.
// User ternary operator for the operation.

class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Year : ");
        int year = scan.nextInt();
        System.out.println( year%4==0 || year%400==0 && year%100!=0 ? "Leap Year" : "Not a Leap year");
    }
}

// output
// Input Year : 2016
// Leap Year

class Program3 {
    public static void main( String args [ ] ) {

          String a = "DataFlair";
          
          String c = "Data";
          
          String d = "Flair";
          
          String b = c+d;
          
          if (a == b) {
          
          System.out.println("a is equal to b");
          
          }
          
          else {
          
          System.out.println("a is NOT equal to b");
          
          }

      }
}

class Program4 {
    public static void main(String[] args) {
        int a = 4;
        float b = 3;
        int c = ++a - +-b;
        System.out.println(c);
    }
}