import java.util.Scanner;

class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 20
// 1 2 4 5 10 20

class Code2 {
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
// 20
// 6

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 7
// Yes

class Code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 1; i <=m && i<=n ; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output
// 10 20
// 1 2 5 10

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i + " ");
                break;
            }
        }
    }
}

// output
// 10 20
// 10

// lowest common factor
class Code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}

// output
// 10 20
// 1

class Code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 3; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}

// output
// 10 20
// 5


// common multiples
// A common multiple is a whole number that is a shared multiple of each set of numbers.
class Code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

// output
// 100
// 3 4
// 12 24 36 48 60 72 84 96

class Code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int gcd = 1;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        int lcm = (m * n) / gcd;
        System.out.println(lcm);
    }
}

// output
// 8 12
// 24

class Code10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

// output
// 20
// 210