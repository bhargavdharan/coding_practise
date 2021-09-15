import java.util.*;

public class PerfectN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your number:\t");
        int num = sc.nextInt();
        int result = 0;

        if (num > 0) {
            for (int i = 1; i < num; i++) {

                if (num % i == 0) {
                    result = result + i;
                }

            }
            if (result == num) {
                System.out.println(num+ " is a perfect number");
            } else {
                System.out.println(num+ " is not a perfect number");
            }
        } else {
            System.out.println("Please enter a positive number");
        }


    }
}
