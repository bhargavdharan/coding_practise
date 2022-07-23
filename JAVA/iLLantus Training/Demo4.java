// 2.Multilevel inheritance : In multiple inheritance, a derived class will be inheriting a base class as well as the derived class also act as the base class to other class. 

import java.util.*;

class one {
    public void display1() {
        System.out.println("I am a Parent Class");
    }
}

class two extends one {
    public void show() {
        System.out.println("I am a Child Class");
    }
}

class three extends two {
    public void display2() {
        System.out.println("I am a Parent Class");
    }
}

class Solution3 {
    public static void main(String[] args) {
        three t = new three();
        t.display1();
        t.show();
        t.display2();
    }
}