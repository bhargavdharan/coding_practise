// package part-2;

public class p13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int k = 1; k <= n - i; k++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j < i) {
                    System.out.print(count++ + " ");

                } else {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }
}
