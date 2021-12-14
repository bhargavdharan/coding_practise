// package part-2;

public class p7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int count = i;
           for (int j = 1; j <= (n-i)+1; j++) {
               System.out.println(count++ + " ");
           }
            System.out.println();
        }
    }
}
