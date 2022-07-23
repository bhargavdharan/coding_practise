
class Shape {
    void displayShape() {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape {
    void displayRect() {
        System.out.println("This is Rectangle Shape");
    }
}

class Square extends Rectangle {
    void displaySq() {
        System.out.println("Square is Rectangle");
    }
}

class Circle extends Shape{
    void displayCir() {
        System.out.println("This is Circular Shape");
    }
}

class Test {
    public static void main(String[] args) {
        Square s = new Square();
        s.displayShape();
        s.displayRect();
    }
}