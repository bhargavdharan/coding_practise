import java.util.Scanner;

class code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
// output
// 25 25
// 50

class code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int res = a + b + c;
        System.out.println(res);
    }
}
//output
// 25 25 25
// 75

class code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int result1 = a + b;
        int result2 = a + c;
        int result3 = b + c;
        System.out.println(result1 + " " + result2 + " " + result3);
    }
}

// output
// 25 25 25
// 50 50 50

class code4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float celsius = scan.nextFloat();
        float fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println(fahrenheit);
    }
}

// output
// 12
// 53.6

class code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fah = scan.nextInt();
        float cel = ((fah - 32) * 5) / 9;
        System.out.println(String.format("%.4f",cel));
    }
}

// output
// 56
// 13.0000

class code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side = scan.nextInt();
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
}

//output
// 8
// 32

class code7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float pi = (float) 3.142;
        int radius = scan.nextInt();
        float area = pi * radius * radius;
        System.out.println(area);
    }
}

// output
// 18
// 1018.008

class code8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float pi = (float) 3.142;
        int r = scan.nextInt();
        int h = scan.nextInt();
        float totalSurfaceArea = 2 * pi * r * (r + h);
        System.out.println(totalSurfaceArea);

    }
}

// output
// 7 13
// 879.76

class code9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int b = scan.nextInt();
        int perimeter = l * b;
        System.out.println(perimeter);
    }
}

// output
// 2 4
// 8

class code10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollars = scan.nextInt();
        // float rupees = dollars * (float) 74.80;
        float rupees = dollars * (float) 61.060;
        System.out.println(rupees);
    }
}

// output
// 1000
// 61060.0