import java.util.Scanner;

// Birthday Cake Candles

class HackerCode1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
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
// 9 8 3 9 1
// 2

// Mini-Max-Sum

class HackerCode2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
        }
        int minSum = sum - max;
        int maxSum = sum - min;
        System.out.println(minSum+" "+maxSum);
    }
}

// output
// 5
// 1 2 3 4 5
// 10 14

// A very-big-sum

class HackerCode3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextLong();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

// output
// 5
// 100001 100002 100003 100004 100005
// 500015

// Simple-Array-Sum

class HackerCode4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

// output
// 5
// 1 2 3 4 5
// 15

// Compare the triplets

class HackerCode5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            if (arr1[i] > arr2[i]) {
                alice++;
            } else if (arr1[i] < arr2[i]) {
                bob++;
            }
        }
        System.out.print(alice + " " + bob);
    }
}

// output
// 5
// 2 3 4 5 6
// 1 2 5 1 2
// 4 1

// Breaking-Best and Worst-Records

class HackerCode6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int minCount = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
              
            }

            if (arr[i] < min) {
                min = arr[i];
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxCount++;
            }
            if (arr[i] == min) {
                minCount++;
            }

        }
        System.out.print(maxCount + " " + minCount);
    }
}

// output
// 5
// 1 2 3 4 5
// 1 1
