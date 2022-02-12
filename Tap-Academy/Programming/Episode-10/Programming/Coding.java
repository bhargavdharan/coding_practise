import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        // replace even elements with zero
        // print the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // int a = arr[i];
                // int b = 0;
                // int temp;
                // temp = a;
                // a = b;
                // temp = b;
                // System.out.print(temp + " ");
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

// output
// 5
// 3 7 2 6 1
// 3 7 0 0 1

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        // replace even elements with zero
        // print the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                // int a = arr[i];
                // int b = 0;
                // int temp;
                // temp = a;
                // a = b;
                // temp = b;
                // System.out.print(temp + " ");
                arr[i] = -1;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}


class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// output
// 5
// 2 9 8 9 1
// 9(max)
// 2(max frequency)

class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// output
// 5
// 2 9 8 9 1
// 1(min)
// 1(min frequency)

class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

            sum = sum + arr[i];
        }
        System.out.println(min+" "+max);
        System.out.println(sum);
        int maxSum = sum - min;
        int minSum = sum - max;
        System.out.println(minSum + " " + maxSum);
    }
}

// output
// 5
// 3 5 2 1 4
// 1 5
// 15
// 10 14

