// 2.Write a java program to reverse a string?

// 3.Write a java program to check string is palindrome or not

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();
        String rStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rStr = c + rStr;
        }
        System.out.println("Reversed String : " + rStr);
    }
}

class Palindrome {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Yes,It is palindrome");
        } else {
            System.out.println("No,It is not palindrome");
        }
    }
}


class Palindrome2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String rStr = " ";

        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        rStr = c + rStr;
           
        }
        System.out.println(rStr);
        if (str.equals(rStr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

