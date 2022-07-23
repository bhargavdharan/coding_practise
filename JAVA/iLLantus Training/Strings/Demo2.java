//1.Write a java program to count the number of words in a string?


import java.util.*;

// By using split() method
class CountWords1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you string : ");
        String str = scan.nextLine();
        String words[] = str.split("\\s+");
        if (str == null || str.isEmpty()) {
            System.out.println(0);
            ;
        } else {
            System.out.println("Total words are : " + words.length);
        }

    }
}

// By using tokenizer
class CountWords2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = scan.nextLine();
        StringTokenizer tokens = new StringTokenizer(str);
        if (str == null || str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println("Total words are : "+tokens.countTokens());
        }

    }
}

// By without using built-in library

class CountWords3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        int countWords = 0;
        char chArr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chArr[i] = str.charAt(i);
            if (((i > 0) && (chArr[i] != ' ') && (chArr[i - 1] == ' ')) || ((chArr[0] != ' ') && (i == 0))) {
                countWords++;
            }
        }
        System.out.println("TotalWords are : " + countWords);
    }
}