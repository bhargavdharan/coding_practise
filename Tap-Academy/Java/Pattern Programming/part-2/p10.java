// package part-2;

public class p10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // int count = i;
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}