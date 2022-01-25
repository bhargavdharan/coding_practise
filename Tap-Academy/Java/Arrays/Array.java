package Java.Arrays;

import java.util.Scanner;

// Taking input from the keyboard in java 

class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number:\t");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd number:\t");
        int b = scan.nextInt();
        int c;
        c = a + b;
        System.out.println("Adding of two number:\t" + c);
    }
}

// output
// Enter the 1st number: 20
// Enter the 2nd number: 30
// Adding of two number: 50

// One-Dimensional Array(1-D array)

// create an array to store the ages of 5 students

class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n; // size of the array
        System.out.print("Enter the size of the Array:\t");
        n = scan.nextInt();
        int a[] = new int[n]; // create an array
        for (int i = 0; i <= a.length - 1; i++) { // collection of data in Array
            System.out.print("Enter the " + (i + 1) + " person Age : \t");
            a[i] = scan.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) { // Display Data in Array
            System.out.print(a[i] + " ");
        }
        System.out.println("Length of the Array:\t" + a.length);
    }
}
// output
// Enter the size of the Array: 5
// Enter the 1 person Age : 21
// Enter the 2 person Age : 22
// Enter the 3 person Age : 23
// Enter the 4 person Age : 24
// Enter the 5 person Age : 25
// 21 22 23 24 25

// Two-Dimensional Array(2-D Array)

class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.print("Enter No.of Classrooms or Rows:\t");
        m = scan.nextInt();
        System.out.print("Enter No.of Ages or Columns:\t");
        n = scan.nextInt();
        int a[][] = new int[m][n]; // create an Array

        for (int i = 0; i < a.length; i++) { // enter data in array
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter " + (i + 1) + " classroom " + (j + 1) + " person age:\t");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("The ages are:\t");

        for (int i = 0; i < a.length; i++) { // display data in array
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// output
// Enter No.of Classrooms or Rows: 2
// Enter No.of Ages or Columns: 5
// Enter 1 classroom 1 person age: 10
// Enter 1 classroom 2 person age: 11
// Enter 1 classroom 3 person age: 12
// Enter 1 classroom 4 person age: 13
// Enter 1 classroom 5 person age: 14

// Enter 2 classroom 1 person age: 15
// Enter 2 classroom 2 person age: 16
// Enter 2 classroom 3 person age: 17
// Enter 2 classroom 4 person age: 18
// Enter 2 classroom 5 person age: 19

// 10 11 12 13 14
// 15 16 17 18 19

// Three-Dimensional Arrays[3-D Arrays]
class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of schools or blocks:\t");
        int x;
        x = scan.nextInt();
        System.out.println("Enter No of classrooms or rows:\t");
        int y;
        y = scan.nextInt();
        System.out.println("Enter No of students or columns:\t");
        int z;
        z = scan.nextInt();
        System.out.println();
        int a[][][] = new int[x][y][z];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print("Enter " + (i + 1) + " school having " + (j + 1) + " classroom with " + (k + 1)
                            + " student ages :\t");
                    a[i][j][k] = scan.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Ages are :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// output

// Enter No of schools or blocks:
// 2
// Enter No of classrooms or rows:
// 3
// Enter No of students or columns:
// 5

// Enter 1 school having 1 classroom with 1 student ages : 1
// Enter 1 school having 1 classroom with 2 student ages : 2
// Enter 1 school having 1 classroom with 3 student ages : 3
// Enter 1 school having 1 classroom with 4 student ages : 4
// Enter 1 school having 1 classroom with 5 student ages : 5
//
// Enter 1 school having 2 classroom with 1 student ages : 6
// Enter 1 school having 2 classroom with 2 student ages : 7
// Enter 1 school having 2 classroom with 3 student ages : 8
// Enter 1 school having 2 classroom with 4 student ages : 9
// Enter 1 school having 2 classroom with 5 student ages : 10
//
// Enter 1 school having 3 classroom with 1 student ages : 11
// Enter 1 school having 3 classroom with 2 student ages : 12
// Enter 1 school having 3 classroom with 3 student ages : 13
// Enter 1 school having 3 classroom with 4 student ages : 14
// Enter 1 school having 3 classroom with 5 student ages : 15
//
//
// Enter 2 school having 1 classroom with 1 student ages : 16
// Enter 2 school having 1 classroom with 2 student ages : 17
// Enter 2 school having 1 classroom with 3 student ages : 18
// Enter 2 school having 1 classroom with 4 student ages : 19
// Enter 2 school having 1 classroom with 5 student ages : 20
//
// Enter 2 school having 2 classroom with 1 student ages : 21
// Enter 2 school having 2 classroom with 2 student ages : 22
// Enter 2 school having 2 classroom with 3 student ages : 23
// Enter 2 school having 2 classroom with 4 student ages : 24
// Enter 2 school having 2 classroom with 5 student ages : 25

// Enter 2 school having 3 classroom with 1 student ages : 26
// Enter 2 school having 3 classroom with 2 student ages : 27
// Enter 2 school having 3 classroom with 3 student ages : 28
// Enter 2 school having 3 classroom with 4 student ages : 29
// Enter 2 school having 3 classroom with 5 student ages : 30

// Ages are :
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15

// 16 17 18 19 20
// 21 22 23 24 25
// 26 27 28 29 30

// class PhoneBook {
// String name;
// long num;
// }

// class User{
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// PhoneBook user[] = new PhoneBook[3];
// for (int i = 0; i < user.length; i++) {
// PhoneBook ph = new PhoneBook();
// ph.name = "bob";
// ph.num = 990834275;
// user[i] = ph;
// }
// for (int i = 0; i < user.length; i++) {
// System.out.print(user[i] + " ");
// }
// }
// }

// Jagged Arrays

// 2-D Array
class ArrayExample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[2][];
        a[0] = new int[3];
        a[1] = new int[5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print("Enter the ages of class " + i + " student " + j + " \t");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("The ages are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// output
// Enter the ages of class 0 student 0 10
// Enter the ages of class 0 student 1 12
// Enter the ages of class 0 student 2 14
//
// Enter the ages of class 1 student 0 16
// Enter the ages of class 1 student 1 17
// Enter the ages of class 1 student 2 18
// Enter the ages of class 1 student 3 19
// Enter the ages of class 1 student 4 20

// The ages are:
// 10 12 14
// 16 17 18 19 20

// 3-D array
class ArrayExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][][] = new int[2][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[0][0] = new int[2];
        a[0][1] = new int[3];
        a[0][2] = new int[3];
        a[1][0] = new int[2];
        a[1][1] = new int[3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print("Enter the ages of school " + i + " class " + j + " student " + k + " : \t");
                    a[i][j][k] = scan.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The ages are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// output
// Enter the ages of school 0 class 0 student 0 : 10
// Enter the ages of school 0 class 0 student 1 : 12

// Enter the ages of school 0 class 1 student 0 : 12
// Enter the ages of school 0 class 1 student 1 : 13
// Enter the ages of school 0 class 1 student 2 : 14

// Enter the ages of school 0 class 2 student 0 : 15
// Enter the ages of school 0 class 2 student 1 : 16
// Enter the ages of school 0 class 2 student 2 : 15

// Enter the ages of school 1 class 0 student 0 : 20
// Enter the ages of school 1 class 0 student 1 : 1

// Enter the ages of school 1 class 1 student 0 : 19
// Enter the ages of school 1 class 1 student 1 : 20
// Enter the ages of school 1 class 1 student 2 : 21

// The ages are:
// 10 12
// 12 13 14
// 15 16 15

// 20 1
// 19 20 21
