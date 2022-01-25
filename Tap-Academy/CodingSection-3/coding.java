// program-1
// -- To print all characters of a string in new line
import java.util.*;

class Program1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string:\t");
        String str = scan.nextLine();
        System.out.println(str);
    }
}
// output
// enter a string: Hello
// Hello

// program-2
// -- To reverse a given string
class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:\t");
        String str = scan.nextLine();
        String rStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rStr =  c + rStr;
        }
        System.out.print("reversed word is:\t"+rStr);
    }
}
// output
// Enter a String: Hello
// reversed word is: olleH

// program-3
// No of char in a string


class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:\t");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char t = ' ';
            if (str.charAt(i) != t) {
                count = count + 1;
            }
        }
        System.out.println("No of characters in a String:\t" + count);
    }
}
// output
// Enter a String: hello
// No of characters in a String:   5

// program-4
// no.of UpperCase characters count
class Program4 {
    public static String toUpperCase(String str) {
        String t = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                t = t + (char) (c - 32);
            } else {
                t = t + c;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:\t");
        String str = scan.nextLine();
        System.out.println("Original String :\t" + str);
        String str2 = toUpperCase(str);
        System.out.println("Changed String :\t" + str2);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 == c2) {
                count = count + 1;
            }
        }
        System.out.println();
        System.out.print("No.of UpperCase Characters:\t" + count);
        System.out.println();
    }
}
// output
// Enter a String: Hello
// Original String :       Hello
// Changed String :        HELLO
// No.of UpperCase Characters:     1

// program-4
// no.of LowerCase characters count
class Program5 {
    public static String toLowerCase(String str) {
        String t = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                t = t + (char) (c + 32);
            } else {
                t = t + c;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:\t");
        String str = scan.nextLine();
        System.out.println("Original String :\t" + str);
        String str2 = toLowerCase(str);
        System.out.println("Changed String :\t" + str2);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 == c2) {
                count = count + 1;
            }
        }
        System.out.println("No.of LowerCase Characters:\t" + count);
    }
}
// output
// Enter a String: Hello
// Original String :       Hello
// Changed String :        hello
// No.of LowerCase Characters:     4

// program-6
//-- count no of whiteSpaces
class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:\t");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char t = ' ';
            char c = str.charAt(i);
            if (t == c) {
                count++;
            }
        }
        System.out.println("No of white-spaces in a String:\t" + count);

    }
}
// output
// Enter a String: Hello World!
// No of white-spaces in a String: 1

// special case-1
// find non-duplicate letter
class SpecialCase1 {
    static int getUniqueLetterIndex(String str) {
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 1; j < str.length(); j++) {
                if (c != str.charAt(j) && j != i) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String:\t");
        String str = scan.nextLine();
        System.out.println(getUniqueLetterIndex(str));
    }
}