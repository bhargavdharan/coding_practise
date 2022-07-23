// 4.Muliple Inheritance : In Multiple Inheritance, one class can have more than one superclass(derived class) and inherits features from all parent classes. 

// Note: java does not support multiple inheritance with classes we can achieve multiple inheritances only through interfaces.

interface one {
    public void printOne();
}

interface two {
    public void printTwo();
}

interface three extends one, two {
    public void printThree();
}

class child implements three {
    public void printOne() {
        System.out.println("I am a Parent Class 1");
    }

    public void printTwo() {
        System.out.println("I am a Parent Class 2");
    }

    public void printThree() {
        System.out.println("I am a Child Class");
    }
}

class Solution5 {
    public static void main(String[] args) {
        child c = new child();
        c.printOne();
        c.printTwo();
        c.printThree();
    }
}