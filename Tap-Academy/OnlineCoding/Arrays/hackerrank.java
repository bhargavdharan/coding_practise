package OnlineCoding.Arrays;


// problem-1   Division sum pair
// Given an array of integers and a positive integer k, determine the number of (i,j) pairs where i<j and ar[i]+ar[j] is divisible by pair
import java.util.*;

class DivisionSum {
    
    static int DivisionPair(int ar[], int k) {
        int count = 0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int ar[] = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println(DivisionPair(ar, k));
    }
}

// problem-2
// odd one-out
class OddOneOut {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int k = scan.nextInt();

        int ar[] = new int[n-1];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        int sn = n * (2 + (n - 1) * 2) / 2;
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        System.out.println(sn);
        System.out.println(sum);
        int mt = sn - sum;
        System.out.println(mt);
    }
}

// problem-3
// AES number
class AESnumber {
    static boolean isAesNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int n = scan.nextInt();
        // System.out.println(isAesNumber(n));
        int l = scan.nextInt();
        int r = scan.nextInt();
        int aes = 0;
        for (int i = l; i <= r; i++) {
            if (isAesNumber(i) == true) {
                aes++;
            }
        }
        System.out.println(aes);
    }
}
// output
//1
// 20
// 5

// problem-4
// Devu and friendship test
class DevFriendship {
    static int friendshipTest(int d[]) {
        int count = 0;
        for (int i = 0; i < d.length-1; i++) {
            if (d[i] != d[i + 1]) {
                count = count + 1;
            }
        }
        return count+1;
    }
    public static void bubbleSort(int d[]) {
        for (int i = 0; i < d.length; i++) {
            for(int j=0;j<d.length-1;j++){
                if (d[j] > d[j + 1]) {
                    int temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d[] = new int[n];

        for (int i = 0; i < d.length; i++) {
            d[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(d));
        bubbleSort(d);
        System.out.println("Sorted Array:\t" + Arrays.toString(d));
        System.out.println("Test Result:\t"+friendshipTest(d));
    }
}

// output
// 5
// 3 2 1 3 4
// Created Array:  [3, 2, 1, 3, 4]
// Sorted Array:   [1, 2, 3, 3, 4]
// Test Result:    4