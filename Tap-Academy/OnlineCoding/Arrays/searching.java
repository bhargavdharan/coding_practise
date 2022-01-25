package OnlineCoding.Arrays;


import java.util.*;

class LinearSearch {
    public static int linearSearch(int ar[],int key) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int key = scan.nextInt();
        int res = linearSearch(ar, key);
        System.out.println(res);

    }
}

// output
// 5
// 12 14 16 13 16
// 16
// 2

class BinarySearch {
    static int BinarySearch(int arr[], int key) {
        Arrays.sort(arr);
        System.out.println("Sorted Array:\t" + Arrays.toString(arr));
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
                // low = low;
            } else {
                low = mid + 1;
                // high = high;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int key = scan.nextInt();
        int res = BinarySearch(arr, key);
        System.out.println(res);
    }

}

// output
// 6 12 11 15 28 19 20
// 16
// Created Array:[12,11,15,28,19,20]16
// Sorted Array:[11,12,15,19,20,28]-
// -1

// Span of an Array
// Span = max - min
class SpanArray {
    static int SpanArray(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int span = Math.abs(max - min);
        return span;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Created Array:\t" + Arrays.toString(arr));
        int res = SpanArray(arr);
        System.out.println(res);
    }
}

// 