class Demo1 {
    public static void main(String[] args) {
        String s1 = "hello i am a superman";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = new String("hello");
        String s5 = "GOOGLE";

        if (s1.equals(s4)) {
            System.out.println("Values are equals");
        } else {
            System.out.println("Values are not equal");
        }

        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("All characters are equal");
        } else {
            System.out.println("All characters are not equal");
        }

        if (s1 == s4) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }
         
        int res = s1.compareTo(s2);
        System.out.println("Res: " + res);

        String[] words = s1.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("Substrings are : "+s1.substring(3));
        System.out.println("Substrings are : " + s1.substring(3, 5));
        
        System.out.println("Uppercase String are : " + s1.toUpperCase());
        System.out.println("Lowercase String are : " + s5.toLowerCase());

        System.out.println("String starts with : " + s2.startsWith("h"));
        System.out.println("String ends with : " + s1.endsWith("n"));

        System.out.println("Index of a letter : "+s1.indexOf("s"));
        System.out.println("Index of a letter : " + s1.indexOf("h"));
        
        System.out.println("Character position : "+s2.charAt(3));
    }
}
