package OOPS;

import java.util.Scanner;

// write a program to define class Rectangle ,  declare two states hight and width and define method to calculate it area.

class Rectangle {
    int length;
    int breadth;

    void inputVal(int x, int y) {
        length = x;
        breadth = y;
    }

    void area() {
        System.out.println(length * breadth);
    }
}

class Solution {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.inputVal(10, 20);
        r1.area();
        Rectangle r2 = new Rectangle();
        r2.inputVal(100, 200);
        r2.area();
    }
}