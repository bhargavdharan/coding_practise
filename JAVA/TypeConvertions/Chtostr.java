class Chtostr {
    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);

        System.out.println("The String is " +st);
    }
    
}

class charString{
    public static void main(String[] args) {
        char[] ch = {'a','e','i','o','u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
    }
}

class stringChar{
    public static void main(String[] args) {
        String st = "This is great";

        char[] ch = st.toCharArray();

        System.out.println((ch));
    }
}
