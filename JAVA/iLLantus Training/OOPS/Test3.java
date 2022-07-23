package OOPS;

class ParentClass {
    void show() {
        System.out.println("I am a ParentClass Method");
    }

}

class ChildClass extends ParentClass
{
    void display() {
        System.out.println("I am a ChildClass Method");
    }
}



class Solution3
{
    public static void main(String[] args) {
        ChildClass b1 = new ChildClass();
        b1.show();
        b1.display();
    }
}