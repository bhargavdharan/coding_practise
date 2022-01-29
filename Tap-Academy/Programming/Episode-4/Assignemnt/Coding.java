import java.util.Scanner;

class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

// output
// 5
// 1 2 3 4 5

class Code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(n + i - 1 + " ");
        }
    }
}

// output
// 5
// 5 4 3 2 1

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 5
// 2 4

class Code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 5
// 1 3 5

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 10
// 2 4 6 8 10

class Code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int m = 2 * i;
            System.out.print(m + " ");
        }
    }
}

// output
// 5
// 2 4 6 8

class Code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = 3 * i;
            System.out.print(m + " ");
        }
    }
}

// output
// 5
// 3 6 9 12 15

class Code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = 5 * i;
            System.out.print(m + " ");
        }
    }
}

// output
// 5
// 5 10 15 20 25

class Code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 5
// 2 3 4

class Code10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 5
// 2 4 5

