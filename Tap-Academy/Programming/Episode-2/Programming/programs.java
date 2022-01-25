import java.util.Scanner;

class program1 {
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

//output
// 15
// No

class program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("Yes,it is even");
        } else {
            System.out.println("No,it is not even");
        }
    }
}

//output
// 6
// Yes,it is even

class program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 10 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 19
// No

class program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp;
        temp = n % 10;
        System.out.println(temp);
    }
}

//output
// 576
// 6

class program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp;
        temp = n / 10;
        System.out.println(temp);
    }
}

// output
// 576
// 57

class program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// 30
// yes
