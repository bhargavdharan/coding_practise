// Write a program class Object, in which overload Area() method

class AreaOfGeometry {
    void area(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle:" + " " + area);
    }

    void area(int side) {
        int area = side * side;
        System.out.println("Area of Square:" + " " + area);
    }
    
    void area(float radius) {
        
        float area = (3.14f * radius * radius);
        System.out.println("Area of Circle:" + " " + area);
    }

    void area(float base, float height) {
        float area = (0.5f * height * base);
        System.out.println("Area of Triangle:" + " " + area);
    }
}

class Solution1 {
    public static void main(String[] args) {
        AreaOfGeometry a = new AreaOfGeometry();
        a.area(10, 20);
        a.area(10);
        a.area(5.6f);
        a.area( 10.6f,  20.4f);
    }
}