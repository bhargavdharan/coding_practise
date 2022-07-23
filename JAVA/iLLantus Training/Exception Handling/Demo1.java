// package iLLantus Training.Exception Handling;

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        try{
            System.out.println("Enter first number:");
            b = scan.nextInt();
            System.out.println("Enter second number:");
            c = scan.nextInt();

            a = b / c;
            System.out.println("Div="+a);

        } catch (Exception e) {
            System.out.println("Error:" + e);// Error:java.lang.ArithmeticException: / by zero
        }
    }
}
