class Car{
    String name;
    int cost;
    float milleage;
    void start(){
        System.out.println(name+ "\tcar was started....");
    };

    void accelerate() {
        System.out.println(name + "\tcar gets accelerated...");
    };
    void stop(){
        System.out.println(name + "\tcar gets stopped..");
    };
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "Nissan";
        c1.start();
        c1.accelerate();
        c1.stop();


        c2.name = "Suzuki";
        c2.start();
        c2.accelerate();
        c2.stop();
    }
}

class Dog {
    String name;
    String breed;
    int cost;

    void eatFood() {
        System.out.println(name + "\t eating food...");
    }

    void sleep() {
        System.out.println(name + "\t sleeping..");
    }

    void bark() {
        System.out.println(name + "\t barking....");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();  // tell JVM to created an object by using keyword new
        d1.name = "Rambo";
        d1.eatFood();
        d1.sleep();

        Dog d2 = new Dog();
        d2.name = "Rocky";
        d2.sleep();
        d2.bark();
   }
}