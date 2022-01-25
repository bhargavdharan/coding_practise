import java.util.*;

class Demo1 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

    }
}

class Demo2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if (s1.equals(s2) == true) { 
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");
        }

    }
}

class Demo3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

    }
}



class Demo4 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        if (s1.equals(s2) == true) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");
        }

    }
}

class Demo5 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

    }
}

class Demo6 {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "PYTHON";
        System.out.println(s1);
        System.out.println(s2);
        s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Demo7{
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "PYTHON";
        System.out.println(s1);
        System.out.println(s2);
        s1 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Demo8{
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "PYTHON";
        String s3 = s1.concat(s2);
        String s4 = s1.concat(s2);
        if (s3 == s4) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }
    }
}

class Demo9 {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("CASE-1");
        String s1 = "SACHIN";
        String s2 = "SAURAV";
        int result = s1.compareTo(s2);
        if (result == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result > 0) {
            System.out.println("String1 is greater than String2");
        }else{
            System.out.println("String1 is lesser than String2");
        }
      
        System.out.println("==============================");
        System.out.println("CASE-2");
        String s3 = "SAURAV";
        String s4 = "SACHIN";
        int result2 = s3.compareTo(s4);
        if (result2 == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result2 > 0) {
            System.out.println("String3 is greater than String4");
        }else{
            System.out.println("String3 is lesser than String4");
        }
        System.out.println("==============================");
        System.out.println("CASE-3");
        String a1 = "SACHIN";
        String a2 = "SACHIN";
        int result3 = a1.compareTo(a2);
        if (result3 == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result3 > 0) {
            System.out.println("String1 is greater than String2");
        } else {
            System.out.println("String1 is lesser than String2");
        }
        System.out.println("==============================");
        System.out.println("CASE-4");
        String b1 = "JAVA";
        String b2 = "JAVAC";
        int result4 = b1.compareTo(b2);
        if (result4 == 0) {
            System.out.println("Both Strings are Equal");
        } else if (result4 > 0) {
            System.out.println("String1 is greater than String2");
        } else {
            System.out.println("String1 is lesser than String2");
        }
    }
}

class Demo10 {
    public static void main(String[] args) {
        String s = "roomanTechnologies";
        System.out.println( s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("r"));
        System.out.println(s.endsWith("s"));
        System.out.println(s.indexOf("T"));
        System.out.println(s.charAt(8));
        System.out.println(s.contains("Techno"));
        System.out.println(s.substring(6,10));
        System.out.println(s.substring(6));
        String str = "Java Programming";
        String str1 = "Java";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("m"));

        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("m"));


    }
}

class Demo11 {
    public static void main(String[] args) {
        String str = "JAVA PYTHON SQL AI";
        // StringTokenizer st = new StringTokenizer(str, " ");
        StringTokenizer st = new StringTokenizer(str, "A");
        while (st.hasMoreTokens() == true) {
            System.out.println(st.nextToken());
        }
    }
}

// String Built-in methods
/**
 * indexOf()
 * lastindexOf()
 * toUpperCase()
 * toLowerCase()
 * trim()
 * toCharArray()
 * replace()
 * compareTo()
 * compareToIgnoreCase()
 * contains()
 * endsWith()
 * equals()
 * equalsIgnoreCase()
 * toString()
 */

class BuiltInMethod1 {

    static String toUpperCase(String s) {
        String t = " ";
        for (int i = 0; i < s.length(); i++) {
            // t = t + (char) (s.charAt(i) - 32);
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
            t = t + (char) (s.charAt(i) - 32);
            } else {
                t = t + c;
            }
        }
        
        return t;
    }

    public static void main(String[] args) {
        System.out.println("Built in Method || toUpperCase() ||");
        System.out.println("=======================================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string:\t");
        String s = scan.nextLine();
        System.out.print("Enter string2:\t");
        String s1 = scan.nextLine();

        System.out.println(toUpperCase(s));
        System.out.println(s1.toUpperCase());
    }
}