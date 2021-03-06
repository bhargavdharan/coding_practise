package Assignment1;

import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mins = scan.nextInt();
        int secs = mins * 60;
        System.out.println(secs);
    }
}

// output
// 5
// 300

class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
}

// output
// 6 7
// 26

class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voltage = scan.nextInt();
        int current = scan.nextInt();
        int power = voltage * current;
        System.out.println(power);
    }
}

// output
// 230 10
// 2300

class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int eSum = 0;
        int oSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                eSum = eSum + arr[i];
            }
            if (arr[i] % 2 != 0) {
                oSum = oSum + arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + " " + eSum);
        System.out.println("Sum of odd numbers: " + " " + oSum);

        if(oSum>eSum){
            int diff = oSum - eSum;
            System.out.println("Difference is" + " " + diff);
        } else {
            int diff = eSum - oSum;
            System.out.println("Difference is" + " " +diff);
        }
    }
}

// output
// 4
// 2 8 7 5
// Sum of even numbers:  10
// Sum of odd numbers:  12
// Difference is 2

class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int length = scan.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i+1);
            System.out.print(arr[i] + " ");
        }
    }
}

// output
// 12 10
// 12 24 36 48 60 72 84 96 108 120

class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your input, Type in rock, paper, or Scissors: ");
        System.out.println();
        System.out.print("Player1 Input:\t");
        String player1 = scan.nextLine();
        System.out.print("Player2 Input:\t");
        String player2 = scan.nextLine();

        if (player1.equals(player2)) {
            System.out.println("Game TIE");
        } else if ((player1.equals("rock") && player2.equals("paper"))||(player1.equals("paper")&&player2.equals("scissors"))) {
            System.out.println("Player2 Wins!");
        } else {
            System.out.println("Player1 Wins!");
        }
    }
}

// output
// Enter your input, Type in rock, paper, or Scissors: 
// Player1 Input:  rock
// Player2 Input:  paper
// Player2 Wins!

class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        String temp = "";
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        if (num1==temp || num2==temp) {
            System.out.println("Invalid Operation");
        } else {
            System.out.println(sum);
        }
    }
}

// output
// 111
// 222
// 333

class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String name = scan.nextLine();
        int c = a + b;
        System.out.println(c);
        System.out.println(name);
    }
}