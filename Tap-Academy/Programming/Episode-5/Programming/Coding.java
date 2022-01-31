import java.util.Scanner;
// import java.util.List;

class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}

// output
// 5
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
// 5 X 4 = 20
// 5 X 5 = 25
// 5 X 6 = 30
// 5 X 7 = 35
// 5 X 8 = 40
// 5 X 9 = 45
// 5 X 10 = 50

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 10
// 1 2 5 10

class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// output
// 10
// 4

class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         count++;
        //     }
        // }
        System.out.println(count);
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }
        // if(count==2)
        // {
        //     System.out.println("prime");
        // } else {
        //     System.out.println("Not prime");
        // }
    }
}

// output
// 10
// not prime

class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = n; i >=1 ; i--) {
            if(m%i==0 && n%i==0)
            {
                System.out.print(i + " ");
            }
        }
        // for (int i = 1; i <=m && i<=n; i++) {
        //     if(m%i==0 && n%i==0)
        //     {
        //         System.out.print(i + " ");
        //     }
        // }
    }
}

// output
// 18 12
// 1 2 3 6

class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            if(m%i==0 && n%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}

// output
// 10 20
// 10