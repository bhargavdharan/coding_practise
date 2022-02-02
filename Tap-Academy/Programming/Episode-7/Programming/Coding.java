import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int age = 23;
        System.out.println(age);
        int arr[] = { 3, 8, 1, 9, 6 };
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

class Problem2 {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 1, 9, 6 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Problem3 {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 1, 9, 6 };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

class Problem4 {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 1, 9, 6 };
        for (int i = 0; i < arr.length;i++)
        {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
            System.out.print(arr[i] + " ");
        }
    }
}