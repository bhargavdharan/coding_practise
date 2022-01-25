// TYPE-1 Method(only input , no output)

class AddingType1 {
    int c;

    void add(int a, int b) {
        c = a + b;
        System.out.println("Sum is:\t" + c);
    }
}

class Demo1 {
    public static void main(String[] args) {
        AddingType1 ref = new AddingType1();
        int a, b;
        a = 10;
        b = 20;
        ref.add(a,b);
    }
}

// Type-2 Method(No input,Only output)

class AddingType2 {
    int a, b, c;

    int add(){
        a = 10;
        b = 20;
        c = a + b;
        return c;
    }
}

class Demo2 {
    public static void main(String[] args) {
        AddingType2 ref2 = new AddingType2();
        // int res = ref2.add();
        // System.out.println("Result:\t" + res);
        System.out.println("Result:\t" + ref2.add());
    }
}

//TYPE-3 : Method(Both Input & Output will given)
class AddingType3 {
    int c;

    int add(int x, int y) {
        c = x + y;
        return c;
    }
}

class Demo3 {
    public static void main(String[] args) {
        AddingType3 ref3 = new AddingType3();
        int a, b;
        a = 10;
        b = 20;
        int res = ref3.add(a, b);
        System.out.println("Addition:\t"+res);
    }
}