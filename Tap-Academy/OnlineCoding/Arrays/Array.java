package OnlineCoding.Arrays;


import java.util.Scanner;
class problem1 {

    static int walkWidth(int[] a, int k) {
        int width = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= k) {
                width = width + 1;
            } else {
                width = width + 2;
            }
        }
        return width;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        
        System.out.println(walkWidth(a, k));
    }
}


class problem2 {
    static int[] circularArrayRotation(int a[], int k, int q[]) {
        int result[] = new int[q.length];

        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[(i + k) % a.length] = a[i];
        }
        
        for (int i = 0; i < q.length; i++) {
            result[i] = b[q[i]];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int q[] = new int[n];
        for (int i = 0; i < q.length; i++) {
            q[i] = scan.nextInt();
        }
        int k = 3;
        System.out.print(circularArrayRotation(a, k, q));
    }
}

class problem3 {

    static int[] mergeSortedArray(int a1[], int a2[]) {

        int i = 0, j = 0, k = 0;
        int res[] = new int[a1.length + a2.length];
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                res[k] = a1[i];
                i++;
                k++;
            } else {
                res[k] = a2[j];
                j++;
                k++;
            }
        }

        while (i < a1.length) {
            res[k] = a1[i];
            i++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1[] = { 3, 5, 9, 12, 15 };
        int a2[] = { 1, 6, 3 };

        int res[] = mergeSortedArray(a1, a2);
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}