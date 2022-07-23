class Rect {
    // instance variables
    int height = 10, width = 20;

    public void area() {
        // local variables
        int height = 50, width = 20;
        int ar;
        ar = height * width;
        System.out.println("Area 1=" + ar);
        // using class level variable(instance)
        ar = this.height * this.width;
        System.out.println("Area 2=" + ar);
    }
}

class Solution6 {
    public static void main(String[] args) {
        // object instance
        Rect r = new Rect();
        r.area();
    }
}