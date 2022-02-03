// package Programming.Episode-8.Programming;

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

// output
// 5
// 1 2 3 4 5
// 15

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

// output
// 5
// 1 2 3 4 5
// 6

class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum=0 ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum = (sum + arr[i]);
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
}

// output
// 5
// 1 2 3 4 5
// 3

class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

// 5
// 1 2 3 4 5
// 5


