// package part-2;

public class p6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // for (int k = 0; k < (n - 1) - i; k++) {
            //     System.out.print(" ");
            // }
            for (int j = 1; j <= (n-i) + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
