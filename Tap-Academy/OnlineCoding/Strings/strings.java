// package OnlineCoding.Strings;


import java.util.Scanner;

class StringEx1 {
    static String reverse(String str) {
        String t = "";
        for (int i = str.length() - 1; i>=0 ;i--) {
            t = t + str.charAt(i);
        }
        return t;
    }
    public static void main(String[] args) {
        String str = "TAPACADEMY";
        // char ch;
        System.out.println(reverse(str));
    }
}


class StringEx2 {
    static String reverse(String str) {
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            t = t + ch;
        }
        return t;
    }

    static boolean isPalindrome(String str) {
        if (str.equals(reverse(str))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "TAPACADEMY";
        System.out.println(reverse(str));
        System.out.println(isPalindrome(str));
    }
}

class StringEx3 {
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "MALAYALAM";
        System.out.println(isPalindrome(str));
    }
}

class StringEx4 {
    static int countVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                    || c == 'U') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcbca";
        System.out.println(countVowels(s));
    }
}

// class StringEx5 {
//     static int removeVowels(String s) {
//         String t = "";
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
        
//             if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
//                     || c == 'U') {
//                 // count++;
//             } else {
//                 t = t + c;
//             }
//          }
//         return t;
//     }
//     public static void main(String[] args) {
//         String s = "CODING";
//     }
// }

class StringEx5 {
    static String reverse(String s) {
        char c[] = s.toCharArray();
        int i=0,j=c.length-1;
        while (i <= j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s);
        s = reverse(s);
        System.out.println(s);
    }
}

// class StringEx6 {
//     static void printAllSubstrings(String str) {
//         int n = str.length();
//         for (int len=1;len<=n;len++)
//         {
//             for (;;)
//             {
//                 for (;;) {
//                     System.out.print(st.charAt(e));
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         String s = "abcde";
//         printAllSubstrings(s, 2);
//     }
// }


