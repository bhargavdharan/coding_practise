package OOPS;

class A {
    void sum(int a, int b) {
        System.out.println("Sum:" + " " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum:" + " " + (a + b + c));
    }

    void sum(float a, float b) {
        System.out.println("Sum:" + " " + (a + b));
    }

    void sum(int a, int b, int c, int d) {
        System.out.println("Sum:" + " " + (a + b + c + d));

    }
}

class Solution4 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.sum(10, 20);
        a1.sum(20, 20, 20);
        a2.sum(10.67f, 20.98f);
    }
}
