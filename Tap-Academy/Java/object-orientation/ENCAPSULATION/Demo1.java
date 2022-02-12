import java.util.Scanner;

class Car {
    // preventing direct access to data members by using private access
    private String name;
    private int mileage;
    private int cost;

    public void setData(String x, int y, int z) {
        name = x;
        mileage = y;
        cost = z;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCost() {
        return cost;
    }

}

class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car c = new Car();
        c.setData("BMW", 20, 700000);
        System.out.println(c.getName());
        System.out.println(c.getMileage());
        System.out.println(c.getCost());
    }
}
