
class Intro{
    public static void main(String[] args) {
        System.out.println("Hello, Java world!");
    }
}

class DeclareVar {
    public static void main(String[] args) {
        //String
        String name = "John";
        System.out.println("Created String Variable ==> " + name);
        //int
        int myInt = 25;
        System.out.println("Created Int Variable ==> " + myInt);
        //float
        float myFloat = 69.99f;
        System.out.println("Created Float Variable ==> " + myFloat);
        //char
        char myChar = 'D';
        System.out.println("Created Char Variable ==> " + myChar);
    }
    
}

class SizeOfDataTypes {
    public static void main(String[] args) {
        System.out.println("Size of int      :: " +(Integer.SIZE)/8 + " bytes.");
        System.out.println("Size of long     :: " +(Long.SIZE)/8 + " bytes.");
        System.out.println("Size of char     :: " +(Character.SIZE)/8 + " bytes.");
        System.out.println("Size of float    :: " +(Float.SIZE)/8 + " bytes.");
        System.out.println("Size of double   :: " +(Double.SIZE)/8 + " bytes.");
    }
}