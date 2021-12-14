package Java.problems;

import java.util.Scanner;

class countDivisors {
    static int countDiv(int l, int r, int k) {
        int count = 0;
        for (int i = 1; i <= r; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(countDiv(l, r, k));
    }
}