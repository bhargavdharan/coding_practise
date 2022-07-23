import java.util.Scanner;

class Member {
    String Name;
    int age;
    int phone;
    String Address;
    int salary;

    void inputVal(String a, int b, int c, String d, int e) {
        Name = a;
        age = b;
        phone = c;
        Address = d;
        salary = e;
    }

    void printSalary(){
        System.out.println("Salary is " +salary);
    }
}

class Employee extends Member {
    String specialization;
    String department;

    void inputDetails(String a , String b) {
        specialization = a;
        department = b;
    }

    void jobDetails() {
        System.out.println(specialization + " in " + department);
    }
}

class Manager extends Member {
    String specialization;
    String department;

    void inputDetails(String a, String b) {
        specialization = a;
        department = b;
    }

    void jobDetails() {
        System.out.println(specialization + " in " + department);
    }
}

class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.inputVal("Akash Iyer", 22, 531026, "Pune", 25000);
        m.inputDetails("Associate Software Engineer", "IT Department");
        m.printSalary();
        m.jobDetails();
    }
}