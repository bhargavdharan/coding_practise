import java.util.*;
import java.io.*;

class VaccinationReport {
    public static void main(String[] args) {
       try{

           Scanner scan = new Scanner(System.in);
           System.out.print("Enter Age Of Children : ");
           int age = scan.nextInt();
           int min = 1000;
           int max = 2000;
           if (age >= 12 && age <= 18) {
               int uniqueID = (int) (Math.random() * (max - min + 1) + min);
               System.out.println("You ID for Vaccination : "+uniqueID);
               System.out.println("Eligible for Vaccination!!");
            } else {
                System.out.println("Not Eligible for Vaccination..");
            }
        } catch (Exception e) {
            System.out.println("Error Found : " + e);
        }
   }
}
