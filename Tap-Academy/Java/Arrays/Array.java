import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("No.0f Ages : \t");
        n = scan.nextInt();
        int a[] = new int[n];
        int i;
        for (i = 0; i < n - 1; i++) {
            a[i] = scan.nextInt();
        }
        for (i = 0; i < n-1 ; i++) {
            
            System.out.println("Array of age of person is:\t"+ a[i]);
        }
    }
}
