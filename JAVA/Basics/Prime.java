import java.util.*;

public class Prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print(" Enter the lower interval");
        // int lower = sc.nextInt();
        // System.out.print(" Enter the upper interval");
        // int upper = sc.nextInt();
        int lower = 20;
        int upper = 50;

        while (lower < upper) {
            boolean flag = false;
          
            for (int i = 2; i <= lower / 2; i++) {
                if (lower % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && lower != 0 && lower != 1) {
                System.out.println(lower + " ");
                lower++;

            }
      }
    }
}
