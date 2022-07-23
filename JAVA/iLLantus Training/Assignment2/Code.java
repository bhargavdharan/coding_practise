package Assignment2;

import java.util.*;
import java.util.Scanner;

// 1.Write a Java program to convert temperature from Fahrenheit to Celsius degree. 
// Note:Celsius = ((Fahrenheit-32)*5)/9  

class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temp in fahrenheit:\t");
        float fah = scan.nextFloat();
        float cel = (float) (((fah - 32) * 5) / 9);
        System.out.println("Temp in celsius:\t" + cel);
    }
}

// output
// Enter temp in fahrenheit:       99
// Temp in celsius:        37


// 2. Write a program to read height in inches and convert to meter.
// Note: meter = Inches  * 0.0254 bvj

class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height in inches:\t");
        float height = scan.nextFloat();
        float meter = height * 0.0254f;
        System.out.println("Height in meters:\t"+meter);
    }
}

// output
// Enter height in inches: 1000
// Height in meters:       25.4

// 3. Write a Java program to takes the user for a distance (in meters) and the
// time was taken (as three numbers: hours, minutes, seconds), and display the
// speed, in meters per second, kilometers per hour and miles per hour (hint: 1
// mile = 1609 meters)

class Program3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in meters:\t");
        float meters = scan.nextFloat();

        System.out.print("Enter time in hours:\t");
        float hr = scan.nextFloat();

        System.out.print("Enter time in mins:\t");
        float min = scan.nextFloat();

        System.out.print("Enter time in seconds:\t");
        float sec = scan.nextFloat();
        
        float timeInSec = (hr * 3600) + (min * 60) + sec;

        float speed1 = (meters / timeInSec);
        float speed2 = (meters / 1000.0f) / (timeInSec / 3600.0f);
        float speed3 = speed2/1.609f;
        System.out.println(speed1);
        System.out.println(speed2);
        System.out.println(speed3);

     }
}

// output
// Enter distance in meters:       2500
// Enter time in hours:    5
// Enter time in mins:     56
// Enter time in seconds:  23
// 0.11691531
// 0.42089513
// 0.26158804

// 4. Write a Java program that accepts two integers greater than 10000 from
// user and then prints the sum, the difference, the product, the average, the
// distance (the difference between integer), the maximum (the larger of the two
// integers), the minimum (smaller of the two integers). .

class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secNum = scan.nextInt();
        if (firstNum > 10000 && secNum > 10000) {
            int sum = firstNum + secNum;
            int product = firstNum * secNum;
            int difference = firstNum - secNum;
            int average = (firstNum+secNum)/2;
            System.out.println("Sum:" + sum);
            System.out.println("Sum:" + product);
            System.out.println("Sum:" + difference);
            System.out.println("Sum:" + average);
            if (firstNum > secNum) {
                System.out.println("Maximum Num:" + firstNum);
                System.out.println("Minimum Num:" + secNum);
            } 
            else {
                System.out.println("Maximum Num:" + secNum);
                System.out.println("Minimum Num:" + firstNum);
            }
        } else {
            System.out.println("Input Numbers greater than 10000!");
        }
    }
}

// output
// 10005
// 10001
// Sum:20006
// Sum:100060005
// Sum:4
// Sum:10003
// Maximum Num:10005
// Minimum Num:10001

// 5.. Write a Java program to read a number from user input and give root of
// the digit as output. The number must be lower than 400.

class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double root = Math.sqrt(num);
        if (num < 400) {
            System.out.println(root);
        } else {
            System.out.println("Plz! Input the value less than 400");
        }
    }
}

// output
// 500
// Plz! Input the value less than 400

// 6. Write a Java program to compare two given signed and unsigned numbers

class Program6 {
    public static void main(String[] args) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;
        System.out.println("Signed Integers: " + num1 + " , " + num2);
        int compareSignedNum = Integer.compare(num1, num2);
        System.out.println("Signed Number "+compareSignedNum);
        int compareUnsignedNum = Integer.compareUnsigned(num1, num2);
        System.out.println("UnSigned Number "+compareUnsignedNum);
    }
}

// output
// Signed Integers: -2147483648 , 2147483647
// Signed Number -1
// UnSigned Number 1

// 7.Write a Java program to get the next floating-point adjacent in the
// direction of positive and negative infinity from a given float/double number.

class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        float num = scan.nextFloat();
        float nextNum = Math.nextDown(num);
        float beforeNum = Math.nextUp(num);
        if (num >= 0) {
            System.out.println(nextNum);
            System.out.println(beforeNum);
        } else {
            System.out.println(nextNum);
            System.out.println(beforeNum);
        }
    }
}

//output
// Enter Number:25
// 24.999998
// 25.000002

// 8.Write a program to add integer value 5 and double value 14.226, diving the
// sum by 2. Give the next floating-point adjacent in the direction of positive.

class Program8 {
    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 14.226;
        double sum = num1 + num2;
        System.out.println("Sum is:\t"+sum);
        double div = sum / 2;
        System.out.println("Div is:\t"+div);
        if (div > 0) {
            double nextNum = Math.nextUp(div);
            System.out.println(nextNum);
        }
    }
}

// output
// Sum is:19.226
// Div is:9.613
// 9.613000000000001

// 9.Write a program to print the list of ASCII value for all Alphabets

class Program9 {
    public static void main(String[] args) {
        char c;
        for ( c = 'a'; c <='z'; c++) {
            System.out.println(c+" = "+(int)c);
        }
        
    }
}

// output
// a = 97
// b = 98
// c = 99
// d = 100
// e = 101
// f = 102
// g = 103
// h = 104
// i = 105
// j = 106
// k = 107
// l = 108
// m = 109
// n = 110
// o = 111
// p = 112
// q = 113
// r = 114
// s = 115
// t = 116
// u = 117
// v = 118
// w = 119
// x = 120
// z = 122
// y = 121

// 10. Write a program to add 3 to the ASCII value for the characters of String
// ‘Java’ and print the equivalent String.

class Program10 {
    public static void main(String[] args) {
        String name = "Java";
        int num = 3;
        String temp = "";
        for (int i = 0; i < name.length(); i++) {
            temp = temp + name.charAt(i) + num;
        }
        System.out.println(temp);
    }
}

// J3a3v3a3