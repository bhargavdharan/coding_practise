package Java.problems;
// package Java.problems;

import java.util.Scanner;

 class TriangleGame {

    static void gameResult(int a,int b, int c) {
        if ((a + b + c) == 180) {
            if (a == 60 && b == 60 && c == 60) {
                System.out.println("Prize3");
            } else if (a == 90 || b == 90 || c == 90) {
                System.out.println("Prize2");
            } else {
                System.out.println("Prize1");
            }
        }else{
            System.out.println("No Prize");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Angle1:\t");
        int a = scan.nextInt();

        System.out.println("Enter Angle2:\t");
        int b = scan.nextInt();

        System.out.println("Enter Angle3:\t");
        int c = scan.nextInt();

        gameResult(a, b, c);
    }
}
