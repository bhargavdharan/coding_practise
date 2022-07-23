package OOPS;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    String Address;

    // parameterized constructor
    void setValues(int x, String y, String z) {
        roll = x;
        name = y;
        Address = z;
    }

    // non-parameterized constructor
    void display() {
        System.out.println(roll+" "+name+" "+Address);
    }
}

class Admin {
    public static void main(String[] args) {
        School s1 = new School();
        s1.roll = 1;
        s1.name = "Dharan";
        s1.Address = "Vizag";
        s1.display();
        School s2 = new School();
        s2.setValues(2, "Vinay", "Hyderabad");
        s2.display();
        School s3 = new School();
        s3.setValues(3, "Ajay", "Vijayawada");
        s3.display();
    }
}