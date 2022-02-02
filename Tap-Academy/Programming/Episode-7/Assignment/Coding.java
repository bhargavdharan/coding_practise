import java.util.Scanner;

class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            System.out.println(arr[i] + " ");
        }
    }
}

// output
// 5
// 1 2 3 4 5
// 1 2 3 4 5

class Code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            System.out.println(arr[i] + " ");
        }
    }
}

// output
// 5
// 10 11 12 13 14
// 10 11 12 13 14

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            // System.out.println(arr[i] + " ");
        }
        for (int k = arr.length-1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }
    }
}

// output
// 5
// 1 2 3 4 5
// 5 4 3 2 1

class Code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 5
// 10 11 12 13 14
// 10 12 14

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (i % 2 == 1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 5
// 10 12 14 16 18
// 12 16

class Code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 10 13 14 15 18
// 10 14 18

class Code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 10 13 14 15 18
// 13 15

class Code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 5
// 1 4 6 3 10
// 10 6 4

class Code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            if (arr[i] % 2 == 1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// output
// 1 4 6 3 10
// 3 1