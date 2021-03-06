// package Assignment3;

//     1. Consider the following code snippet.
// if (aNumber >= 0)
//     if (aNumber == 0)
//         System.out.println("first string");
// else 
//     System.out.println("second string");
// System.out.println("third string");

//         a. Exercise: What output do you think the code will produce if aNumber is 3?
// Solution:
// second string
// third string

//         b. Exercise: Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is. In other words, what is the control flow for the code snippet?
// Solution: 
// second string
// third string
// 3 is greater than or equal to 0, so execution progresses to the second if statement. The second if statement's test fails because 3 is not equal to 0. Thus, the else clause executes (since it's attached to the second if statement). Thus, second string is displayed. The final println is completely outside of any if statement, so it always gets executed, and thus third string is always displayed.

//         c. Exercise: Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
// Solution:
// if (aNumber >= 0)
//     if (aNumber == 0)
//         System.out.println("first string");
//     else
//         System.out.println("second string");

// System.out.println("third string");

//         d. Exercise: Use braces { and } to further clarify the code and reduce the possibility of errors by future maintainers of the code.
// Solution:
// if (aNumber >= 0) {
//     if (aNumber == 0) {
//         System.out.println("first string");
//     } else {
//         System.out.println("second string");
//     }
// }

// System.out.println("third string");

import java.util.Scanner;

// 2.Write a Java program to get a number from the user and print whether it is positive or negative.

class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}

// output
// 25
// Positive Number

// 3.Write a Java program to solve quadratic equations (use if, else if and else).  

class Program2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double quad = b * b - 4.0 * a * c;
        double root1, root2;
        if (quad > 0) {
            root1 = (-b + Math.sqrt(quad)) / (2 * a);
            root2 = (-b - Math.sqrt(quad)) / (2 * a);
            System.out.println("Root1: " + root1 + " " + "Root2: " + root2);
        } else if (quad < 0) {
            root1 = (-b) / (2 * a);
            root2 = Math.sqrt(quad) / (2 * a);
            System.out.println("Root1: " + root1 + " " + "Root2: " + root2);
        } else {
            root1 = root2 = -b / (2 * a);
            System.out.println("Root1: " + root1 + " " + "Root2: " + root2);
        }
    }
}

// output
// 1
// 5
// 1
// Root1: -0.20871215252208009 Root2: -4.7912878474779195

// 4.  Take three numbers from the user and print the greatest number.

class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = scan.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = scan.nextInt();
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The greatest: " + num1);
        } else if ((num2>num3)&&(num2>num1)) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest: " + num3);
        }
    }
}

// output
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// The greatest: 87

// 5.Write a Java program that reads a floating-point number and prints "zero"
// if the number is zero. Otherwise, print "positive" or "negative". Add "small"
// if the absolute value of the number is less than 1, or "large" if it exceeds
// 1,000,000. 

class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number : ");
        float num = scan.nextFloat();
        if (num > 0) {
            System.out.println("Input Value : " + num);
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Input Value : " + num);
            System.out.println("Negative number");
        } else {
            System.out.println("Input Value : " + num);
            System.out.println("zero");
        }
    }
}

// output
// Input a number : 25
// Input Value : 25.0
// Positive number

// 6. Write a Java program that keeps a number from the user and generates an
// integer between 1 and 7 and displays the name of the weekday.  Test Data

class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number : ");
        int num = scan.nextInt();
        String weekDay = "";
        switch (num) {
            case 1:
                weekDay = "Monday";
                System.out.println(weekDay);
                break;
            case 2:
                weekDay = "Tuesday";
                System.out.println(weekDay);
                break;
            case 3:
                weekDay = "Wednesday";
                System.out.println(weekDay);
                break;
            case 4:
                weekDay = "Thursday";
                System.out.println(weekDay);
                break;
            case 5:
                weekDay = "Friday";
                System.out.println(weekDay);
                break;
            case 6:
                weekDay = "Saturday";
                System.out.println(weekDay);
                break;
            case 7:
                weekDay = "Sunday";
                System.out.println(weekDay);
                break;
            default:
                System.out.println("Invalid Range");
        }
    }
}

// output
// Input number : 5
// Friday

// 7.Write a Java program to find the number of days in a month

class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a month number :");
        int month = scan.nextInt();
        System.out.print("Input a year :");
        int year = scan.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0) || (year%400==0) || (year%100!=0)) {
                    daysInMonth = 29;
                    System.out.println(monthName+" "+"has"+daysInMonth+" days");
                } else {
                    daysInMonth = 28;
                    System.out.println(monthName+" "+"has"+daysInMonth+" days");
                }
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 4:
                monthName = "Aril";
                daysInMonth = 30;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 6:
                monthName = "June";
                daysInMonth = 30;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 9:
                monthName = "September";
                daysInMonth = 30;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                System.out.println(monthName+" "+"has"+daysInMonth+" days");
                break;
        
            default:
                System.out.println("Input a valid Range");
                break;
        }
    }
}

// output
// Input a month number :2
// Input a year :2016
// February has 29 days

// 8.Write a Java program that takes a year from user and print whether that
// year is a leap year or not.

class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input year : ");
        int year = scan.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

// output
// Input year : 2022
// 2022 is not a leap year

// 9.Write a program in Java to display n terms of natural numbers and their
// sum.

class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("No of terms :");
        int N = scan.nextInt();
        int sum = 0;
        System.out.println("The first N natural numbers are :");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum of Natural Numbers : "+sum);
    }
}

// output
// No of terms :5
// The first N natural numbers are :
// 1 2 3 4 5 
// Sum of Natural Numbers : 15

// 10. Write a program in Java to display the cube of the number upto given an
// integer.

class Program9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int N = scan.nextInt();
        for (int i = 1; i <=N ; i++) {
            System.out.println("Number is : "+i+" & "+"cube of "+i+" is : "+(i*i*i));
        }
    }
}

// output
// Input number of terms : 5
// Number is : 1 & cube of 1 is : 1
// Number is : 2 & cube of 2 is : 8
// Number is : 3 & cube of 3 is : 27
// Number is : 4 & cube of 4 is : 64
// Number is : 5 & cube of 5 is : 125

// 11. Write a program in Java to display the multiplication table of a given
// integer. 

class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a Value to display table: ");
        int N = scan.nextInt();
        for (int i = 0; i <=N ; i++) {
            System.out.println(N+" X "+i+" = "+N*i);
        }
    }
}

// output
// Input a Value to display table: 5
// 5 X 0 = 0
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
// 5 X 4 = 20
// 5 X 5 = 25

// 12. Write a program in Java to display the pattern like right angle triangle
// with a number

class Program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input No of rows : ");
        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Input No of rows : 10
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 
// 1 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7 8 9 10