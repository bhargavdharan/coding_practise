import java.util.*;
import java.util.Scanner;

class Code1 {
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

class Code2 {
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

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

// output
// 5
// 1 2 3 4 5
// 9

class Code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 5
// 1 4 6 3 10
// 4 6 3 10

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

// output
// 5
// 1 4 6 3 10
// 19

class Code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int pSum = 0;
        int nSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > 0) {
                pSum = pSum + arr[i];
            }
            if (arr[i] < 0) {
                nSum = nSum + arr[i];
            }
        }
        System.out.println(pSum);
        System.out.println(nSum);
    }
}

// output
// 6
// 1 -4 -6 3 10 -20
// 14
// -30

class Code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int pSum = 0;
        int nSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > 0) {
                pSum = pSum + arr[i];
            }
            if (arr[i] < 0) {
                nSum = nSum + arr[i];
            }
        }
        int absVal = Math.abs(pSum + nSum);
        System.out.println(absVal);
    }
}

// output
// 6
// 1 -4 -6 3 10 -20
// 16

class Code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }
        int avg = (sum / arr.length);
        System.out.println(avg);
    }
}

// output
// 5 
// 1 4 6 3 10
// 4

class Code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }

        System.out.println("Negative Elements");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Even Elements");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Odd Elements");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

// output
//6
// -1 2 -3 4 8 10
// Negative Elements
// -1 -3 
// Even Elements
// 2 4 8 10 
// Odd Elements
// -1 -3 
//

class Code10 {
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

// output
// 5
// 1 4 8 34 2
// 34

class Code11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
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
    }
}

// output
// 5
// 1 4 8 34 2
// 1
