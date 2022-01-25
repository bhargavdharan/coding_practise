import java.util.Scanner;

class code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 2
// Yes

class code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 25
// yes

class code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 100
// yes

class code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 15
// yes

class code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 5 == 0 && n % 3 == 0 && n % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 105
// yes

class code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 10 && n <= 99) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 56
// yes

class code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 100 && n <= 999) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 146
// yes

class code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 100 && n <= 999 && n % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 140
// yes

class code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 100 && n <= 999 && n % 10 == 0 && n % 2 == 0 && n % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 120
// yes

class code10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 159
// No