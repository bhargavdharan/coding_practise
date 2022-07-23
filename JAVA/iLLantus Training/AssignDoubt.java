import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        float num = scan.nextFloat();
        if (num > 0) {
            float res1 = num + 1.0f;
            float res2 = num - 1.0f;
            System.out.println("Next Positive number is :" + res1);
            System.out.println("Before Positive number is :" + res2);
        } else if (num < 0) {
            float res1 = num + 1.0f;
            float res2 = num - 1.0f;
            System.out.println("Next Negative number is :" + res1);
            System.out.println("Before Negative number is :" + res2);

        } else {
            System.out.println(0);
        }
    }
}