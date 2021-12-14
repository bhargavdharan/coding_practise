class Example1 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before Incrementaion:\t" + a);
        ++a;
        System.out.println("Pre Inc:\t" + a);
        a++;
        System.out.println("Post Inc:\t" + a);
        ++a;
        System.out.println("Pre Inc:\t" + a);

    }
}

// output1
// Before Incrementaion:   5
// Pre Inc:        6
// Post Inc:       7
// Pre Inc:        8

class Example2 {
    public static void main(String[] args) {
        int a1 = 5;
        int b1;
        System.out.println("Before preInc:\t"+a1);
        // System.out.println("Before preInc:\t"+b1);
        b1 = ++a1;
        System.out.println("After preInc:\t" +a1);
        System.out.println("After preInc:\t" +b1);
        
        System.out.println("=============================");

        int a2 = 5;
        int b2;
        System.out.println("Before postInc:\t"+a2);
        // System.out.println("Before postInc:\t"+b2);
        b2 = a2++;
        System.out.println("After postInc:\t"+a2);
        System.out.println("After postInc:\t"+b2);
    }
}

class Example3 {
    public static void main(String[] args) {
        int a1 = 5;
        int b1;
        System.out.println("Before preInc:\t" + a1);
        // System.out.println("Before preInc:\t"+b1);
        b1 = ++a1 + ++a1;
        System.out.println("After preInc:\t" + a1);
        System.out.println("After preInc:\t" + b1);

        System.out.println("===========================");

        int a2 = 5;
        int b2;
        System.out.println("Before postInc:\t" + a2);
        b2 = a2++ + a2++;
        System.out.println("After postInc:\t" + a2);
        System.out.println("After postInc:\t" + b2);
    }
}

// output3

// Before preInc:  5
// After preInc:   7
// After preInc:   13
// ===========================
// Before postInc: 5
// After postInc:  7
// After postInc:  11

class Example4 {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = ++a + a++ + a++ + --a + a-- + --a + a++ + ++a;
        System.out.println("After values changed:\t"+a);
        System.out.println("After values changed:\t"+b);
    }

}

// output4
// After values changed:7
// After values changed:50

class Example5 {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("==========");
        for (int i = 1; i <= 5; i++) {
            // System.out.print("Java"+" ");
            System.out.println("Java"+" "+ i);
        }
    }
}