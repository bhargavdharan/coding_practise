package Java.TypeCasting;


class TypeCasting1 {
    public static void main(String[] args) {
        byte a = 45;
        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);
    }
}

class TypeCasting2 {
    public static void main(String[] args) {
        byte a;
        double b = 45.5;
        a = (byte)b;
        System.out.println(a);
        System.out.println(b);
    }
}

class TypeCasting3 {
    public static void main(String[] args) {
        double a = 129;
        byte b = (byte) a;

        System.out.println(a);
        System.out.println(b);
    }
}

class TypeCasting4 {
    public static void main(String[] args) {
        double a = 130;
        byte b = (byte) a;

        System.out.println(a);
        System.out.println(b);
    }
}

class TypeCasting5{
    public static void main(String[] args) {
        double a = -130;
        byte b = (byte) a;

        System.out.println(a);
        System.out.println(b);
    }
}


