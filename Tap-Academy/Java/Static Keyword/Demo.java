
class Car
{
    String name;

    String getName() {
        return name;
    }
}

class Demo
{
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.getName());
    }
}