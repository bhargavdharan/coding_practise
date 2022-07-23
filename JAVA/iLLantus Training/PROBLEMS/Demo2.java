// package iLLantus Training.PROBLEMS;

// Write a program to define Abstract class area and declare abstract method areaCircle() then implement this method in child class 

abstract class Shape {
    abstract void shapeType();

    abstract void area(int length, int breadth);
}

class Demo2 extends Shape{

    void shapeType() {
        System.out.println("Area of Rectangle");
    }

    void area(int length,int breadth) {
        int area = length * breadth;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Shape s = new Demo2();
        s.shapeType();
        s.area(20, 30);
    }
}
