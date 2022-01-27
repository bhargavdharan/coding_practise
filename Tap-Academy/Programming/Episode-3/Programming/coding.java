import java.util.Scanner;

class Problem1{
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String s = scan.next(); it helps us take only one word at a time
        String s = scan.nextLine();
        System.out.println(s);
    }
}

class Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        float percentage = scan.nextFloat();
        String college = scan.nextLine();
        String city = scan.nextLine();
        System.out.println(college + " " + city);
        System.out.println(percentage);
        System.out.println(age);
    }
}

// output
// 21
// 98
// Bharath University
//  Bharath University
// 98.0
// 21

class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char t = s.charAt(0);
        int result = (char) t;
        System.out.println(result);
        
    }
}

// output
// A
// 65

class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c = s.charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// output
// z
// No

class Problem5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            char c = s.charAt(0);
            if(c>='a'&&c<='z'){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

// output
// A
// No

class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b && a > b) {
            System.out.println(a + " is largest");
        } else if (b > c && b > a) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}

// output
// 10 20 30
// 30 is largest

class Challenge2 {
    static int max(int a, int b, int c) {
        int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res = max(a, b, c);
        System.out.println(res);
    }
}

class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if (marks > 100 && marks < 0) {
            System.out.println("Invalid marks");
        } else if (marks >=90) {
            System.out.println("Grade A++");
        } else if (marks >=80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B++");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C++");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Failed!");
        }
    }
}