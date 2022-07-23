// Write a program to define interface Shape with abstract method 
// draw() and implement interface in Circle class, Rectangle class
//  and Square class and call it in main function. 

interface Shape {
    abstract void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle draws using Shape");
    }

}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle draws using Shape");
    }
}

class Square implements Shape{
    public void draw() {
       System.out.println("Square draws using Shape");
   }
}


public class Demo1 {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
    }
}
