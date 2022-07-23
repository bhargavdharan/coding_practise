// write a program to read age from user ar take it default in program and check valid age for vaccination , age should be in
//  between 12-18 if age is not integer then handle exception 


// import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo3 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         try{
             System.out.print("Enter you age : ");
             int age = scan.nextInt();
             if(age>=12 && age<=18){
                 System.out.println("You are eligible for vaccination");
             } else {
                 System.out.println("You are not eligible for vaccination");
             }
         } catch (Exception e) {
             System.out.println("Error is : " +e);
         }
     }
}
