import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want? ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i <= num; i++) {
            // System.out.println(num);
            System.out.println(first);
            int temp;
            temp = first;
            first = second;
            second = temp + first;
        }




    }
}