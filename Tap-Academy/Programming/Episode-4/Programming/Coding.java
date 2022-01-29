import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
}

// output
// 5
// 1 2 3 4 5

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print(n - i + 1 + " ");
        }
    }
}

// output
// 5
// 5 4 3 2 1

class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }

}

// output
// 6
// 2 4 6

// class Problem4 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//     }
// }