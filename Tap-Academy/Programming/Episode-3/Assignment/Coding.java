
// import java.util.Scanner;
import java.util.*;

class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c = s.charAt(0);
        int r = (char) c;
        System.out.println(r);
    }
}

// output
// Z
// 90

class Code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c = (char) n;
        System.out.println(c);

    }
}

// output
// 90
// Z

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();
        // char c = s.charAt(0);
        int n = scan.nextInt();
        char c = (char) n;
        System.out.println(c);
        if (c >= 'a' && c <= 'z') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 100
// d
// Yes

class Code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c = (char) n;
        System.out.println(c);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

// output
// 78
// N
// Yes

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c = (char) n;
        System.out.println(c);
        if (c >= '0' && c <= '9') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

// output
// 50
// 2
// Yes

class Code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        if (m % 2 == 0 && n % 2 == 0) {
            System.out.println(m * n);
        } else {
            System.out.println(m + n);
        }

    }
}

// output
// 10 15
// 25

class Code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

// output
// -20
// Negative

class Code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Math.abs(n));
    }
}

// output
// -90
// 90

class Code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

// output
// 10 20
// 20

class Code10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

// output
// 10 20
// 10

class Code11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// output
// 10 20 30
// 30

class Code12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

// output
// 10 20 30
// 10


//---------------------LEVEL-2------------------------

class Code13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        if (n > m) {
            System.out.println("-1");
        } else {
            int res = m / n;
            System.out.println(res);
        }
    }
}

// output
// 2 20
// -1

class Code14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if (marks > 100 && marks < 0) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B+");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C+");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Failed!");
        }
    }
}

// output
// 91
// Grade A+

class Code15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > c && b > d && b > a) {
            System.out.println(b);
        } else if (c > d && c > a && c > b) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}

// output
// 10 25 5 30
// 30

class Code16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < c && b < d && b < a) {
            System.out.println(b);
        } else if (c < d && c < a && c < b) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}

// output
// 10 25 5 30
// 5