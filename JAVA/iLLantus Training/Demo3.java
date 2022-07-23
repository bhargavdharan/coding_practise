// 1.Single Inheritance : In single inheritance, subclass inherits the features of one superclass

// inheritance and polymorphism are used together in java to achieve fast performance and readability of code

import java.util.*;

class one{
    public void display() {
        System.out.println("I am a Parent Class");
    }
}

class two extends one {
    public void show() {
        System.out.println("I am a Child Class");
    }
}

class Solution2 {
    public static void main(String[] args) {
        two t1 = new two();
        t1.display();
        t1.show();
    }
}