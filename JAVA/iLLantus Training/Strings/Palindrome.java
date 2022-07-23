import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String rStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rStr = c + rStr;

        }
        System.out.println(rStr);

        String str1 = str.toLowerCase();
        String str2 = rStr.toLowerCase();
        if (str1.equals(str2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
