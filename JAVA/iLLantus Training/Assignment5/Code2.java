
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    void area() {
        System.out.println("Area of Rectangle : " + (length * breadth));
    }
    
    void perimeter() {
        System.out.println("Perimeter of Rectangle : " + 2*(length + breadth));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        Rectangle s = new Square(5);
        r.area();
        r.perimeter();
        s.area();
    }
}