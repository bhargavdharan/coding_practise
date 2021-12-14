import java.util.*;
class CircleArea{
    public static void main(String[] args) {
        float pi = 3.142f;
        Scanner scan = new Scanner(System.in);
        int r;
        System.out.print("Enter Radius:\t" );
        r = scan.nextInt();
        float Area;
        Area = pi * r * r;
        System.out.println("Area of the Circle is :\t" + Area);
    }
}

// output1
// Enter Radius:   18
// Area of the Circle is : 1018.008

class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side;
        System.out.print("Enter a side:\t");
        side = scan.nextInt();
        int Area;
        Area = side * side;
        System.out.println("Area of Square is :\t" + Area);
    }
}

// output2
// Enter a side:   24
// Area of Square is :     576

class CirclePerimeter {
    public static void main(String[] args) {
        float pi = 3.142f;
        Scanner scan = new Scanner(System.in);
        int r;
        System.out.print("Enter radius:\t");
        r = scan.nextInt();
        float perimeter;
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle :\t" + perimeter);
    }
}

// output3
// Enter radius:   12
// Perimeter of circle :   75.408

class SquarePerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side;
        System.out.print("Enter side:\t");
        side = scan.nextInt();
        int perimeter;
        perimeter = 4 * side;
        System.out.println("Perimeter of Square:\t" + perimeter);

    }
}

// output4
// Enter side:     6
// Perimeter of Square:    24

class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.print("Enter two numbers:\t");
        m = scan.nextInt();
        n = scan.nextInt();
        scan.close();
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        System.out.println("GCD of given numbers : "+n);

    }
}

// output5
// Enter two numbers:      81
// 183
// GCD of given numbers : 3

class LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Enter numbers:\t");
        a = scan.nextInt();
        b = scan.nextInt();
        int lcm;
        lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("Lcm of two numbers is " + lcm);
                break;
            }
            ++lcm;
        }
    }
    
}

// output6
// Enter numbers:  10
// 20
// Lcm of two numbers is 20

class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three number:\t");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number :\t" + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number :\t" + b);
        } else {
            System.out.println("Largest number :\t" + c);
        }
    }
}

// output7
// Enter three number:     10 30 20
// Largest number :        30

class SumOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number:\t");
        n = scan.nextInt();
        int sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

// output8
// Enter a number:100
// 5050

class SumOfN2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter number:\t");
        n = scan.nextInt();
        int sum;
        sum = (n*(n+1))/2;
        System.out.println("Sum:\t" + sum);
    }
}

// output9
// Enter number:   100
// Sum:    5050

class SumOfD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, sum;
        System.out.print("Enter number:\t" );
        n = scan.nextInt();
        
        for (sum=0; n!=0; n/=10) {
            sum += n % 10;
        }
        System.out.println(sum);

    }
}

// output10
// Enter number:123
// 6

class PrimeN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:\t");
        int n;
        n = scan.nextInt();
        int temp = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("It is not prime");
        } else {
            System.out.println("It is prime");
        }
    }
}

// output11
// Enter Number:   29
// It is prime

class ReverseN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:\t");
        int n;
        n = scan.nextInt();
        int r;
        while (n > 0) {
            r = n % 10;
            System.out.print(r);
            n = n / 10;
        }

    }
}

// output12
// Enter number:   123
// 321% 

class PalindromeN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:\t");
        int n,sum=0;
        n = scan.nextInt();
        int result;
        result = n;
        while (n > 0) {
            int rem;
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (result == sum) {
            System.out.println("YES, it is palindrome");
        } else {
            System.out.println("NO, it is not palindrome");
        }
    }
}

// output13
// Enter number:   121
// YES, it is palindrome

class FactorialN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:\t");
        int n;
        n = scan.nextInt();
        int fact;
        fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is:\t"+fact);
    }
}

// output14
// Enter a Number: 5
// Factorial is:   120

class FactorOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number:\t");
        int n;
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// output15
// Enter a Number:20 
// 1 2 4 5 10 20

class PerfectN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:\t");
        int n;
        n = scan.nextInt();
        int result = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (result == sum) {
            System.out.println("YES,it is perfect number");
        } else {
            System.out.println("No,it is not");
        }
    }
}

// output16
// Enter Number:   28
// YES,it is perfect number

class FibonacciS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:\t");
        int n;
        n = scan.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + ",");
            int nextFib;
            nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
    }
}

// output17
// Enter number:   5
// 0,1,1,2,3

class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year:\t");
        int year;
        year = scan.nextInt();
        if (year % 400 == 0) {
            System.out.println(year+"\tYES,it is leap year");
        }else if(year%100==0){
            System.out.println(year+"\tit is not leap year");
        }else if(year%4==0){
            System.out.println(year+"\tit is leap year");
        } else {
            System.out.println(year+"\tNO,it is not leap year");
        }
    }
}

// output18
// Enter Year:     2021
// NO,it is not leap year

class SwapN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number:\t");
        int a;
        a=scan.nextInt();
        System.out.print("Enter 2nd number:\t");
        int b;
        b = scan.nextInt();
        int temp;
        System.out.println("Before Swapping:\n"+a+"\t"+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:\n "+a+"\t"+b);
    }
}

// output19
// Enter 1st number:       10
// Enter 2nd number:       20
// Before Swapping:        10      20
// After Swapping:  20     10

class DecToBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a dec number:\t");
        int decN;
        decN = scan.nextInt();
        System.out.println("Decimal Representation:\t" + decN);
        System.out.println("Binary Representation:\t" + Integer.toBinaryString(decN));
    }
}

// output20
// Enter a dec number:     10
// Decimal Representation: 10
// Binary Representation:  1010

class C2F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int celsius;
        float fahrenheit;
        System.out.print("Enter celsius:\t");
        celsius = scan.nextInt();
        fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temp in fahrenheit:\t"+fahrenheit);
    }
}

// output21
// Enter celsius:  52
// Temp in fahrenheit:     125.0

class EvenROdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:\t");
        int n;
        n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("YES,it is even");
        } else {
            System.out.println("No,it is odd");
        }
    }
}

// output22
// Enter number:   2
// YES,it is even